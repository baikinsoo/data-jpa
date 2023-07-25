package study.datajpa

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class DataJpaApplication {

	static void main(String[] args) {
		SpringApplication.run(DataJpaApplication, args)
	}

}
