package uz.bakhromjon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.entities.Item1;
import uz.bakhromjon.entities.Item2;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface Item2Repository extends JpaRepository<Item2, Integer> {
}

