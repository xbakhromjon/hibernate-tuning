package uz.bakhromjon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.entities.Post;
import uz.bakhromjon.entities.PostComment;
import uz.bakhromjon.entities.PostCommentDetails;
import uz.bakhromjon.repositories.PostDAO;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PostDAO postDAO;
    @Autowired
    private EntityManager entityManager;
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Override
    public void run(String... args) throws Exception {
        if (ddl.contains("create")) {
            postDAO.doInJPA();
        }

        List<PostCommentDetails> commentDetailsList = entityManager.createQuery("""
                select pcd
                from PostCommentDetails pcd
                order by pcd.id
                """, PostCommentDetails.class).getResultList();
    }
}
