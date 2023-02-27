package com.example.configuration;




import com.example.repository.IProductRepository;
import com.example.repository.ProductRepository;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
//    chi khi dinh nghia <context:component-scan base-package="com.example"/> trong dispatcher-servlet thi nhung bean nay moi duoc khoi tao
    @Bean
    public IProductRepository productRepository(){
        return new ProductRepository();
    }
    @Bean
    public IProductService productService(){
        return new ProductService();
    }
}
