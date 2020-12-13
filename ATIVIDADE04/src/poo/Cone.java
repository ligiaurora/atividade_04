package poo;

public class Cone {
	private double z, r;
	private int tinta;

	
	public Cone (double z, double r, int tinta) {
		setZ(z);
		setR(r);
		setTinta(tinta);
	}
	
	public Cone() {
		
	}
	
	public Cone(double z, int tinta) {
		setZ(z);
		setTinta(tinta);
		
	}
	public Cone(int tinta) {
		setTinta(tinta);
	}
	
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		if (z > 0)
		this.z = z;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		if (tinta==1) {}
		else if (tinta==2){}
		else {}
		this.r = r;
	}


	public int getTinta() {
		return tinta;
	}

	public void setTinta(int tinta) {
		this.tinta = tinta;
	}

		
	public double geratriz(){
		return Math.sqrt(Math.pow(z, 2)+Math.pow(r, 2));
	}

	public double areafundo() {
		return 3.14 * Math.pow(r, 2);
	}
	
	public double arealateralcone() {
		return 3.14*r*geratriz();
	}

	public double areatotal() {
		return arealateralcone()*(r+ geratriz());
	}
	
	public double litros(){
		return 3.14*areatotal();
	}
	
	public double latas() {
		return Math.round(litros() /18);
	}
	
	public double precototal() {
		if (tinta==1) {
		return 238.90 * latas();
		}
		else if (tinta==2) {
		return 467.98 *latas ();	
		}
		else {
		return 758.34*latas();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [z=");
		builder.append(z);
		builder.append(", r=");
		builder.append(r);
		builder.append(", tinta=");
		builder.append(tinta);
		builder.append(", getZ()=");
		builder.append(getZ());
		builder.append(", getR()=");
		builder.append(getR());
		builder.append(", getTinta()=");
		builder.append(getTinta());
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", areafundo()=");
		builder.append(areafundo());
		builder.append(", arealateralcone()=");
		builder.append(arealateralcone());
		builder.append(", areatotal()=");
		builder.append(areatotal());
		builder.append(", litros()=");
		builder.append(litros());
		builder.append(", latas()=");
		builder.append(latas());
		builder.append(", precototal()=");
		builder.append(precototal());
		builder.append("]");
		return builder.toString();
	}
	
	
	
		
}
