package frequency.controller;

import frequency.model.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import frequency.service.CheckFrequencyService;

import java.util.Map;

import static frequency.model.ResultBuilder.getResult;
import static frequency.model.ResultBuilder.getResultFromError;

@RestController
@RequestMapping("/frequency-check")
public class CheckFrequencyController {

    private final CheckFrequencyService checkFrequencyService;

    public CheckFrequencyController( CheckFrequencyService checkFrequency) {
        checkFrequencyService = checkFrequency;
    }

    @GetMapping("/frequency/{string}")
    public ApiResult factorial(@PathVariable String string ) {
        try {
            Map<Character, Long> result = checkFrequencyService.checkFrequency(string);
            return getResult(result);
        } catch (Exception e) {
            return getResultFromError(e.getMessage());
        }
    }
}
