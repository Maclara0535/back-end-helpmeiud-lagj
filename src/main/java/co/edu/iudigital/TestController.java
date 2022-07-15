package co.edu.iudigital;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/test")


public class TestController {
	
	@GetMapping
	public ResponseEntity<String> test(){
		return ResponseEntity.ok().body("OK!");
	}


}
