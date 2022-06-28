package sky.exam;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class BedParamException extends RuntimeException {
    public BedParamException(String message) {
        super(message);
    }
}
