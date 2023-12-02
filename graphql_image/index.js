const express = require('express');
const { graphqlHTTP } = require('express-graphql');
const { buildSchema } = require('graphql');
const mysql = require('mysql2/promise');
const cors = require('cors');

// Define GraphQL schema
const schema = buildSchema(`
  type Query {
    images: [Image]
  }

  type Image {
    id: Int
    data: String
  }
`);

// Create MySQL connection pool (replace with your database credentials)
const pool = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'ensaj_photo_comp',
  waitForConnections: true,
  connectionLimit: 10,
  port: 3310,
  queueLimit: 0
});

// Define the root resolver
const root = {
  images: async () => {
    try {
      const connection = await pool.getConnection();
      const [rows] = await connection.query('SELECT id, data FROM images');
      connection.release();

      // Convert Buffer to base64 string
      const images = rows.map(row => ({
        id: row.id,
        data: row.data.toString('base64'),
      }));

      return images;
    } catch (error) {
      console.error('Error fetching images from database:', error);
      return [];
    }
  },
};

// Create Express app
const app = express();

// Enable CORS for all routes
app.use(cors());

// Set up GraphQL endpoint with explicit CORS handling
app.use('/graphql', cors(), graphqlHTTP({
  schema: schema,
  rootValue: root,
  graphiql: true,
}));

// Serve static files (including HTML)
app.use(express.static('public'));

// Start the server
const port = 3000;
app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}/graphql`);
});
