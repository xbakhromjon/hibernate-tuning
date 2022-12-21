package uz.bakhromjon.entities;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 04/11/22, Fri, 21:52
 **/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Item1 item1;

}
