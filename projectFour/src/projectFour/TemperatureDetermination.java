package projectFour;

public class TemperatureDetermination {
	//create variables
	private double ftemp;
	private double ctemp;
	private double ktemp;
	
	//create constructor
	public TemperatureDetermination(double inputFTemp){
		ftemp = inputFTemp;
		ctemp = (5.0/9.0)*(inputFTemp - 32.0);
		ktemp = ((5.0/9.0)*(inputFTemp -32.0))+273.0;
	}
	
	//create get set | accessors mutators
	public double getFtemp() {
		return ftemp;
	}
	
	public void setFtemp(double ftemp) {
		this.ftemp = ftemp;
	}

	public double getCtemp() {
		return ctemp;
	}

	public void setCtemp(double ctemp) {
		this.ctemp = ctemp;
	}

	public double getKtemp() {
		return ktemp;
	}

	public void setKtemp(double ktemp) {
		this.ktemp = ktemp;
	}
	
}
