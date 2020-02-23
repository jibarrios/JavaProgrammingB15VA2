package day49_Overriding_final;

public class SearchEngine {


    public int search(String item){
        System.out.println("Search for ... "+ item +"\nreturning results count..");
        return item.length();
    }
    public int search(String item, String item2){
        System.out.println("Search for ... "+ item +"\nreturning results count..");
        return item.length();
    }
    protected void getResults(){
        System.out.println("Search Engine displaying result...");
    }
    String clickResult(){// this is Considered Default (access Modifier)
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";
    }


    }

