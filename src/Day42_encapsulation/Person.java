package Day42_encapsulation;
/*
name should not be empty
age can only be 0 - 170
 */
public class Person{
    //encapsulate below variables
    private String name;
    private int age;

    public  void setAge(int newAge){
        if(newAge > 0 && newAge <= 170){
            age= newAge;
        }else{
            System.out.println("ERROR: Invalid age - " +  newAge);
        }
    }
    public int getAge(){
        return age;
    }

//private only accessible in the same class
    //getter/setter for name
    // read only

    public String getName(){
        return name;

    }


    public void setName(String newName){
        if(!newName.isEmpty()){
            name = newName;
        }else{
            System.out.println("ERROR: Name cannot be Empty");
        }
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
