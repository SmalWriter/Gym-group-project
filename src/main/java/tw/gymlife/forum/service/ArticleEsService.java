//package tw.gymlife.forum.service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.apache.lucene.search.join.ScoreMode;
//import org.elasticsearch.index.query.BoolQueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.search.sort.SortBuilders;
//import org.elasticsearch.search.sort.SortOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.client.erhlc.ElasticsearchRestTemplate;
//import org.springframework.data.elasticsearch.client.erhlc.NativeSearchQueryBuilder;
//import org.springframework.data.elasticsearch.core.SearchHit;
//import org.springframework.data.elasticsearch.core.query.Query;
//import org.springframework.stereotype.Service;
//
//import tw.gymlife.forum.model.ArticleEs;
//
//@Service
//public class ArticleEsService {
//
//    private final ElasticsearchRestTemplate elasticsearchRestTemplate;
//
//    @Autowired
//    public ArticleEsService(ElasticsearchRestTemplate elasticsearchRestTemplate) {
//        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
//    }
//
//    public List<ArticleEs> searchByTitleContentAndComments(String text) {
//        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery()
//                .should(QueryBuilders.matchQuery("title", text))
//                .should(QueryBuilders.matchQuery("content", text))
//                .should(QueryBuilders.nestedQuery(
//                        "comments",
//                        QueryBuilders.matchQuery("comments.content", text),
//                        ScoreMode.Avg // 使用正确的ScoreMode
//                ));
//
//        Query searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(boolQueryBuilder)
//                .withSort(SortBuilders.scoreSort().order(SortOrder.DESC)) // Example of adding a sort by score in descending order
//                .build();
//
//        return elasticsearchRestTemplate.search(searchQuery, ArticleEs.class)
//                .stream()
//                .map(SearchHit::getContent)
//                .collect(Collectors.toList());
//    }
//}
