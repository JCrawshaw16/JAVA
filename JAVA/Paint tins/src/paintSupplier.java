

public class paintSupplier {

	private String brand;
	private double price;
	private double litres;
	private int coverage;
	private double lpm2;
	
	public String getBrand(){
		return brand;
	}
	
	public int getCoverage(){
		return coverage;
	}
	
	public double getPrice(){
		return price;
	}
	
	public double getLitres(){
		return litres;
	}
	
	public double getLpm2(){
		return lpm2;
	}
	
	
	public paintSupplier(String mBrand, double mPrice, double mLitres, int mCoverage, int mLpm2){
		
		brand = mBrand;
		price = mPrice;
		litres = mLitres;
		coverage = mCoverage;
		lpm2 = mLpm2;
		
		
	}
	
}
