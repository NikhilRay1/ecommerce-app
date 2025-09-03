package Ecommerce.App.services;

import Ecommerce.App.model.Product;
import Ecommerce.App.payload.ProductDTO;
import Ecommerce.App.payload.ProductResponse;
import jakarta.validation.Valid;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

//public interface ProductService {
//    ProductDTO addProduct(Long categoryId, @Valid ProductDTO productDTO);
//
//    ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String keyword, String category);
//
//    ProductResponse searchByCategory(Long categoryId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
//
//    ProductResponse searchProductByKeyword(String keyword, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
//
//    ProductDTO updateProduct(Long productId, @Valid ProductDTO productDTO);
//
//    ProductDTO deleteProduct(Long productId);
//
//    ProductDTO updateProductImage(Long productId, MultipartFile image);
//}
public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder, String keyword, String category);

    ProductResponse searchByCategory(Long categoryId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductResponse searchProductByKeyword(String keyword, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductDTO updateProduct(Long productId, ProductDTO product);

    ProductDTO deleteProduct(Long productId);

    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;

    Product changeProductCategory(Long productId, Long newCategoryId);
}