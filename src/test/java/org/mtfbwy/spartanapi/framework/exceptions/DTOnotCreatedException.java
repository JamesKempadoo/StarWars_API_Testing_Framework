package org.mtfbwy.spartanapi.framework.exceptions;

public class DTOnotCreatedException extends RuntimeException {
    public DTOnotCreatedException(String wsdsd) {
        super(wsdsd);
    }
}
