package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10); // instance,referans oluþturmma
		
		Product product2 = new Product(); // instance,referans oluþturmma
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(2);
		category1.setName("Yiyecek");
		
		System.out.println(category1.getName());
		

	}

}
