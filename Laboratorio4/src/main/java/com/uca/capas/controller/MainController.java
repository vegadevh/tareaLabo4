package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Producto;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView initMain() {
		Producto producto = new Producto();
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", producto);
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/formProducto")
	public ModelAndView formProducto(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			//Manchar index de formulario y no dejarlo pasar al de "exito"
			mav.setViewName("index");
		}else {
			mav.setViewName("exito");
		}
		return mav;
	}
}
