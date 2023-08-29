package com.tech.tonystark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/im")
public class TonyController {
@GetMapping("/theNameis")
public String theNameis() {
	return "Iron Man";
}
}
