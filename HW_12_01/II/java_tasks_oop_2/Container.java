class Container extends Ball{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Container(int x, int y, int width, int height){
		this.x1=x;
		this.y1=y;
		this.x2=this.x1+width;
		this.y2=this.y1-height;
	}
	public int getX(){
		return this.x1;
	}
	public int getY(){
		return this.y1;
	}
	public int getWidth(){
		return this.x2-this.x1;
	}
	public int getHeight(){
		return this.y1-this.y2;
	}
	public boolean collides(Ball ball){
		if ((ball.getX()-ball.getRadius()>=this.x1) && (ball.getX()+ball.getRadius()<=this.x2) && (ball.getY() + ball.getRadius() <=this.y1)&& (ball.getY()-ball.getRadius() >=this.y2)){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public String toString(){
	return "Container[("+this.x1+","+this.y1+"),("+this.x2+","+this.y2+")]";
	}
	public boolean equals(Container container){
		if((this.x1 == container.getX())&&(this.y1 == container.getY())&&(this.getWidth() == container.getWidth())&&(this.getHeight()==container.getHeight())){
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode(){
		String str = ""+this.x1+this.y1+this.x2+this.y2;
		int hash =0;
		char [] ch = str.toCharArray();
		int p=31;
		for (int i=0;i<str.length();i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
	}
}