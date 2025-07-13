public class Plant1{
    private String name;
    private String comments;
    public Plant1(String name, String comments){
        this.name = name;
        this.comments = comments;
    }
    
    public String getName(){
        return name;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setComments(String comments){
        this.comments = comments;
    }
    
    public String toString(){
        return "Name: " + getName() + "\nComments: " + getComments();
    }
}
