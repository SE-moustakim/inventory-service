package enset.glsid.inventoryservice.dao;

import enset.glsid.inventoryservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
