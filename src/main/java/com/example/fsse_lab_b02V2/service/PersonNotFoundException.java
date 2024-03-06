package com.example.fsse_lab_b02V2.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "sth not found")
public class PersonNotFoundException extends RuntimeException {
}
