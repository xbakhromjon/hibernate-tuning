package uz.bakhromjon;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import uz.bakhromjon.entities.Container;
import uz.bakhromjon.entities.Item1;
import uz.bakhromjon.entities.Item2;
import uz.bakhromjon.repositories.ContainerRepository;
import uz.bakhromjon.repositories.Item1Repository;
import uz.bakhromjon.repositories.Item2Repository;

@SpringBootTest
class HibernateTuningApplicationTests {

    @Mock
    ContainerRepository containerRepository;
    @Mock
    Item1Repository item1Repository;

    @Mock
    Item2Repository item2Repository;

    @Test
    void contextLoads() {
        Container container = new Container(1, "name");
        container = containerRepository.save(container);

        Item1 item1 = new Item1(1, "item", container);
        item1 = item1Repository.save(item1);

        Item2 item2 = new Item2(1, "item2", item1);
        item2 = item2Repository.save(item2);

        item1Repository.deleteById(1);
    }


}
