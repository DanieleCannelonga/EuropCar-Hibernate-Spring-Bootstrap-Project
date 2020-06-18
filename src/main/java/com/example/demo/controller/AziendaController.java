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

import com.example.demo.model.Azienda;
import com.example.demo.model.Gruppo;
import com.example.demo.service.AziendaService;
import com.example.demo.service.GruppoService;

@Controller
@RequestMapping(value = "/Azienda")
public class AziendaController {

	@Autowired
	AziendaService aziendaService;
	
	@Autowired
	GruppoService gruppoService;

	@GetMapping (value = "/ListaAziende")
	public ModelAndView listaAziende() {
		ModelAndView model = new ModelAndView("Azienda/ListaAziende");
		List<Azienda> listaAziende = aziendaService.getAllAziende();
		model.addObject("elencoAziende", listaAziende);
		return model;
	}

	@GetMapping (value = "/AddAzienda")
	public ModelAndView addAzienda() {
		ModelAndView model = new ModelAndView();
		Azienda oAzienda = new Azienda();
		model.addObject("oAzienda", oAzienda);
		model.setViewName("/Azienda/AddEditAzienda");
		List<Gruppo> listaGruppi = gruppoService.getAllGruppi();
		model.addObject("elencoGruppi", listaGruppi);
		return model;
	}

	@GetMapping (value = "/EditAzienda/{id}")
	public ModelAndView editAzienda(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("Azienda/AddEditAzienda");
		Azienda oAzienda = aziendaService.getAziendaById(id);
		model.addObject("oAzienda", oAzienda);
		model.setViewName("/Azienda/AddEditAzienda");
		List<Gruppo> listaGruppi = gruppoService.getAllGruppi();
		model.addObject("elencoGruppi", listaGruppi);
		return model;
	}

	@PostMapping (value = "/SaveAzienda")
	public ModelAndView saveAzienda(@Valid @ModelAttribute("oggettoAzienda") Azienda oAzienda, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("Azienda/AddEditAzienda");
			return model;
		} else {
			aziendaService.saveOrUpdate(oAzienda);
			return new ModelAndView("redirect:/Azienda/ListaAziende");
		}
	}
	
	@GetMapping (value = "/DeleteAzienda/{id}")
	public ModelAndView deleteAzienda(@PathVariable("id") Integer id) {
		aziendaService.deleteAzienda(id);
		return new ModelAndView("redirect:/Azienda/ListaAziende");
	}
}