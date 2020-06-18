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

import com.example.demo.model.AreaGeo;
import com.example.demo.service.AreaGeoService;

@Controller
@RequestMapping(value = "/AreaGeo")
public class AreaGeoController {

	@Autowired
	AreaGeoService areaGeoService;

	@GetMapping (value = "/ListaAreeGeo")
	public ModelAndView listaAreeGeo() {
		ModelAndView model = new ModelAndView("AreaGeo/ListaAreeGeo");
		List<AreaGeo> listaAreeGeo = areaGeoService.getAllAreeGeo();
		model.addObject("elencoAreeGeo", listaAreeGeo);
		return model;
	}

	@GetMapping (value = "/AddAreaGeo")
	public ModelAndView addAreaGeo() {
		ModelAndView model = new ModelAndView();
		AreaGeo oAreaGeo = new AreaGeo();
		model.addObject("oAreaGeo", oAreaGeo);
		model.setViewName("/AreaGeo/AddEditAreaGeo");
		return model;
	}

	@GetMapping (value = "/EditAreaGeo/{id}")
	public ModelAndView editAreaGeo(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("AreaGeo/AddEditAreaGeo");
		AreaGeo oAreaGeo = areaGeoService.getAreaGeoById(id);
		model.addObject("oAreaGeo", oAreaGeo);
		model.setViewName("/AreaGeo/AddEditAreaGeo");
		return model;
	}

	@PostMapping (value = "/SaveAreaGeo")
	public ModelAndView saveAreaGeo(@Valid @ModelAttribute("oggettoAreaGeo") AreaGeo oAreaGeo, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("AreaGeo/AddEditAreaGeo");
			return model;
		} else {
			areaGeoService.saveOrUpdate(oAreaGeo);
			return new ModelAndView("redirect:/AreaGeo/ListaAreeGeo");
		}
	}
	
	@GetMapping (value = "/DeleteAreaGeo/{id}")
	public ModelAndView deleteAreaGeo(@PathVariable("id") Integer id) {
		areaGeoService.deleteAreaGeo(id);
		return new ModelAndView("redirect:/AreaGeo/ListaAreeGeo");
	}
}