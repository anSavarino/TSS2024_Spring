package com.savarino.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.savarino.services.ProdottiService;

@Controller
public class ProdottiMVC {

	@Autowired
	ProdottiService service;
	
	@GetMapping("prodotti")
	public String getProdotti(Model m) {
		m.addAttribute("titolo", "Elenco prodotti disponibili");
		m.addAttribute("products", service.getProdotti());
//		service.getProdotti().forEach(System.out::println);
		return "prodotti";
	}
	
}
