package frequency.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CheckFrequencyService {

    public Map<Character, Long> checkFrequency (String string) {
        Map<Character, Long> characterFrequencyOne = string.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        characterFrequencyOne.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        return finalMap;
    }
}
