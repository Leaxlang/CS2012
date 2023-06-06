package museum;

public class Dinasaurs extends Artifact {
	private String typeOfDinasaur; 

	public Dinasaurs(String name) {
		super(name);
	}
	
	public Dinasaurs(String nameOfThisArtifact, String typeOfDinasaur, String descrption, String year) {
		super(nameOfThisArtifact);
		this.typeOfDinasaur = typeOfDinasaur;
		setDescription(descrption);
		setWhatYear(year);
	}
	
	public String getTypeOfDinasaur() {
		return typeOfDinasaur;
	
	}
	public void setTypeOfDinasaur(String typeOfDinasaur) {
		this.typeOfDinasaur = typeOfDinasaur;
	}
	public String toString() {
		return "Type of DinAsaur: " + this.typeOfDinasaur;
	}

}
