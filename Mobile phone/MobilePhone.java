class MobilePhone{
	private String model;
	private double price;
	private boolean isSmartphone;
	
public void setmodel(String model){
	this.model = model;
 }
 public void setprice(double price){
	if(price>=5000){
		this.price = price;
	}else{
		System.out.println("Price should above 5000");	
	}
 }
 public void setisSmartphone(boolean isSmartphone){
	this.isSmartphone = isSmartphone;
 }
 public String getmodel(){
	if(model == null || model.isEmpty()){
		return "Unavailable";
	}
	return model;
 }
 public double getprice(){
	return price;
 }
 public boolean getisSmartphone(){
	return isSmartphone;
 }
 
}