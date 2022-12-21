package uz.bakhromjon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.bakhromjon.repositories.ContainerRepository;
import uz.bakhromjon.repositories.Item1Repository;

@SpringBootApplication
public class HibernateTuningApplication implements CommandLineRunner {

    @Autowired
    private ContainerRepository containerRepository;
    @Autowired
    private Item1Repository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateTuningApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Container container = new Container(1, "Hello");
//        container = containerRepository.save(container);
//
//        Item1 item1 = new Item1(1, "name", container);
//        itemRepository.save(item1);
//        itemRepository.deleteById(1);
    }

}
