package frequency;

import frequency.service.CheckFrequencyService;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckFrequencyServiceTest {

    private CheckFrequencyService checkFrequency = new CheckFrequencyService();
    private final String FIRST_STRING = "aaaaabcccc";
    private final String SECOND_STRING = "kkkkkkkk+++sdjflurgurguerjdasbsvshdTYUCCDFFFRG^&(&$#^^%$&^%@##8982523563215555555587123";

    @Test
    void checkFrequencyOne () {

        Map<Character, Long> map = new LinkedHashMap<>();
        map.put('a', 5L);
        map.put('c', 4L);
        map.put('b', 1L);

        assertEquals(map.toString(), checkFrequency.checkFrequency(FIRST_STRING).toString());
    }

    @Test
    void checkFrequencyTwo () {

        Map<Character, Long> map = new LinkedHashMap<>();
        map.put('5', 10L);
        map.put('k', 8L);
        map.put('^', 4L);
        map.put('2', 4L);
        map.put('s', 4L);
        map.put('F', 3L);
        map.put('#', 3L);
        map.put('d', 3L);
        map.put('&', 3L);
        map.put('+', 3L);
        map.put('r', 3L);
        map.put('3', 3L);
        map.put('u', 3L);
        map.put('8', 3L);
        map.put('C', 2L);
        map.put('$', 2L);
        map.put('%', 2L);
        map.put('g', 2L);
        map.put('j', 2L);
        map.put('1', 2L);
        map.put('@', 1L);
        map.put('D', 1L);
        map.put('G', 1L);
        map.put('R', 1L);
        map.put('T', 1L);
        map.put('U', 1L);
        map.put('Y', 1L);
        map.put('a', 1L);
        map.put('b', 1L);
        map.put('e', 1L);
        map.put('f', 1L);
        map.put('(', 1L);
        map.put('h', 1L);
        map.put('l', 1L);
        map.put('6', 1L);
        map.put('v', 1L);
        map.put('7', 1L);
        map.put('9', 1L);

        assertEquals(map.toString(), checkFrequency.checkFrequency(SECOND_STRING).toString());
    }
}
