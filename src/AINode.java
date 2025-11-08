public class AINode {
    private int id;
    private String name;
    private String region;
    private String status;
    
    public AINode(int id, String name, String region, String status){
        this.id = id;
        this.name = name;
        this.region = region;
        this.status = status;
    }

    public int getId(){ return id; }
    public String getName() { return name;}
    public String getRegion() { return region;}
    public String getStatus() { return status;}

    @Override
    public String toString(){
        return String.format("[%s] (%s) - %s", name, region, status);
    }
}
