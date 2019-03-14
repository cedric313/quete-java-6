public class Wilder {
	//attributs
	private String firstName;
	private boolean aware;
	//constructeur
	public Wilder(String firstNameV , boolean awareV) {
	
		this.firstName = firstNameV;
		this.aware = awareV;
	}
	//getter
	public String getFirstName() {
		return this.firstName;
	}
	
	public boolean isAware() {
		return this.aware;
	}
	//setter
	public void setFirstname(String firstNameModified) {
		this.firstName = firstNameModified;
	}
	
	public void setAware(boolean awareModified) {
		this.aware = awareModified;
	}
	//methode whoAmI
	public String whoAmI() {
        	if (isAware() == true) {
			return "Je m'appelle " + this.getFirstName() + " and I'm aware.";
		} else {

		return "Je m'appelle " + this.getFirstName() + " and I'm not aware ";

		}


    	}

}
