class MyPolynomial{
	private double coeffs[];
	public MyPolynomial(double coeffs[]){
		for (int i =0, i<this.coeffs.length,i++){
			this.coeffs[i]=coeffs[i];
		}
	}
	public int getDegree(){
		return this.coeffs.length-1;
	}
	@Override
	public String toString(){
		String str="";
		if (this.coeffs.length==1){
			return ""+this.coeffs[0];
		}
		if (this.coeffs.length>2){
			String str = this.coeffs[this.coeffs.length-1]+"x^"+(this.coeffs.length-1)+"+";
			for (int i = this.coeffs.length-2,i>1,i--){
				str=str+this.coeffs[i]+"x^"+(i+1)+"+";
			}
		}
		str=str+this.coeffs[1]+"x"+"+"+this.coeffs[0];
		return str;
	}
	public double evaluate(double x) {
		double res = 0.0;
		for (int i = 0; i < this.coeffs.length; i++) {
			res += coeffs[i] * Math.pow(x,i);
		}
		return res;
	}
	public MyPolynomial add(MyPolynomial right){
		MyPolynomial Sum = new MyPolynomial(this.coeffs)
		for (int i = 0,i<right.coeffs.length,i++){
			Sum.coeffs[i]+=right.coeffs[i];
		}
		return Sum;
	}
	public MyPolynomial multiply(MyPolynomial right){
		double new_coeffs[]=new double[(this.coeffs.length+right.coeffs.length)-1];
		MyPolynomial Mult = new MyPolynomial(new_coeffs);
		for (int i=0,i<this.coeffs.length,i++){
			for (int j=0,j<right.coeffs.length,j++){
				Mult.coeffs[i+j]=this.coeffs[i]*right.coeffs[j];
			}
		}
		return Mult;
	}
}