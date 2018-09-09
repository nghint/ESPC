package org.o7plannng.sbshoppingcart.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.o7plannng.sbshoppingcart.entity.Product;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
public class ProductForm {
    private String code;
    private String name;
    private double price;

    private boolean newProduct = false;

    // Upload file.
    private MultipartFile fileData;
    public ProductForm() {
        this.newProduct= true;
    }

    public ProductForm(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
    }
}
