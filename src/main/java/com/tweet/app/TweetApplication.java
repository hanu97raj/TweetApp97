package com.tweet.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



import com.tweet.entities.Tweet;


@SpringBootApplication
@EnableMongoRepositories("com.tweet.repositories")
@ComponentScan("com.tweet.*")
public class TweetApplication {


	public static void main(String[] args) {
		SpringApplication.run(TweetApplication.class, args);
	}
	
	//The below code has to be uncommented while running kafka
	
	/*@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, KafkaTerminalMessage> kafkaTemplate) {
		return args->{
			kafkaTemplate.send("Tweet",kafkaTerminalMessage);
		};
	}
	*/
	

}
