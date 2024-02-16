package core.core2.dbs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import core.core2.dbs.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    Product findByName(String title);
}
