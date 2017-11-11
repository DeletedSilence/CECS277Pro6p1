
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double salary;
	/**
	 * default constructor
	 */
	 public BasePlusCommissionEmployee() {
		 super();
	 }
	 /**
		 * overloaded constructor
		 * @param f firstname
		 * @param l lastname
		 * @param s ssn 
		 * @param sal salary
		 * @param p percentage
		 * @param sa sales
		 */
	 public BasePlusCommissionEmployee(String f, String l,String s, double sal,double p,double sa) {
		 super(f,l,s,sa,p);
		 salary = sal;
	 }
	 //setters and getters
	 public double getSalary() {
		return salary;
	}
	public void setSalary(double bonus) {
		this.salary = bonus;
	}
	/**
	 * calculates the earnings of the basepluscommission employee class
	 */
	public double earnings() {
		return super.earnings()+salary;
	}
	/**
	 * returns the hashcode of each object by calculating the objects attribute values
	 */
	@Override
	public int hashCode() {
		return super.hashCode()+(int)salary;
	}
	/**
	 * determines whether two objects are equal by checking their attributes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (!super.equals(obj)||getClass() != obj.getClass())
			return false;
		else{
			BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
			if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
				return false;
			return true;
		}
	}
	/**
	 * Prints attributes of the BasePlusCommission employee class
	 */

	public String toString(){
			return  "BasePlus"+super.toString()+"Salary: "+salary;
	}


}
