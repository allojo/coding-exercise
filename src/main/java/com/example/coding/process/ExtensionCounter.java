package com.example.coding.process;

import com.example.coding.app.CodingApplication;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtensionCounter {

    private static final Logger logger =  LoggerFactory.getLogger(CodingApplication.class);

    final String filePath;
    public ExtensionCounter(String filePath) {
        this.filePath=filePath;
    }

    public static Map<String, Integer> processExtensions(String filePath) {
        JsonFactory jsonFactory = new JsonFactory();
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Integer> extensionCounter = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            MappingIterator<FileParser> fileParserMappingIterator = objectMapper.readValues(jsonFactory.createParser(bufferedReader), FileParser.class);
            List<String> extensionList = fileParserMappingIterator.readAll().parallelStream().map(FileParser::getFileName).distinct().map(fileName -> {
                int lastIndexOf = fileName.lastIndexOf(".");
                if (lastIndexOf == -1) {
                    return ""; // empty extension
                }
                return fileName.substring(lastIndexOf + 1);
            }).collect(Collectors.toList());
            logger.info(" {} Valid Files", (long) extensionList.size());
            extensionCounter = extensionList.parallelStream()
                    .collect(Collectors.toMap(ext -> ext, ext -> 1, Integer::sum));
            logger.info("Final List {}", extensionCounter);
        } catch (JsonParseException jspe) {
            logger.error(jspe.getMessage());
        } catch (IOException ioe){
            logger.error(ioe.getMessage());
        }

        return extensionCounter;
    }
}
