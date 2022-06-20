package com.justin.RESTAPI.Java.REST.API.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

@RequestMapping(value = "/", method = RequestMethod.GET)
public String getMain(){ return "Hello main!"; }
}
