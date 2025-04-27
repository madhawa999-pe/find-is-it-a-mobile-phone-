class Test{
	public static void main(String[]args){
	
		MobilePhone m1 = new MobilePhone();
		
		m1.setmodel("Vivo Y 17's");
		m1.setprice(55000);
		m1.setisSmartphone(true);
		
		MobilePhone m2 = new MobilePhone();
		
		m2.setmodel("");
		m2.setprice(4500);
		m2.setisSmartphone(false);
		
		System.out.println("phone 1  : " +m1.getmodel() + "- LKR " +m1.getprice() + "- smartphone : " +m1.getisSmartphone());	
		System.out.println();	
		System.out.println();	
		System.out.println("phone 2 : " +m2.getmodel() + "- LKR " +m2.getprice() + "- smartphone : " +m2.getisSmartphone());	
		
		
	}
}