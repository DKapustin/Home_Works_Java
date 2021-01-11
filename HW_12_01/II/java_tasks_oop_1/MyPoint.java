class MyPoint{
	private int x;
	private int y;
	public MyPoint(){}
	public MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	public int getX(){
		return this.x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		this.y=y;
	}
	public int[] getXY(){
		int [] XY = new int []{this.x,this.y}
		return XY;
	}
	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	public double distance(int x, int y){
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
	}
	public double distance(MyPoint another){
		return Math.sqrt(Math.pow(this.x-another.x,2)+Math.pow(this.y-another.y,2));
	}
	public double distance(){
		return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
	}
	public boolean equals(MyPoint point){
		if ((this.x==point.getX())&&(this.y == point.getY())){
			return true;
		}
		else{
			return false;
		}
	}
	public int hashCode(){
		String str = ""+this.x+this.y;
		char [] ch = str.toCharArray();
		int hash = 0;
		int p=31
		for (int i=0;i<str.length(); i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
	}
}