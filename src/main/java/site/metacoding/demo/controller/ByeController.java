package site.metacoding.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
public class ByeController {
	
//	@GetMapping("bye")
//	public JsonElement bye() {
//		Bye bye = new Bye("spring", 12);
//		JsonObject json = new JsonObject();
//		
//	}
	
}

@Data
@AllArgsConstructor
class Bye {
	String name;
	Integer age;
}
