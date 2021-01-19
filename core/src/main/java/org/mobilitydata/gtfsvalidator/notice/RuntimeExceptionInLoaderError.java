package org.mobilitydata.gtfsvalidator.notice;

import com.google.common.collect.ImmutableMap;

/**
 * Describes a runtime exception during loading a table. This normally indicates
 * a bug in validator code.
 */
public class RuntimeExceptionInLoaderError extends SystemError {
    public RuntimeExceptionInLoaderError(String filename,
                                         String exceptionClassName,
                                         String message) {
        super(ImmutableMap.of("filename", filename, "exception",
                              exceptionClassName, "message", message));
    }

    @Override
    public String getCode() {
        return "runtime_exception_in_loader";
    }
}
