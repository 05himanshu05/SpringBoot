package net.engineeringdigest.journalApp;

import jakarta.annotation.sql.DataSourceDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class JournalApplication {
	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}

}
