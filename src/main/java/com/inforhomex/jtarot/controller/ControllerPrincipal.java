package com.inforhomex.jtarot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inforhomex.jtarot.service.Calculable;

@Controller
@RequestMapping("/jtarot")
public class ControllerPrincipal{

	@Autowired
    private Calculable calculable;
	
	//http://localhost:8090/jtarot/index
	@GetMapping("/index")
    public String index(){
        return "index";
    }

    //http://localhost:8090/jtarot/calcularTarot
    @GetMapping("/calcularTarot")
    public String getTuCarta(@RequestParam("nombre") String nombre, @RequestParam("fecha") String fecha, Model model){
    	String datos = calculable.getCalculo(nombre,fecha);
    	String carta = calculable.getTarot(nombre,fecha);
    	model.addAttribute("datos",datos);
    	model.addAttribute("carta",carta);
        return "carta";
    }



}
