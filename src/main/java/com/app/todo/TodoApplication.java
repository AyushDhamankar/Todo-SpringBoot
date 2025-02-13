package com.app.todo;

// import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		// Dotenv dotenv = Dotenv.load(); // Load .env file
        // System.setProperty("DATABASE_URI", dotenv.get("DATABASE_URI"));
        // System.setProperty("DATABASE_USER", dotenv.get("DATABASE_USER"));
        // System.setProperty("DATABASE_PASS", dotenv.get("DATABASE_PASS"));

		SpringApplication.run(TodoApplication.class, args);
	}

}
