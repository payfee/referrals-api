package referralsApi.common.exception;

import referralsApi.common.Errors;

public class ResourceNotFoundException extends CustomErrorException {

    public ResourceNotFoundException(String resource) {
        super(Errors.ERR0003, resource);
    }

}
