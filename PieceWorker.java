
public class PieceWorker extends Employee{
	private double wage;
	private int piece;

	public PieceWorker() {
		super();
		wage = 5.0;
		piece = 0;
	}


	public PieceWorker(String f, String l, String s,double w,int p) {
		super(f, l, s);
		wage = w;
		piece = p;
	}


	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}


	public int getPiece() {
		return piece;
	}


	public void setPiece(int piece) {
		this.piece = piece;
	}
	


	@Override
	public int hashCode() {
		return super.hashCode()+(int)wage+piece;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj)||getClass() != obj.getClass())
			return false;
		else{
			PieceWorker other = (PieceWorker) obj;
			if (piece != other.piece)
				return false;
			if (Double.doubleToLongBits(wage) != Double.doubleToLongBits(other.wage))
				return false;
			return true;
		}
	}


	@Override
	double earnings() {
		return wage*piece;
	}


	@Override
	public String toString() {
		return "PieceWorker \n" + super.toString()+"Wage: "+wage+"\n"+"Piece: "+piece+"\n";
	}

	
	

}
