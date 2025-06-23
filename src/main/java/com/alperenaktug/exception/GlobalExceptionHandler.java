package com.alperenaktug.exception;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    private List<String> addMapValue (List<String> list , String newValue) {
        list.add(newValue);
        return list;
    }

    @ExceptionHandler(value =  MethodArgumentNotValidException.class )
    public void handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        Map<String , List<String>> errorsMap = new HashMap<>();
        for (ObjectError objectError : ex.getBindingResult().getAllErrors()) {
           String fieldName =  ((FieldError)objectError).getField();
           if (errorsMap.containsKey(fieldName)) {

           }else {

           }
        }

    }

}
