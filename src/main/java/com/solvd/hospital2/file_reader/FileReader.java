package com.solvd.hospital2.file_reader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FileReader {

    private static final Logger LOGGER = LogManager.getLogger(FileReader.class);

    public static void main(String[] args) throws IOException {

        File mobyDick = new File("src\\main\\resources\\MobyDick.txt");

        String book = FileUtils.readFileToString(mobyDick, "UTF-8");
        book = book.toLowerCase();
        book = book.replaceAll("[^a-z]", " ");

        String[] docSeparate = StringUtils.split(book);
        List<String> text = new ArrayList<>(Arrays.asList(docSeparate));

        Map<String, Integer> bookMap = new HashMap<>();
        for (String word : text) {
            if (bookMap.containsKey(word)) {
                bookMap.put(word, bookMap.get(word) + 1);
            } else {
                bookMap.put(word, 1);
            }
        }
        bookMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

        Map<String, Integer> result = bookMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for (Map.Entry<String, Integer> i : result.entrySet()) {
            LOGGER.debug(i);
        }
        FileUtils.writeLines(new File("src\\main\\resources\\SortWords.txt"), result.entrySet());
    }
}


