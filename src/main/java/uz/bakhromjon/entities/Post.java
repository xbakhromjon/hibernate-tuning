package uz.bakhromjon.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : Bakhromjon Khasanboyev
 **/
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Post")
@Table(name = "post")
public class Post {
    @Id
    private Long id;
    private String title;
}
