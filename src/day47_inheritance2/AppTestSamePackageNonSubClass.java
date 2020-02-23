package day47_inheritance2;

public class AppTestSamePackageNonSubClass {
    public static void main(String[] args) {
        App app = new App();
        app.name = "Evernote";
        app.developer = "Evernote LLC";
        app.system = "iOS, Android, Google";
        //app.price = 22.33 (private) no access directly

    }
}
