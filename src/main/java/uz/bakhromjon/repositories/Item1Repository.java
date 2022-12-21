package uz.bakhromjon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.entities.Item1;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface Item1Repository extends JpaRepository<Item1, Integer> {
}

