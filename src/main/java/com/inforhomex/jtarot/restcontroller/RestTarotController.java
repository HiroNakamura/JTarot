package com.inforhomex.jtarot.restcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.inforhomex.jtarot.model.Carta;

@RequestMapping("jtarotapi")
@RestController
public class RestTarotController{
    
    //http://localhost:8090/jtarotapi/saludo
    @GetMapping("/saludo")
    public String saludo(){
    	return new String("Bienvenido a JTarot!!");
    }

    //http://localhost:8090/jtarotapi/carta
    @PostMapping("/carta")
    public Carta crear(@RequestBody Carta carta){
    	return carta;
    }
}