package uz.bakhromjon.repositories;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 04/11/22, Fri, 22:00
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.entities.Container;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ContainerRepository extends JpaRepository<Container, Integer> {
}

