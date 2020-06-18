package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/Budget")
public class BudgetController {

	@GetMapping(value = "/Lista")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("Menu/ListaBudget");
		return model;
	}
}
