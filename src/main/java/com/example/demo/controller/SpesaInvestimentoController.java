package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.SottoCategoria;
import com.example.demo.model.SpesaInvestimento;
import com.example.demo.service.SottoCategoriaService;
import com.example.demo.service.SpesaInvestimentoService;

@Controller
@RequestMapping(value = "/SpesaInvestimento")
public class SpesaInvestimentoController {

	@Autowired
	SpesaInvestimentoService spesaInvestimentoService;
	
	@Autowired
	SottoCategoriaService sottoCategoriaService;

	@GetMapping (value = "/ListaSpeseInvestimento")
	public ModelAndView listaSpeseInvestimento() {
		ModelAndView model = new ModelAndView("SpesaInvestimento/ListaSpeseInvestimento");
		List<SpesaInvestimento> listaSpeseInvestimento = spesaInvestimentoService.getAllSpeseInvestimento();
		model.addObject("elencoSpeseInvestimento", listaSpeseInvestimento);
		return model;
	}

	@GetMapping (value = "/AddSpesaInvestimento")
	public ModelAndView addSpesaInvestimento() {
		ModelAndView model = new ModelAndView();
		SpesaInvestimento oSpesaInvestimento = new SpesaInvestimento();
		model.addObject("oSpesaInvestimento", oSpesaInvestimento);
		model.setViewName("/SpesaInvestimento/AddEditSpesaInvestimento");
		List<SottoCategoria> listaSottocategorie = sottoCategoriaService.getAllSottoCategorie();
		model.addObject("elencoSottocategorie", listaSottocategorie);
		return model;
	}

	@GetMapping (value = "/EditSpesaInvestimento/{id}")
	public ModelAndView editSpesaInvestimento(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("SpesaInvestimento/AddEditSpesaInvestimento");
		SpesaInvestimento oSpesaInvestimento = spesaInvestimentoService.getSpesaInvestimentoById(id);
		model.addObject("oSpesaInvestimento", oSpesaInvestimento);
		model.setViewName("/SpesaInvestimento/AddEditSpesaInvestimento");
		List<SottoCategoria> listaSottocategorie = sottoCategoriaService.getAllSottoCategorie();
		model.addObject("elencoSottocategorie", listaSottocategorie);
		return model;
	}

	@PostMapping (value = "/SaveSpesaInvestimento")
	public ModelAndView saveSpesaInvestimento(@Valid @ModelAttribute("oggettoSpesaInvestimento") SpesaInvestimento oSpesaInvestimento, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("SpesaInvestimento/AddEditSpesaInvestimento");
			return model;
		} else {
			spesaInvestimentoService.saveOrUpdate(oSpesaInvestimento);
			return new ModelAndView("redirect:/SpesaInvestimento/ListaSpesaInvestimento");
		}
	}
	
	@GetMapping (value = "/DeleteSpesaInvestimento/{id}")
	public ModelAndView deleteSpesaInvestimento(@PathVariable("id") Integer id) {
		spesaInvestimentoService.deleteSpesaInvestimento(id);
		return new ModelAndView("redirect:/SpesaInvestimento/ListaSpeseInvestimento");
	}
}