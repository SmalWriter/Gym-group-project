package tw.gymlife.forum.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "tw.gymlife.forum.repository.elasticsearch")
public class ElasticsearchConfig {

}
