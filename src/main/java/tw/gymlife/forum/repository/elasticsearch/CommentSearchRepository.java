//package tw.gymlife.forum.repository.elasticsearch;
//
//import java.util.List;
//
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.stereotype.Repository;
//
//import tw.gymlife.forum.model.CommentBean;
//import tw.gymlife.forum.model.CommentEs;
//
//public interface CommentSearchRepository extends ElasticsearchRepository<CommentEs, Integer> {
//	List<CommentEs> findByDocumentTypeAndCommentContentContaining(String documentType, String content);
//}
