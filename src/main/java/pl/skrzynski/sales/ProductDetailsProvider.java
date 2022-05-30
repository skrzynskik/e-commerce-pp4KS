package pl.skrzynski.sales;

import java.util.Optional;

public interface ProductDetailsProvider {
    Optional<ProductDetails> findById(String productId);
}
