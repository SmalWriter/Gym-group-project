package tw.gymlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class GymlifeprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymlifeprojectApplication.class, args);
	}

}
