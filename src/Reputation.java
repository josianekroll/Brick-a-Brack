
public enum Reputation {
	
    HOT("hot"),
    Warm("warm"),
    Cool("cool"),
	Cold("cold");
 
    private String description;
 
    Reputation(String description) {
        this.description = description;
    }
 
    public String getDescription() {
        return description;
    }



}
