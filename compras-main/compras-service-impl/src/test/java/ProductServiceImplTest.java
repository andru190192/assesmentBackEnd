
import com.compras.backend.compras.service.ProductService;
import com.compras.backend.domain.model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ProductServiceImplTest {

    ProductService productService;

    @Before
    public void setUp() {
        productService = mock(ProductService.class);
    }

    @Test
    public void findAllTest() {

        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setProductCode("jansnjas");
        products.add(product);
        when(productService.findAll()).thenReturn(products);
        Assert.assertEquals(1, productService.findAll().size());

    }
}
