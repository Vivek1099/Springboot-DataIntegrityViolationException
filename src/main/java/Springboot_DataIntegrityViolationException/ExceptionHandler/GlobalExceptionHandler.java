package Springboot_DataIntegrityViolationException.ExceptionHandler;

import jakarta.validation.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> handleUniqueMobileNumber(DataIntegrityViolationException ex, WebRequest webRequest)
    {
        String errorMessage = "Phone Number Already Exist";
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

}
