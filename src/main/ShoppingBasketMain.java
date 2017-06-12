package main;

import java.util.List;

import printer.ShoppingReceiptPrinter;
import products.Product;

import scanner.ShoppingBasketReader;

public class ShoppingBasketMain {

	public static void main(String[] args) {
		ShoppingFileChooser fc = new ShoppingFileChooser();
	    String filePath = fc.getFilePath();
	    
	    // limit to txt files only
		if(!"".equals(filePath)) {
		    // read input file
			ShoppingBasketReader reader = new ShoppingBasketReader();
			List<Product> list = reader.readShoppingBasket(filePath);
			
			if(list != null && !list.isEmpty()) {
				// print receipt
				ShoppingReceiptPrinter printer = new ShoppingReceiptPrinter();
				printer.printReceipt(list);
			} else {
				// if returned list is empty
				System.out.println("No Item in Shopping Cart");
			}
		} else {
			System.out.println("Please choose txt files only");
		}
	}
}
