package uz.bakhromjon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.entities.Post;
import uz.bakhromjon.entities.PostComment;
import uz.bakhromjon.repositories.PostDAO;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private PostDAO postDAO;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Override
    public void run(String... args) throws Exception {
        if (ddl.contains("create")) {
            postDAO.doInJPA();
        }
        PostComment postComment1 = postDAO.find(1L);
        PostComment postComment2 = postDAO.findJPQL(1L);
        Post post = postComment1.getPost();
//        System.out.println(post.toString());
        System.out.println(post.getId());
//        System.out.println(postComment1.toString());
//        System.out.println(postComment2.toString());
        List<PostComment> list =
                postDAO.list();
//        System.out.println(list);
//        System.out.println(list.size());
    }
}
