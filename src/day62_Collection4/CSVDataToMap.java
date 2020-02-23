package day62_Collection4;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.nio.file.*;
import java.io.*;

public class CSVDataToMap {
    public static void main(String[] args) throws Exception {
        // String fileName = "/Users/cybertekb15/Downloads/countryCodes.csv";//filename with path
        String fileName = "countryCodes.csv";//filename with path
        File dataFile = new File(fileName);
        System.out.println(dataFile.exists());
        Scanner scan = new Scanner(dataFile);
        //System.out.println(scan.nextLine());
        //System.out.println(scan.nextLine());
        int counter = 1;
        List<String> fileDataList = new ArrayList<>();
        while (scan.hasNextLine()) {
            String row = scan.nextLine();
            System.out.println(counter + ". " + row);
            fileDataList.add(row);
            counter++;
        }
        scan.close();
        System.out.println(fileName + " contains " + fileDataList.size() + " rows");
        System.out.println("-- READ FROM CSV FILE USING NEW WAY--");
        List<String> countryCodesList = Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodesList.size());
        System.out.println(countryCodesList.get(0));
        System.out.println(countryCodesList.toString());

        Set<String> countryCodesSet = new HashSet<>(countryCodesList);

        System.out.println("unique country Codes count: " + countryCodesList);
        System.out.println(countryCodesSet.toString());


        //Store each CountryCode and country name into map
        //Key -> Country code, value ->
        Map<String, String> countriesMap = new HashMap<>();

        //loop through the countryCodesSet
        for (String eachLine : countryCodesSet) {
            //spilt each value w/ comma
            String[] arr = eachLine.split(",");
            //store index 0 as key, and index as value
            countriesMap.put(arr[0], arr[1]);
        }
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.toString());

        if (countriesMap.containsValue("Mongolia")) {
            System.out.println("Mongolia is in the maps");
        } else {
            System.out.println("Keep coding Java!");

        }

        System.out.println(countriesMap.get("PE"));
        System.out.println(countriesMap.get("US"));
        System.out.println(countriesMap.get("TU"));
        System.out.println(countriesMap.get("KG"));
        System.out.println(countriesMap.get("UA"));
        System.out.println(countriesMap.get("AZ"));
        System.out.println(countriesMap.get("AF"));


        System.out.println("---PRINT ALL VALUES USING FOREACH METHOD + LAMBDA--");
        countriesMap.forEach((k,v) -> System.out.println( k + " | " + v));


        System.out.println("--- PRINT ALL USING FOR EACH LOOP --- ");
        for (String eachKey:countriesMap.keySet()){
            System.out.println(eachKey + " | " + countriesMap.get(eachKey));

        }

        System.out.println("--PRINT ALL VALUES USING ITERATOR AND ENTRYSET--");

        for (Map.Entry<String, String> entry : countriesMap.entrySet()) {
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }





    }



}
