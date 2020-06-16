package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/Archivio")
public class ArchivioController {

	@GetMapping(value = "/Lista")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("Menu/ListaArchivi");
		return model;
	}
}
