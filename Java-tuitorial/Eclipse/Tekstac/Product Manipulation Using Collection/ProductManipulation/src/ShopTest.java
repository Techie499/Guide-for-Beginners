import java.util.*;
import org.junit.BeforeClass;

public class ShopTest {
	
	static List<Product> productList = new ArrayList<>();
	static  Shop s = null;
	
	@BeforeClass
	public static void setUp(){
		Product  p1 =new Product(101,"Bag","A",1200);
		Product  p2 =new Product(102,"Wallet","B",700);
		Product  p3 =new Product(103,"Toys","C",400);
		Product  p4 =new Product(104,"Perfume","B",500);
		Product  p5 =new Product(105,"Books","A",2000);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);		
		
		s=new Shop();
	}

	public void test11ViewProductByPrice() {
		
		
	}

	public void test12ViewProductNamePrice() {
		
	}

}
