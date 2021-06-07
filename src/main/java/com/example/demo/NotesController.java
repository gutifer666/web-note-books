package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotesController {
	
	@RequestMapping("/savenote")
	public String saveNote(Model model,
			@RequestParam String title,
			@RequestParam String page,
			@RequestParam String note) {
		model.addAttribute("title",title);
		model.addAttribute("page",page);
		model.addAttribute("note",note);
		
		return "note";
	}
			
}
