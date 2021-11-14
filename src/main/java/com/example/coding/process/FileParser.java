package com.example.coding.process;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Data
@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileParser {

    Map<String, String> unknownFields = new HashMap<>();

    @JsonProperty("ts")
    private Timestamp timestamp;

    @JsonProperty("pt")
    private Integer processingTime;

    @JsonProperty("si")
    private String sessionID;

    @JsonProperty("uu")
    private String userUUID;

    @JsonProperty("bg")
    private String businessUUID;

    @JsonProperty("sha")
    private String sha256;

    @JsonProperty("nm")
    private String fileName;

    @JsonProperty("ph")
    private String path;

    @JsonProperty("dp")
    private String disposition;

    // Capture all other fields that Jackson do not match other members
    @JsonAnyGetter
    public Map<String, String> otherFields() {
        return unknownFields;
    }

    @JsonAnySetter
    public void setOtherField(String name, String value) {
        unknownFields.put(name, value);
    }
}
