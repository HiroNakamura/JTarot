package com.inforhomex.jtarot.restcontroller;

import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/tarotapi")
@RestController
public class RestTarotController{
    
    //http://localhost:8090/tarotapi/saludo
    @GetMapping("saludo")
    public String saludo(){
        return new String("Bienvenidos a JTarot");
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("jtarotapi")
@RestController
public class RestTarotController{
    
    //http://localhost:8090/jtarotapi/saludo
    @GetMapping("/saludo")
    public String saludo(){
    	return new String("Bienvenido a JTarot!!");
    }

    //http://localhost:8090/jtarotapi/carta
    @GetMapping("/carta")
    public com.inforhomex.jtarot.model.Carta crear(){
    	com.inforhomex.jtarot.model.Carta carta = new com.inforhomex.jtarot.model.Carta();
    	carta.setId(1);
    	carta.setNumero(4);
    	carta.setNombre("EL EMPERADOR");
    	carta.setDescripcion("La carta del empeador de las barajas del Tarot.");
    	return carta;
>>>>>>> bacd4382762dd4f8701b0817ea4fb30961b36229
    }
}