package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControler {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return "HOLA MUNDO";
    }
    @RequestMapping(value ={ "/holaMundo","/Prueba","Test"},method = RequestMethod.GET)
    public String holaMundo(){
        return "hola";
    }

}
