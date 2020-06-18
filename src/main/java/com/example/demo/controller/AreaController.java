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

import com.example.demo.model.AnnoContabile;
import com.example.demo.model.Area;
import com.example.demo.service.AnnoContabileService;
import com.example.demo.service.AreaService;

@Controller
@RequestMapping(value = "/Area")
public class AreaController {

	@Autowired
	AreaService areaService;
	
	@Autowired
	AnnoContabileService annoContabileService;

	@GetMapping (value = "/ListaAree")
	public ModelAndView listaAree() {
		ModelAndView model = new ModelAndView("Area/ListaAree");
		List<Area> listaAree = areaService.getAllAree();
		model.addObject("elencoAree", listaAree);
		return model;
	}

	@GetMapping (value = "/AddArea")
	public ModelAndView addArea() {
		ModelAndView model = new ModelAndView();
		Area oArea = new Area();
		model.addObject("oArea", oArea);
		model.setViewName("/Area/AddEditArea");
		List<AnnoContabile> listaAnniContabili = annoContabileService.getAllAnniContabili();
		model.addObject("elencoAnniContabili", listaAnniContabili);
		return model;
	}

	@GetMapping (value = "/EditArea/{id}")
	public ModelAndView editArea(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("Area/AddEditArea");
		Area oArea = areaService.getAreaById(id);
		model.addObject("oArea", oArea);
		model.setViewName("/Area/AddEditArea");
		List<AnnoContabile> listaAnniContabili = annoContabileService.getAllAnniContabili();
		model.addObject("elencoAnniContabili", listaAnniContabili);
		return model;
	}

	@PostMapping (value = "/SaveArea")
	public ModelAndView saveArea(@Valid @ModelAttribute("oggettoArea") Area oArea, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("Area/AddEditArea");
			return model;
		} else {
			areaService.saveOrUpdate(oArea);
			return new ModelAndView("redirect:/Area/ListaAree");
		}
	}
	
	@GetMapping (value = "/DeleteArea/{id}")
	public ModelAndView deleteArea(@PathVariable("id") Integer id) {
		areaService.deleteArea(id);
		return new ModelAndView("redirect:/Area/ListaAree");
	}
}