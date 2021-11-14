package com.example.coding.process;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionCounterTest {

    @Test
    void testDuplicateFiles() {
        Map<String, Integer> extensionMap = ExtensionCounter.processExtensions("src/main/resources/sampleData.jsonl");
        assertEquals(2, extensionMap.size());
        assertEquals(1, extensionMap.get("pdf"));
        assertEquals(1,  extensionMap.get("ext"));

    }

    @Test
    void testEmptyExtension() {
        Map<String, Integer> extensionMap = ExtensionCounter.processExtensions("src/main/resources/emptyExtension.jsonl");
        assertEquals(2, extensionMap.size());
        assertEquals(1, extensionMap.get("ext"));
        assertEquals(2, extensionMap.get(""));
    }

    @Test
    void testInvalidOrMalformedJson() {
        Map<String, Integer> extensionMap = ExtensionCounter.processExtensions("src/main/resources/malformedJson.jsonl");
        assertEquals(0, extensionMap.size());
    }

    @Test
    void testInvalidFieldJson() {
        Map<String, Integer> extensionMap = ExtensionCounter.processExtensions("src/main/resources/invalidField.jsonl");
        assertEquals(2, extensionMap.size());
    }

    @Test
    void testNonExistentFile() {
        Map<String, Integer> extensionMap = ExtensionCounter.processExtensions("src/main/resources/invalidField222.jsonl");
        assertEquals(0, extensionMap.size());
    }

    @Test
    void testDoubleDotInNameOfFile() {
        Map<String, Integer> extensionMap = ExtensionCounter.processExtensions("src/main/resources/doubleDotInFileName.jsonl");
        assertEquals(3, extensionMap.size());
        assertEquals(1,  extensionMap.get("pdf"));
        assertEquals(1,  extensionMap.get("xls"));
        assertEquals(1,  extensionMap.get("txt"));

    }

}

