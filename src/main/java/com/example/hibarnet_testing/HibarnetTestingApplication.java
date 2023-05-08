package com.example.hibarnet_testing;

import com.example.hibarnet_testing.domain.user;
import com.example.hibarnet_testing.repositories.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HibarnetTestingApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(HibarnetTestingApplication.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);

		user u=new user();
		u.setName("farhan");
		u.setPhone("01749555777");
		u.setPassword("123456");
		user u1=new user();
		u1.setName("sharior");
		u1.setPhone("01749555777");
		u1.setPassword("123456");

		System.out.println(u);
		System.out.println(u1);
		System.out.println(userRepo.getClass());

		userRepo.saveAll(List.of(u,u1));
		Optional<user> optional=userRepo.findById(Long.valueOf(2));
		user uu=optional.get();
		System.out.println(uu);

		List<user> op=userRepo.findByLastname("sharior");
		

		for (user usr:op) {
			System.out.println(usr);
		}
		System.out.println(uu);












	}

}
