//modelo
//interface
//repositorio
//servicio
//controlador


package Chocolate;

import Chocolate.interfaces.InterfaceChocolate;
import Chocolate.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class ChocolateApplication implements CommandLineRunner {
    @Autowired
    private InterfaceChocolate interfaceChocolate;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(ChocolateApplication.class, args);
	}
            @Override
    public void run (String... arg) throws Exception {
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll ();
    }

}
