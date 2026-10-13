package HW;

import java.util.ArrayList;

public class Cart {
	 ArrayList<Product> list = new ArrayList<>();

	    void addProduct(Product p) {
	        list.add(p);
	    }

	    void removeProduct(Product p) {
	        list.remove(p);
	    }

	    int getTotalPrice() {
	        int total = 0;
	        for (Product p : list)
	            total += p.price;
	        return total;
	    }

	    public static void main(String[] args) {
	        Cart c = new Cart();

	        Product p1 = new Product("Book", 100);
	        Product p2 = new Product("Pen", 20);

	        c.addProduct(p1);
	        c.addProduct(p2);

	        System.out.println(c.getTotalPrice());
	    }
	}