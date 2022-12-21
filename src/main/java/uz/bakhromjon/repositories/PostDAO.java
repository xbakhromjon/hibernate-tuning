package uz.bakhromjon.repositories;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.entities.Post;
import uz.bakhromjon.entities.PostComment;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
public class PostDAO {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void doInJPA() {
        long postId = 1;
        long postCommentId = 1;

        for (int i = 0; i < 3; i++) {
            Post post = new Post(postId++, String.format("High-Performance Java Persistence, part %d", i));
            entityManager.persist(post);

            for (int j = 0; j < 3; j++) {
                entityManager.persist(new PostComment(postCommentId++, post, String.format("The part %d was amazing!", i)));
            }
        }
    }

    public PostComment find(long id) {
        PostComment postComment = entityManager.find(PostComment.class, id);
        return postComment;
    }

    public PostComment findJPQL(long id) {
        PostComment comment = entityManager
                .createQuery(
                        "select pc " +
                                "from PostComment pc " +
                                "where pc.id = :id", PostComment.class)
                .setParameter("id", 1L)
                .getSingleResult();
        return comment;
    }

    public List<PostComment> list() {
        List comments = entityManager
                .createQuery(
                        "select pc " +
                                "from PostComment pc " +
                                "join pc.post p " +
                                "where p.title like :titlePatttern", PostComment.class)
                .setParameter(
                        "titlePatttern",
                        "High-Performance Java Persistence%"
                )
                .getResultList();
        return comments;
    }
}
