package tw.gymlife.forum.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.gymlife.forum.model.CommentReport;

public interface CommentReportRepository extends JpaRepository<CommentReport, Integer> {

	CommentReport findByMemberUserIdAndCommentCommentId(Integer userId, Integer commentId);

	List<CommentReport> findByCommentCommentId(Integer commentId);
}
