package com.marketplace.controlleradvice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import exception.usuarioexception.UsuarioNullException;

@ControllerAdvice
public class UsuarioControllerAdvice  extends ResponseEntityExceptionHandler{
    
     
    @ExceptionHandler(UsuarioNullException.class)
    public ResponseEntity<Object> usuarioErroNull(){

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Preencha todos os campos!");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }


}
