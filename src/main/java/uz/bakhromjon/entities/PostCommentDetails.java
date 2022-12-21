package uz.bakhromjon.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import javax.persistence.*;


/**
 * @author : Bakhromjon Khasanboyev
 **/

@Entity(name = "PostCommentDetails")
@Table(name = "post_comment_details")
public class PostCommentDetails {
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @OnDelete(action = OnDeleteAction.CASCADE)
    private PostComment comment;
    private int votes;
}