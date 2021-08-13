package com.polymathus.gaggle;

import com.polymathus.gaggle.service.PersonSearch;
import com.polymathus.gaggle.service.Search;
import org.json.simple.JSONObject;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

//        System.out.println("Welcome to Your Search !");
//        System.out.println("Please enter a name, part of a name or the primary key of the record you seek.");
//        System.out.print("What say you? ---> ");
//
//        Scanner scanner = new Scanner (System.in);
//        String userEntry = scanner.next().trim();
//
//        JSONObject formInputJson = new JSONObject();
//        formInputJson.put("personSearch", userEntry);

        JSONObject formInputJson = new JSONObject();
        formInputJson.put("personSearch", "1000");                           //@todo: all this is temporary till we craft the service

        Search personSearchService = new PersonSearch();
        JSONObject output = personSearchService.search(formInputJson);

        System.out.println(output.toString());
    }
}
