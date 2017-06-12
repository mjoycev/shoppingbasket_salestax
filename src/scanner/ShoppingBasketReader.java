package scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import products.Book;
import products.Food;
import products.Medicine;
import products.OtherProducts;
import products.Product;

public class ShoppingBasketReader {
	
	public ShoppingBasketReader() {}

	public List<Product> readShoppingBasket(String filename) {
		
		List<Product> list = new ArrayList<Product>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String str = br.readLine();
			String[] data = null;
			
			while(str != null)
			{
				data = str.split(",");
				
				if(data.length != 5) {
					return null;
				}
				
				// NOTE : no validation for the elements in the txt file
				String keyword = data[2];
				switch (keyword.toLowerCase()) {
				case "book":
					Product bookProduct = new Book(Integer.valueOf(data[0]), Boolean.valueOf(data[1]), keyword, data[3], new BigDecimal(data[4]));
					list.add(bookProduct);
					break;
				case "medicine":
					Product medicineProduct = new Medicine(Integer.valueOf(data[0]), Boolean.valueOf(data[1]), keyword, data[3], new BigDecimal(data[4]));
					list.add(medicineProduct);
					break;
				case "food":
					Product foodProduct = new Food(Integer.valueOf(data[0]), Boolean.valueOf(data[1]), keyword, data[3], new BigDecimal(data[4]));	
					list.add(foodProduct);
					break;
				default:
					Product otherProduct = new OtherProducts(Integer.valueOf(data[0]), Boolean.valueOf(data[1]), "", data[3], new BigDecimal(data[4]));
					list.add(otherProduct);
					break;
				}
				
				str = br.readLine();
			}
			
			br.close();
			
		} catch (IOException e) {
			
		}
		
		return list;
	}
}
