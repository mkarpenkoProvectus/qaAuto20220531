package com.provectus.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileEx {
  public static void main(String[] args) throws IOException {
    File file = new File("src/main/resources/testfile.txt");


    List<String> lines = Files.readAllLines(file.toPath());

//    System.out.println(lines);
    List<String> header = Arrays.stream(lines.get(0).split(",")).collect(Collectors.toList());

    List<Map<String, String>> parsedValues = new ArrayList<>();
    for (int i=1; i<lines.size(); i++) {
      Map<String, String> valuesMap = new HashMap<>();
      List<String> values = Arrays.stream(lines.get(i).split(",")).collect(Collectors.toList());
      for (int j=0; j<values.size(); j++) {
        valuesMap.put(header.get(j), values.get(j));
      }
      parsedValues.add(valuesMap);
    }

    System.out.println(parsedValues);

//    Files.write(file.toPath(), lines);
  }
}
