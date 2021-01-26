class Ball{
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	public Ball(float x, float y, int radius, int speed, int direction){
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.xDelta = (float)(speed * Math.cos(direction*Math.PI/180));
		this.yDelta = (-1.0F)*speed*Math.sin(direction*Math.PI/180);
	}
	public float getX(){
		return this.x;
	}
	public void setX(float x){
		this.x=x;
	}
	public float getY(){
		return this.y;
	}
	public void setY(float y){
		this.y=y;
	}
	public int getRadius(){
		return this.radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public float getXDelta(){
		return this.xDelta;
	}
	public void setXDelta(float xDelta){
		this.xDelta=xDelta;
	}
	public float getYDelta(){
		return this.yDelta;
	}
	public void setYDelta(float yDelta){
		this.yDelta=yDelta;
	}
	public void move(){
		this.x+=this.xDelta;
		this.y+=this.yDelta;
	}
	public void reflectHorizontal(){
		this.xDelta = this.xDelta*(-1);
	}
	public void reflectVertical(){
		this.yDelta = this.yDelta*(-1);
	}
	@Override
	public String toString(){
		return "Ball[("+this.x+","+this.y+"),speed =("+this.xDelta+","+this.yDelta+")]";
	}
	public boolean equals(Ball ball){
		if((this.x == ball.getX())&&(this.y == ball.getY())&&(this.radius == ball.getRadius())&&(this.xDelta == ball.getXDelta())&&(this.yDelta == ball.getYDelta())){
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode(){
		String str = ""+this.x+this.y+this.radius+this.xDelta+this.yDelta;
		int hash =0;
		char [] ch = str.toCharArray();
		int p=31;
		for (int i=0;i<str.length();i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
	}
}