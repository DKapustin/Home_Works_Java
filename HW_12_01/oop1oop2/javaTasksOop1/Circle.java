class Circle{
	private double radius = 1.0;
	private String color = "red";
	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	public double getRadius(){
		return this.radius;
	}
	public String getColor(){
		return this.color;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public void setColor(String color){
		this.color = color;
	}
	@Override
	public String toString(){
		return "Circle[radius="+this.radius+",color="+this.color+"]";
	}
	public double getArea(){
		return Math.PI*Math.pow(this.radius,2);
	}
	public double equals(Circle circle){
		if((this.radius == circle.getRadius())&&(this.color.equals(circle.getColor()))){
			return true;
		}
		else{
			return false;
		}
	}
	public Long hashCode(){
		String str = this.toString();
		char [] ch = str.toCharArray();
		Long hash = 0;
		int p = 31;
		for (int i=0;i<str.length(); i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
	}
}