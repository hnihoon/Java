package db.day03;

public class ProductDao {

	private static ProductDao productdao = new ProductDao();
	
	private ProductDao() {
		
	}
	
	public static ProductDao getProcutDao() {
		return productdao;
	}
}
