package co.runcode.dm.commons;

public enum Status {
	
	HISTORIC("Historic", 'H'),
	ACTIVE("Active", 'A');
	
	private final String name; 
    private final char representation; 
    
    Status(String name, char representation) {
        this.name = name;
        this.representation = representation;
    }

	public String getName() {
		return name;
	}

	public char getRepresentation() {
		return representation;
	}

}
