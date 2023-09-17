public class Type implements Cloneable{
    private String name;
    public Type(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    @Override
    protected Object clone(){
        try{

            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
