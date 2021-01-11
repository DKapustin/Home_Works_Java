class MyTriangle extends MyPoint{
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3){
		this.v1.setXY(x1,y1);
		this.v2.setXY(x2,y2);
		this.v3.setXY(x3,y3);
	}
	public MyTriangle(MyPoint v1,MyPoint v2, MyPoint v3){
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}
	@Override
	public String toString(){
		return "MyTriangle[v1=("+v1.getX+","+v1.getY+"),v2=("+v2.getX+","+v2.getY+"),v3=("+v3.getX+","+v3.getY+")]";
	}
	public double getPerimetr(){
		return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
	}
	public String getType(){
		//if (v1.distance(v2)==v1.distance(v3) && v1.distance(v2)==v2.distance(v3)){
		//	return "Equilateral";
		//} else 
		if(v1.distance(v2)==v1.distance(v3) || v1.distance(v2)==v2.distance(v3) || v1.distance(v3)==v2.distance(v3)){
			return "Isosceles";}
		else{
			return "Scalene";
		}
	}
	public MyPoint getV1(){
		return this.v1;
	}
	public MyPoint getV2(){
		return this.v2;
	}
	public MyPoint getV3(){
		return this.v3;
	}
	public boolean equals(MyTriangle triangle){
		if((this.v1==triangle.getV1())&&(this.v2==triangle.getV2())&&(this.v3==triangle.getV3())){
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode(){
		String str = ""+this.v1.getX()+this.v1.getY()+this.v2.getX()+this.v2.getY()+this.v3.getX()+this.v3.getY();
		int hash = 0;
		char [] ch = str.toCharArray();
		int p =31;
		for (int i=0;i<str.length();i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
		
	}
}