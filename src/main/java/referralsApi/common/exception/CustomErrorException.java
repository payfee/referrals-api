package referralsApi.common.exception;

import referralsApi.common.Errors;
import lombok.Getter;

@Getter
public class CustomErrorException extends RuntimeException {

    private final Errors error;

    public CustomErrorException(Errors error, String resource) {
        super(String.format(error.getMessage(), resource));
        this.error = error;
    }
}
