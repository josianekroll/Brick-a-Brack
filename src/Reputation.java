
public enum Reputation {
	
    Excellent("excelent"),
    VeryGood("very good"),
    Good("good"),
	Fair("fair"),
	NotSoGood("not so good"),
	Bad("bad");
 
    private String description;
 
    Reputation(String description) {
        this.description = description;
    }
 
    public String getDescription() {
        return description;
    }

}
