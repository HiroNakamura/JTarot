package com.inforhomex.jtarot.restcontroller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.inforhomex.jtarot.model.Carta;
import com.inforhomex.jtarot.service.impl.CartaServImpl;

@RequestMapping("jtarotapi")
@RestController
public class RestTarotController{

    @Autowired
    @Qualifier("cartaService")
    private CartaServImpl cartaService;
    
    //http://localhost:8090/jtarotapi/saludo
    @GetMapping("/saludo")
    public String saludo(){
    	return new String("Bienvenido a JTarot!!");
    }

    //http://localhost:8090/jtarotapi/carta
    @PostMapping("/carta")
    public Carta crear(@RequestBody Carta carta){
    	return this.cartaService..save(carta);
    }

    //http://localhost:8090/jtarotapi/cartas
    @GetMapping("/cartas")
    public List<Carta> getAllCartas(){
        return this.cartaService.getAllCartas();
    }
}