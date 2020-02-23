package day32_custommethods;

import org.w3c.dom.ls.LSOutput;

public class EstySearch {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsy();
        searchForWoodenSpoon();
        printresults();
    }
    public static  void openBrowser(){

        System.out.println("Click on Chrome icon");
        System.out.println("wait for browser to load");
        System.out.println("--------------");
    }
    public static void navigateToEtsy(){

        System.out.println("Type etsy.com to address bar");
        System.out.println("Click on Enter");
        System.out.println("---------------");

    }
    public static void searchForWoodenSpoon(){
        System.out.println("Type wooden spoon into search field");
        System.out.println("Click on search icon");
        System.out.println("----------------");
    }
    public static void printresults(){
        System.out.println("Total results: wooden spoon (14,581 Results)");

    }

}
