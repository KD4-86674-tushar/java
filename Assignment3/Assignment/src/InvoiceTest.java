
public class InvoiceTest {
	
	String partNumber;
	String partDiscription;
	int quantity;
	double price;
	
	public InvoiceTest(String partNumber, String partDiscription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDiscription = partDiscription;
		this.quantity = quantity;
		this.price = price;
		
		if(price < 0) {
			this.price=0;
		}else {
			this.price=price;
		}
		
		if(quantity < 0) {
			this.quantity=0;
		}else {
			this.quantity=quantity;
		}
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDiscription() {
		return partDiscription;
	}
	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double display() {
		return quantity*price;
		
	}
	
	
		
	}

