class Author{
	private String name;
	private String email;
	private char gender;
	public Author(){}
    public Author(String name,String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public char getGender(){
		return this.gender;
	}
	public String toString(){
		return "Author[name="+this.getName+",email="+this.getEmail+",gender="+this.getGender+"]";
	}
}
class Book extends Author{
	private String name;
	private Author authors[];
	private double price;
	private int qty = 0;
	
	public Book(String name, Authors authors[],double price){
		this.name = id;
		this.authors = authors.clone();
		this.price = price;
	}
	public Book(String name, Authors authors[],double price,int qty){
		this.name = id;
		this.authors = authors.clone();
		this.price = price;
		this.qty = qty;
	}
	public String getName(){
		return this.name;
	}
	public Author[] getAuthors(){
		return this.authors;
	}
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public int getQty(){
		return this.qty;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	@Override
	public String toString(){
		String output = "Book[name="+this.getName+",authors={";
		for (int i=0,i<authors.length,i++){
			output = output + authors[i].toString;
			if (i!=authors.length-1){
				output = output+",";
			}
		}
		output=output+"},price="+this.getPrice+",qty="+this.getQty+"]";
	}
	public String getAuthorName(){
		output=authors[0].getName+",";
		for (int i=1,i<authors.length,i++){
			output = output + authors[i].getName;
			if (i!=authors.length-1){
				output = output+",";
			}
		}
	}
	
	
}