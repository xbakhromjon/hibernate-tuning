package uz.bakhromjon.entities;

/**
 * @author : Bakhromjon Khasanboyev
 **/

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PostComment")
@Table(name = "post_comment")
@ToString
public class PostComment {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    private String review;
}
