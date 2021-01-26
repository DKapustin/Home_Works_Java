class Point{
	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		this.x = 0.0;
		this.y = 0.0;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public void translate(double x, double y){
		this.x = this.x+x;
		this.y = this.y+y;
	}
	public void scale(double coeff){
		this.x = this.x*coeff;
		this.y = this.y*coeff;
	}
}