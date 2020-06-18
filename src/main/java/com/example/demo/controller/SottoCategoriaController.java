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

import com.example.demo.model.Area;
import com.example.demo.model.SottoCategoria;
import com.example.demo.service.AreaService;
import com.example.demo.service.SottoCategoriaService;

@Controller
@RequestMapping(value = "/SottoCategoria")
public class SottoCategoriaController {

	@Autowired
	SottoCategoriaService sottoCategoriaService;
	
	@Autowired
	AreaService areaService;

	@GetMapping (value = "/ListaSottoCategorie")
	public ModelAndView listaSottoCategorie() {
		ModelAndView model = new ModelAndView("SottoCategoria/ListaSottoCategorie");
		List<SottoCategoria> listaSottoCategorie = sottoCategoriaService.getAllSottoCategorie();
		model.addObject("elencoSottoCategorie", listaSottoCategorie);
		return model;
	}

	@GetMapping (value = "/AddSottoCategoria")
	public ModelAndView addSottoCategoria() {
		ModelAndView model = new ModelAndView();
		SottoCategoria oSottoCategoria = new SottoCategoria();
		model.addObject("oSottoCategoria", oSottoCategoria);
		model.setViewName("/SottoCategoria/AddEditSottoCategoria");
		List<Area> listaAree = areaService.getAllAree();
		model.addObject("elencoAree", listaAree);
		return model;
	}

	@GetMapping (value = "/EditSottoCategoria/{id}")
	public ModelAndView editSottoCategoria(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("SottoCategoria/AddEditSottoCategoria");
		SottoCategoria oSottoCategoria = sottoCategoriaService.getSottoCategoriaById(id);
		model.addObject("oSottoCategoria", oSottoCategoria);
		model.setViewName("/SottoCategoria/AddEditSottoCategoria");
		List<Area> listaAree = areaService.getAllAree();
		model.addObject("elencoAree", listaAree);
		return model;
	}

	@PostMapping (value = "/SaveSottoCategoria")
	public ModelAndView saveSottoCategoria(@Valid @ModelAttribute("oggettoSottoCategoria") SottoCategoria oSottoCategoria, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("SottoCategoria/AddEditSottoCategoria");
			return model;
		} else {
			sottoCategoriaService.saveOrUpdate(oSottoCategoria);
			return new ModelAndView("redirect:/SottoCategoria/ListaSottoCategorie");
		}
	}
	
	@GetMapping (value = "/DeleteSottoCategoria/{id}")
	public ModelAndView deleteSottoCategoria(@PathVariable("id") Integer id) {
		sottoCategoriaService.deleteSottoCategoria(id);
		return new ModelAndView("redirect:/SottoCategoria/ListaSottoCategorie");
	}
}