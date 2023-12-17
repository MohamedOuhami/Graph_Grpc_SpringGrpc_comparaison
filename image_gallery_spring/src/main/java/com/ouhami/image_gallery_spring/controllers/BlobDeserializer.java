package com.ouhami.image_gallery_spring.controllers;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

@JsonComponent
@JsonDeserialize(using = BlobDeserializer.class)
public class BlobDeserializer extends JsonDeserializer<Blob> {

    @Override
    public Blob deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        try {
            byte[] bytes = jsonParser.getBinaryValue();
            return new javax.sql.rowset.serial.SerialBlob(bytes);
        } catch (SQLException e) {
            throw new IOException("Error creating Blob from byte array", e);
        }
    }
}
