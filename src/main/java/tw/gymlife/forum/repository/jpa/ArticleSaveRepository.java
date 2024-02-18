package tw.gymlife.forum.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.gymlife.forum.model.ArticleSave;
import tw.gymlife.member.model.Member;

public interface ArticleSaveRepository extends JpaRepository<ArticleSave, Integer> {

	ArticleSave findByMemberUserIdAndArticleArticleId(Integer userId, Integer articleId);

	List<ArticleSave> findByArticleArticleId(Integer articleId);
	
    List<ArticleSave> findAllByMember(Member member);

	
}
