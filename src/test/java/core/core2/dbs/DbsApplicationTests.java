package core.core2.dbs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import core.core2.dbs.models.Product;
import core.core2.dbs.models.User;
import core.core2.dbs.repos.ProductRepo;
import core.core2.dbs.repos.UserRepo;

@SpringBootTest
class DbsApplicationTests {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ProductRepo productRepo;

	@Test
	public void dbTest() {
		User user = User.builder().fristName("a").build();

		Product product = Product.builder().name("Apple iphone").price(54000).live(true)
				.description("this is apple product").build();

		productRepo.save(product);
		userRepo.save(user);
		System.out.println("data saved");
	}

	@Test
	public void getData() {
		productRepo.findAll().forEach(product -> System.out.println(product.getName()));
		userRepo.findAll().forEach(user -> System.out.println(user.getFristName()));
	}

}
