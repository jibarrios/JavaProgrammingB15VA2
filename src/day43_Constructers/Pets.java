package day43_Constructers;

public class Pets {
    private String type;
    private String name;

    public void speak(){
        System.out.print(name +" is saying ");
        switch (type) {
            case "dog":
                System.out.println("gav gav");
                break;
            case "cat":
                System.out.println("meow meow");
                break;
            case "fish":
                System.out.println("...");
                break;
            case "bird":
                System.out.println("chrek chrek");
                break;
            case "lion":
                System.out.println("rooaarr rooaarr");
                break;
            default:
                System.out.println("java java");


        }
    }

    public void petPetInfo ( String name, String type2){
        type = type2;
        this.name = name;
    }
    public String  gettype (){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String toString() {
        return "pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

