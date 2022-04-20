package com.example.qrcore.controllers.handlers

import org.springframework.http.HttpStatus

import org.springframework.http.ResponseEntity

import javax.servlet.http.HttpServletResponse

import javax.servlet.http.HttpServletRequest

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class BadRequestExceptionHandler {
    @ExceptionHandler(Exception::class)
    fun handle(
        ex: Exception?,
        request: HttpServletRequest?, response: HttpServletResponse?
    ): ResponseEntity<Any> {
         if (ex is NullPointerException) {
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex)
        }
    }
}