//package tw.gymlife.forum.config;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.erhlc.AbstractElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.client.erhlc.ElasticsearchRestTemplate;
//import org.springframework.data.elasticsearch.client.erhlc.RestClients;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "tw.gymlife.forum.repository.elasticsearch")
//public class ElasticsearchConfig extends AbstractElasticsearchConfiguration {
//
//	 @Override
//	    @Bean(name = "customElasticsearchClient")
//	    public RestHighLevelClient elasticsearchClient() {
//	        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//	            .connectedTo("localhost:9200")
//	            .build();
//
//	        return RestClients.create(clientConfiguration).rest();
//	    }
//	 @SuppressWarnings("deprecation")
//	@Bean
//	    public ElasticsearchRestTemplate elasticsearchTemplate() {
//	        return new ElasticsearchRestTemplate(elasticsearchClient());
//	    }
//}
