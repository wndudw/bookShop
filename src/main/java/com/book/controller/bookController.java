package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookKo/*")
public class bookController {

	@GetMapping("/bookKoList")
	public void getKoLit() {
		
	}
}
