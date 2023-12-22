import React from "react";
import { useQuery, gql } from "@apollo/client";

const IMAGES_QUERY = gql`
  {
    images {
      id
      imageDataString
    }
  }
`;

export default function App() {
  const { data, loading, error } = useQuery(IMAGES_QUERY);

  if (loading) return "Loading...";
  if (error) return <pre>{error.message}</pre>;

  return (
    <div>
      <h1>Images</h1>
      <ul>
        {data.images.map((image) => (
          <li key={image.id}>
            {/* Assuming imageData is a base64-encoded string */}
            <img src={`data:image/jpeg;base64,${image.imageDataString}`} alt={`Image ${image.id}`} />
          </li>
        ))}
      </ul>
    </div>
  );
}
