
public class sale extends product {
	private String id, name;
	private float price, saleTotal, priceDiscount;
	private int numProduct;
	
	@Override
	public void detailProduct(String id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		System.out.println("------------------------");
		System.out.println(" ");
		
	}
	@Override
	public void buyProduct(int numProduct){
		this.numProduct = numProduct;
		this.saleTotal = numProduct * price;
		if(saleTotal >= 1000) {
			System.out.println("Total price : " + saleTotal + " ");
			priceDiscount = saleTotal * 0.1f;
			System.out.println("Discount : " + priceDiscount);
			priceDiscount = saleTotal - priceDiscount;
			System.out.println("Total Discount : " + priceDiscount);
		}
		else if (saleTotal >= 8000 && saleTotal < 1000) {
			System.out.println("Total price : " + saleTotal + " ");
			priceDiscount = saleTotal * 0.1f;
			System.out.println("Discount : " + priceDiscount);
			priceDiscount = saleTotal - priceDiscount;
			System.out.println("Total Discount : " + priceDiscount);
		}
		else if (saleTotal >= 6000 && saleTotal < 8000) {
			System.out.println("Total price : " + saleTotal + " ");
			priceDiscount = saleTotal * 0.3f;
			System.out.println("Discount : " + priceDiscount);
			priceDiscount = saleTotal - priceDiscount;
			System.out.println("Total Discount : " + priceDiscount);
		}
		else if (saleTotal < 6000){
			priceDiscount = saleTotal;
			System.out.println("No Discount");
		}
	}

}
