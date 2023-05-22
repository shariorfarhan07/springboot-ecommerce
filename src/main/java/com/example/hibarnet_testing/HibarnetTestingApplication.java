package com.example.hibarnet_testing;

import com.example.hibarnet_testing.domain.Address;
import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.repositories.UserRepo;
import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class HibarnetTestingApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(HibarnetTestingApplication.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);

		User u=new User();
		u.setName("farhan");
		u.setPhone("01749555777");
		u.setPassword("123456");
		User u1=new User();
		u1.setName("sharior");
		u1.setPhone("01749555777");
		u1.setPassword("123456");

		System.out.println(u);
		System.out.println(u1);
		System.out.println(userRepo.getClass()+"farhan");


		userRepo.save(u);
		userRepo.save(u1);
		Optional<User> optional=userRepo.findById(Long.valueOf(2));
//		User uu=optional.get();
//		System.out.println(uu);
//
//		List<User> op=userRepo.findByName("sharior");
//
//
//		for (User usr:op) {
//			System.out.println(usr);
//		}
//		System.out.println(uu);












	}

}
