package com.pantanal.projetocrud.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String grettingMessage(@PathVariable String nome) {

        double nota1 = 9;
        double nota2 = 8;
        double media = (nota1 + nota2)/2;

        return "Hello " + nome + " Sua média é: "+media;
    }

    //localhost:8080/messages/Bruno Moura
}
