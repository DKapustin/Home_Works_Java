class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id,String firstName,String lastName, int salary){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getID(){
		return this.id;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getName(){
		return this.firstName+" "+this.lastName;
	}
	public int getSalary(){
		return this.salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getAnnualSalary(){
		return this.salary*12;
	}
	public int raiseSalary(int percent){
		return this.salary+this.salary*percent/100;
	}
	@Override
	public String toString(){
		return "Employee[id="+this.id+",name="+this.getName()+",salary="+this.salary+"]";
	}
	public boolean equals(Employee employee){
		if ((this.id == employee.getID()) && (this.getName().equals(employee.getName())) && (this.salary == employee.getSalary())){
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