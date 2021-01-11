class MyComplex{
	private double real = 0.0;
	private double imag = 0.0;
	
	public MyComplex(){}
	public MyComplex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	public double getReal(){
		return this.real;
	}
	public void setReal(double real){
		this.real = real;
	}
	public double getImag(){
		return this.imag;
	}
	public void setImag(double imag){
		this.imag = imag;
	}
	public void setValue(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	@Override
	public String toString(){
		return "("+this.real+"+"+this.imag+"i)"
	}
	public boolean isReal(){
		if (this.real!=0.0){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isImaginary(){
		if (this.imag!=0.0){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean equals(double real, double imag){
		if ((this.real == real)&&(this.imag==imag)){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean equals(MyComplex another){
		if ((this.real == another.real)&&(this.imag == another.imag)){
			return true;
		}
		else {
			return false;
		}
	}
	public double magnitude(){
		return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
	} 
	public double argument(){
		return Math.atan(Math.tan(this.imag/this.real));
	}
	public MyComplex add(MyComplex right){
		this.real = this.real + right.real;
		this.imag = this.imag + right.imag;
		return this;
	}
	public MyComplex addNew(MyComplex right){
		MyComplex Sum = new MyComplex();
		Sum.real = this.real + right.real;
		Sum.imag = this.imag + right.imag;
		return Sum;
	}
	public MyComplex subtract(MyComplex right){
		this.real = this.real - right.real;
		this.imag = this.imag - right.imag;
		return this;
	}
	public MyComplex subtractNew(MyComplex right){
		MyComplex Sub = new MyComplex();
		Sub.real = this.real - right.real;
		Sub.imag = this.imag - right.imag;
		return Sub;
	}
	public MyComplex multiply(MyComplex right){
		this.rael = this.real*right.real - this.imag*right.imag;
		this.imag = this.real*right.imag + this.imag*right.real;
		return this;
	}
	public MyComplex divide(MyComplex right){
		this.real = (this.real*right.real + this.imag*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
		this.imag = (this.imag*right.real - this.real*right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
		return this;
	}
	public MyComplex conjugate(){
		MyComplex Conj = new MyComplex();
		Conj.real = this.real;
		Conj.imag = this.imag*(-1);
		return Conj;
	}
	public int hashCode(){
		String str = ""+this.real+this.imag;
		int hash =0;
		char [] ch = str.toCharArray();
		int p=31;
		for (int i=0;i<str.length();i++){
			hash+=ch[i]*Math.pow(p,(str.length()-1-i));
		}
		return hash;
	}
}