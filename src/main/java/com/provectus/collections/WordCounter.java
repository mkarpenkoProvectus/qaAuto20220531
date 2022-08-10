package com.provectus.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WordCounter {
  public static void main(String[] args) {
    String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel eros non lorem viverra volutpat. Sed interdum viverra magna, eget pulvinar nisi dignissim quis. Maecenas et congue ex, convallis feugiat lacus. Quisque finibus magna euismod, ornare risus et, porta enim. In euismod erat risus, a bibendum purus aliquet et. Curabitur sollicitudin sit amet turpis vel elementum. Vivamus in arcu quis tortor pulvinar dictum. Donec rutrum et turpis tempus ornare. Donec sed lorem at mi porttitor consequat in at urna. Maecenas quam quam, malesuada at eros et, sodales convallis metus. Etiam felis quam, euismod at mi non, sodales ullamcorper nibh. Suspendisse potenti. Donec posuere erat massa. Fusce id dapibus ligula, eget semper nunc. Sed sollicitudin dolor sollicitudin, rutrum quam ac, bibendum arcu. Aliquam erat volutpat. Phasellus ultricies lacus massa, sit amet interdum quam aliquam sed. Nam quis convallis nulla. In suscipit odio vitae ipsum molestie consequat. Nunc et dolor dolor. Suspendisse vel tristique magna. Integer vel ornare dolor, et ultrices magna. Aenean id commodo eros. In mattis ante at vestibulum ultricies. Etiam malesuada ipsum purus, eget molestie lacus convallis ac. Cras in dui turpis. Mauris aliquam rhoncus dolor ut euismod. Suspendisse ac tortor vitae nulla pellentesque tincidunt sit amet at erat.";
    String[] words = input.split(" ");

    Map<String, Integer> wordCountMap = new HashMap<>();
    for (String word : words) {
      word = word.replace(".", "").replace(",", "").toLowerCase();

      if (wordCountMap.containsKey(word)) {
        int count = wordCountMap.get(word);
        wordCountMap.put(word, ++count);
      } else {
        wordCountMap.put(word, 1);
      }
    }

    System.out.println(wordCountMap);
  }
}
