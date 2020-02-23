package day49_Overriding_final;

public class Google extends SearchEngine{

    @Override
    public int search(String item){
        System.out.println("Googling for ..."+ item +"\nreturning results count..");
        return item.length() *2 ;
    }
    @Override
    public void getResults(){
        System.out.println("Google displaying result...");

    }
    public void getResults(int num){
        System.out.println("Google displaying result..." + num); //EX: OF OVERLOADING

    }

   public  String clickResult(){
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";
    }
}
