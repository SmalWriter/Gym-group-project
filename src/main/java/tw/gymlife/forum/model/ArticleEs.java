package tw.gymlife.forum.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "articles")
public class ArticleEs {
    @Id
    private String id;

    private String title;

    private String content;

    // 使用@Field注解来标记这是一个嵌套类型的字段
    @Field(type = FieldType.Nested)
    private List<CommentEs> comments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<CommentEs> getComments() {
		return comments;
	}

	public void setComments(List<CommentEs> comments) {
		this.comments = comments;
	}
    
    
    // 省略getter和setter方法
}

