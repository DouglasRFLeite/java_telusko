package com.jdbc.spring_jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jdbc.spring_jdbc.model.Alien;
import com.jdbc.spring_jdbc.repo.AlienRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien a1 = context.getBean(Alien.class);
		a1.setId(111);
		a1.setName("Douglas");
		a1.setTech("Java");

		System.out.println(a1);

		AlienRepository repository = context.getBean(AlienRepository.class);
		repository.save(a1);

		System.out.println(repository.findAll());
	}

}
