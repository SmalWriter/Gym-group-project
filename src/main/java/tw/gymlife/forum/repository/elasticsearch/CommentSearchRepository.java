package tw.gymlife.forum.repository.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import tw.gymlife.forum.model.CommentBean;

public interface CommentSearchRepository extends ElasticsearchRepository<CommentBean, Integer> {
	List<CommentBean> findByDocumentTypeAndCommentContentContaining(String documentType, String content);
}
