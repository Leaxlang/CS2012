package museum;

public class MedievalArmor extends Artifact implements Cursed{
	
	private String nameOfThisArtifact;
	private String originalOwner;
	private boolean isCursed;
	private boolean magicSealActivated;
	private String armorType;

	public MedievalArmor(String name) {
		super(name);
	}
	
	public MedievalArmor(String nameOfThisArtifact, String originalOwner, boolean isCursed, boolean magicProtection, String descrption, String fromYear, String armorType) {
		super(nameOfThisArtifact);
		this.originalOwner = originalOwner;
		this.isCursed = isCursed;
		this.magicSealActivated = magicProtection;
		this.armorType = armorType;
		setDescription(descrption);
		setWhatYear(fromYear);
	}
	
	 public String getArmorType() {
		return armorType;
	 }
	 
     public void setArmorType(String armorType) {
    	 this.armorType = armorType;
     }
     
     public String getOriginalOwner() {
		return originalOwner;
     }
     
     public void setOriginalOwner(String originalOwner) {
 		this.originalOwner = originalOwner;
     }
    

	@Override
	public String toString() {
		String tempstr = super.toString() 
				+ "\nType of Armor: " + this.armorType 
				+ "\nOriginal Owner: " + this.originalOwner
				+ "\nArtifact is Cursed: " + isCursed 
				+ "\nProtected by Magic Seal: " + this.magicSealActivated;

		return tempstr;
	}
	@Override
	public void applyMagicSeal() {
		magicSealActivated = true;
	}

	@Override
	public boolean checkMagicSeal() {
		return magicSealActivated;
	}

	@Override
	public boolean getIsCursed() {
		return isCursed;
	}

	@Override
	public void setIsCursed(boolean x) {
		isCursed = x;
	}

	@Override
	public void removeMagicSeal() {
		magicSealActivated = false;
	}

}
