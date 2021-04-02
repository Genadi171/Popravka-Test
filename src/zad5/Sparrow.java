package zad5;

public class Sparrow implements IBird{
    private String name;

    public void sleep(){
        System.out.println(this.name+" is sleeping");
    }
    public void eat(){
        System.out.println(this.name+" is eating");
    }
    public void walk(){
        System.out.println(this.name+" is walking");
    }
    public void fly(){
        System.out.println(this.name+" is flying");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sparrow(String name) {
        this.name = name;
    }
}
