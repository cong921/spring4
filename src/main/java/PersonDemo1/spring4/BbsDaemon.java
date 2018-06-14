package PersonDemo1.spring4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BbsDaemon {
	@RequestMapping("/")
	public String index() {
		return "Welcom!";
	}
	public static void main(String[] args) {
		SpringApplication.run(BbsDaemon.class, args);
	}
}
