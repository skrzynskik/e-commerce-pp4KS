package pl.skrzynski.productcatalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JPAProductStorageTest {

    @Autowired
    ProductDataCRUD productDataCRUD;

    @Test
    void storeAndLoadProduct() {
        ProductData data = new ProductData("my-id", "nice one");

        productDataCRUD.save(data);

        ProductData loaded = productDataCRUD
                .findById(data.getId()).get();

        assertEquals(data.getId(), loaded.getId());
    }
}
