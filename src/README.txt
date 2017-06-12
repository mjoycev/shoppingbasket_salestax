Implementation:
1. Used JFileChooser to choose txt files as input files.
2. Used an abstract class Product and extended by other classes (Food, Medicine, Book, OtherProducts)
3. Flow:
	- user chooses txt file
	- parse txt file and check for keywords for types/categories of products (Food, Medicine, Book, Other Products)
	- compute sales tax based on product type and if imported or not
	- round up the sales tax to the nearest 5 cents
	- compute selling price (unit price + sales tax)
	- compute total sales tax
	- compute total amount 
	- print receipt

Assumptions and Limitations:
1. Only accepts txt files. Choosing another file type would only display a message to choose only txt files.
2. If txt file is empty, would only show a message that there are no items.
3. Only accepts comma-delimited String input parsed per line. Each line should only have 5 elements,
 otherwise, it will only be treated as an empty file.
4. No validation available for the data types in the txt file. It is assumed that the String array would be 
 in the following sequence : [Integer, Boolean, String, String, BigDecimal]
5.  Boolean value is assumed to be given to determine if product is imported or not.