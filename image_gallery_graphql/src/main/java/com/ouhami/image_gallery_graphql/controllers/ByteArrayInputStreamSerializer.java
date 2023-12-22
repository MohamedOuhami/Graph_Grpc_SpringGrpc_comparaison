package com.ouhami.image_gallery_graphql.controllers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@JsonComponent
public class ByteArrayInputStreamSerializer extends JsonSerializer<ByteArrayInputStream> {

    @Override
    public void serialize(ByteArrayInputStream value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        byte[] bytes = value.readAllBytes();
        gen.writeBinary(bytes);
    }
}
