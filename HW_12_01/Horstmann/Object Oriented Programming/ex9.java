class Car{
	private double gallons;
	private double x;
	private double milesGallons = 12;
	public Car(){}
	public Car(double x, double gallons, double milesGallons){
		this.x = x;
		this.gallons = gallons;
		this.milesGallons = milesGallons;
	}
	public double getX(){
		return this.x;
	}
	public double getGallons(){
		return this.gallons;
	}
	public double getMilesGallons(){
		return this.milesGallons;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setGallons(double gallons){
		this.gallons = gallons;
	}
	public void setMilesGallons(double milesGallons){
		this.milesGallons = milesGallons;
	}
	public double countGallonsForFinalPoint(double finalPoint){
		double distance = Math.abs(finalPoint - this.x);
		return distance/milesGallons;
	}
	public double getMiles(){
		return gallons*milesGallons;
	}
	public double countGallonsForDistant(double distance){
		return distance/milesGallons;
	}
	public void addGallons(double gallons){
		this.gallons+=gallons;
	}
	public double [] distancedAndGallonsLevel(double finalPoint){
		double [] dagl = new double[2];
		double distance = Math.abs(finalPoint - this.x);
		double gallonsLeval = this.gallons - countGallonsForDistant(distance);
		dagl[0]= distance;
		dagl[1]=gallonsLeval;
	}
	
	
}