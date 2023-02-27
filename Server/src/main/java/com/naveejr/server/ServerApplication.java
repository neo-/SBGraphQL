package com.naveejr.server;

import com.naveejr.server.bo.Author;
import com.naveejr.server.bo.Book;
import com.naveejr.server.repository.AuthorRepository;
import com.naveejr.server.repository.BookRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args -> {
			Author josh = authorRepository.save(new Author(null, "Josh Long"));
			Author mark = authorRepository.save(new Author(null, "Mark Heckler"));
			bookRepository.saveAll(List.of(
					new Book("Reactive Spring", "Manning", josh),
					new Book("Cloud Native Jave", "Manning", josh),
					new Book("Springboot", "Manning", mark)

			));
		};
	}


}
