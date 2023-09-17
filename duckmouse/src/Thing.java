public class Thing implements Cloneable{
    private Type type;
    private String name;
    public Thing(String n,String type){
        name = n;
        this.type = new Type(type);
    }
    public String getName(){
        return name;
    }
    public Type getType(){
        return type;
    }
    public void setName(String n){
        name = n;
    }
    public void print(){
        System.out.println(this.name+"是"+this.getType().getName());
    }
    public Object cook(){
        return clone();
    }
//    @Override
//    protected Object clone(){
//        try{
//            Thing thing = (Thing) super.clone();
//            thing.type = (Type) type.clone();
//            return thing;
//        }catch (CloneNotSupportedException e){
//            return null;
//        }
//    }
    //2.熟鼠不能吃，熟鸭能吃

    @Override
    protected Object clone(){
        try{
            Thing thing = (Thing) super.clone();
            thing.type = (Type) type.clone();
            return thing;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }

}
