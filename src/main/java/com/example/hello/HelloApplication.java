package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HelloApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public  void xzy() {
		User user = new User();
		user.setName("nanowatt");
		userRepository.save(user);
	}


	public static void main(String[] args) {

	ConfigurableApplicationContext context=
			SpringApplication.run(HelloApplication.class, args);

	int count =context.getBeanDefinitionCount();
	System.out.println("getBeanDefinitionCount: "+count);



	}

}
