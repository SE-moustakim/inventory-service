package enset.glsid.inventoryservice;

import enset.glsid.inventoryservice.dao.ProductRepository;
import enset.glsid.inventoryservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Autowired
	ProductRepository productRepository;
	private void initProducts(){
		String prodcuts[] = {"pc hp", "laptop xps", "scanner0X", "iphone 5s"};
		for(String name : prodcuts){
			Product product = new Product();
			product.setName(name);
			product.setPrice(new Random().nextDouble() * 1000);
			product.setQuantity(new Random().nextInt(1000 - 50 + 1) + 50);
			productRepository.save(product);
		}
	}

	@Override
	public void run(String... args) throws Exception {
               initProducts();
	}
}
