class Rectangle{
	private float length = 1.0f;
	private float width = 1.0f;
	public Rectangle(){}
	public Rectangle(float length,float width){
		this.length = length;
		this.width = width;
	}
	public float getLength(){
		return this.length;
	}
	public void setLength(float length){
		this.length = length;
	}
	public float getWidth(){
		return this.width;
	}
	public void setWidth(float width){
			this.width = width;
	}
	public double getArea(){
		return this.length*this.width;
	}
	public double getPerimetr(){
		return 2*(this.length+this.width);
	}
	@Override
	public String toString(){
		return "Rectangle[length="+this.length+",width="+this.width+"]";
	}
	public boolean equals(Rectangle rectangle){
		if ((this.length == rectangle.getLength())&&(this.width==rectangle.getWidth())){
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode(){
		String str = ""+this.length+this.width;
		int hash =0;
		char [] ch = str.toCharArray();
		int p =31;
		for (int i=0;i<str.length();i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
	}
}