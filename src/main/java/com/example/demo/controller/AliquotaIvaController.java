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

import com.example.demo.model.AliquotaIva;
import com.example.demo.service.AliquotaIvaService;


@Controller
@RequestMapping(value = "/AliquotaIva")
public class AliquotaIvaController {

	@Autowired
	AliquotaIvaService aliquotaIvaService;

	@GetMapping (value = "/ListaAliquoteIva")
	public ModelAndView listaAliquoteIva() {
		ModelAndView model = new ModelAndView("AliquotaIva/ListaAliquoteIva");
		List<AliquotaIva> listaAliquoteIva = aliquotaIvaService.getAllAliquoteIva();
		model.addObject("elencoAliquoteIva", listaAliquoteIva);
		return model;
	}

	@GetMapping (value = "/AddAliquotaIva")
	public ModelAndView addAliquoteIva() {
		ModelAndView model = new ModelAndView();
		AliquotaIva oAliquotaIva = new AliquotaIva();
		model.addObject("oAliquotaIva", oAliquotaIva);
		model.setViewName("/AliquotaIva/AddEditAliquotaIva");
		return model;
	}

	@GetMapping (value = "/EditAliquotaIva/{id}")
	public ModelAndView editAliquotaIva(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("AliquotaIva/AddEditAliquotaIva");
		AliquotaIva oAliquotaIva = aliquotaIvaService.getAliquotaIvaById(id);
		model.addObject("oAliquotaIva", oAliquotaIva);
		model.setViewName("/AliquotaIva/AddEditAliquotaIva");
		return model;
	}

	@PostMapping (value = "/SaveAliquotaIva")
	public ModelAndView saveAliquotaIva(@Valid @ModelAttribute("oggettoAliquotaIva") AliquotaIva oAliquotaIva, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("AliquotaIva/AddEditAliquotaIva");
			return model;
		} else {
			aliquotaIvaService.saveOrUpdate(oAliquotaIva);
			return new ModelAndView("redirect:/AliquotaIva/ListaAliquoteIva");
		}
	}
	
	@GetMapping (value = "/DeleteAliquotaIva/{id}")
	public ModelAndView deleteAliquotaIva(@PathVariable("id") Integer id) {
		aliquotaIvaService.deleteAliquotaIva(id);
		return new ModelAndView("redirect:/AliquotaIva/ListaAliquoteIva");
	}
}