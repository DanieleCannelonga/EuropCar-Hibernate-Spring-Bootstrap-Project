package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
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

import com.example.demo.model.Fornitore;
import com.example.demo.model.OrdineAcquisto;
import com.example.demo.service.FornitoreService;
import com.example.demo.service.OrdineAcquistoService;

@Controller
@RequestMapping(value = "/OrdineAcquisto")
public class GestioneOrdineAcquistoController {

	@Autowired
	OrdineAcquistoService ordineAcquistoService;
	
	@Autowired
	FornitoreService fornitoreService;

	@GetMapping (value = "/ListaOrdiniAcquisto")
	public ModelAndView listaOrdiniAcquisto() {
		ModelAndView model = new ModelAndView("OrdineAcquisto/ListaOrdiniAcquisto");
		List<Fornitore> listaFornitori = fornitoreService.getAllFornitori();
		model.addObject("elencoFornitori", listaFornitori);
		model.addObject("oggettoFornitore", new Fornitore());
		return model;
	}
	
	@GetMapping (value = "/CercaOrdiniAcquistoPerFornitore")
	public ModelAndView listaOrdiniAcquistoPerFornitore(@ModelAttribute ("oggettoFornitore") Fornitore oFornitore, HttpSession SessionObject) {
		ModelAndView model = new ModelAndView("OrdineAcquisto/ListaOrdiniAcquisto");
		List<Fornitore> listaFornitori = fornitoreService.getAllFornitori();
		model.addObject("elencoFornitori", listaFornitori);
		model.addObject("oggettoFornitore", oFornitore);
		SessionObject.setAttribute("oggettoFornitore", oFornitore);
		List<OrdineAcquisto> listaOrdiniAcquisto = ordineAcquistoService.getOrdineAcquistoPerFornitore(oFornitore.getIdfornitore());
		model.addObject("elencoOrdiniAcquisto", listaOrdiniAcquisto);
		return model;
	}

	@GetMapping (value = "/AddOrdineAcquisto")
	public ModelAndView addOrdineAcquisto() {
		ModelAndView model = new ModelAndView();
		OrdineAcquisto oOrdineAcquisto = new OrdineAcquisto();
		model.addObject("oOrdineAcquisto", oOrdineAcquisto);
		model.setViewName("/OrdineAcquisto/AddEditOrdineAcquisto");
		List<Fornitore> listaFornitori = fornitoreService.getAllFornitori();
		model.addObject("elencoFornitori", listaFornitori);
		return model;
	}

	@GetMapping (value = "/EditOrdineAcquisto/{id}")
	public ModelAndView editOrdineAcquisto(@PathVariable("id") Integer id) {
		ModelAndView model = new ModelAndView("OrdineAcquisto/AddEditOrdineAcquisto");
		OrdineAcquisto oOrdineAcquisto = ordineAcquistoService.getOrdineAcquistoById(id);
		model.addObject("oOrdineAcquisto", oOrdineAcquisto);
		model.setViewName("/OrdineAcquisto/AddEditOrdineAcquisto");
		return model;
	}

	@PostMapping (value = "/SaveOrdineAcquisto")
	public ModelAndView saveOrdineAcquisto(@Valid @ModelAttribute("oggettoOrdineAcquisto") OrdineAcquisto oOrdineAcquisto, BindingResult bindingresult) {
		if (bindingresult.hasErrors()) {
			ModelAndView model = new ModelAndView();
			model.setViewName("OrdineAcquisto/AddEditOrdineAcquisto");
			return model;
		} else {
			ordineAcquistoService.saveOrUpdate(oOrdineAcquisto);
			return new ModelAndView("redirect:/OrdineAcquisto/ListaOrdineAcquisto");
		}
	}
	
	@GetMapping (value = "/DeleteOrdineAcquisto/{id}")
	public ModelAndView deleteOrdineAcquisto(@PathVariable("id") Integer id) {
		ordineAcquistoService.deleteOrdineAcquisto(id);
		return new ModelAndView("redirect:/OrdineAcquisto/ListaOrdiniAcquisto");
	}
}
