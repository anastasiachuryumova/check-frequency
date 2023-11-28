package frequency.model;

import java.util.Map;

public class ResultBuilder {

    private ResultBuilder() {
    }

    public static ApiResult getResult( Map<Character, Long> result ) {
        return ApiResult.withResult(result.toString());
    }

    public static ApiResult getResultFromError(String errorMessage) {
        return ApiResult.withError(errorMessage);
    }
}
