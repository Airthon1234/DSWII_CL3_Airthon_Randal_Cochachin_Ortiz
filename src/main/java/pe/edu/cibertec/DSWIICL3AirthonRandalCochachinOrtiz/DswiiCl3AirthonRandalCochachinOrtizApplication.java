package pe.edu.cibertec.DSWIICL3AirthonRandalCochachinOrtiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DswiiCl3AirthonRandalCochachinOrtizApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiCl3AirthonRandalCochachinOrtizApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configCorsGlobal(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("api/**")
						.allowedMethods("GET", "POST", "PUT")
						.allowedOrigins("*");
			}
		};
	}

}
