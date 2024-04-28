package mycampus.mycampus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class MycampusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycampusApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer( ) {
		return new WebMvcConfigurer(){
			@Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE","PATCH").allowedOrigins("http://localhost:4200");
            }
		};
	}
		

}
