package in.shoheb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shoheb.entity.Family;
import in.shoheb.repository.FamRepository;

@SpringBootApplication
public class DataJpaCrudRepo02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaCrudRepo02Application.class, args);
		FamRepository repository = context.getBean(FamRepository.class);
	
		Family f1=new Family();
		f1.setAge(22);
		f1.setFamId(1002);
		f1.setName("Lals");
		f1.setNickName("chiku");
		
		
		repository.save(f1);
		System.out.println("Instered Succesfully.......");
	}

}
