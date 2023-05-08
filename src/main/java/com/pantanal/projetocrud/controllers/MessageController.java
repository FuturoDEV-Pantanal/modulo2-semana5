package com.pantanal.projetocrud.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String grettingMessage(@PathVariable String nome) {
        return "Hello " + nome + "!";
    }

    //localhost:8080/messages/Bruno Moura
}
