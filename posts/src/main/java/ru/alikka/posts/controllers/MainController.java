package ru.alikka.posts.controllers;

import antlr.RecognitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.alikka.posts.models.Record;
import ru.alikka.posts.repositories.RecordRepository;

@Controller
public class MainController {

	@Autowired
	RecordRepository recordRepository;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("records", recordRepository.findAll());
		return "index";
	}

	// /hi
	@GetMapping("/abc")
	public String welcome() {
		return "welcome";
	}

	@PostMapping("/record/new")
	public String newRecord(@RequestParam String nickname,
							@RequestParam String text) {
		Record record = new Record(nickname, text);
		recordRepository.save(record);
		return "redirect:/";
	}


}
