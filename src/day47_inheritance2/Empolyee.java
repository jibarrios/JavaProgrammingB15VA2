package day47_inheritance2;

public class Empolyee extends Object {
    private String name;
    private String title;

    public Empolyee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Empolyee(){
    super();
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
