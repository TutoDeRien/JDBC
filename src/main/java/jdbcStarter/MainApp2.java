package jdbcStarter;

import jdbcStarter.dao.ProductDAO;
import jdbcStarter.models.Products;

public class MainApp2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/warehouse?serverTimezone=UTC";
        String user = "root";
        String password = "tutoderien";

        Products products = new Products();
        products.setName("AMD Ryzen 5 2600");

        ProductDAO productDAO = new ProductDAO(url,user,password);

        System.out.println(productDAO.getProductById(1L));

    }
}
