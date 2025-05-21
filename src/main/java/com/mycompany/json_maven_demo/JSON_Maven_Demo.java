/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.json_maven_demo;

import org.json.JSONObject;

public class JSON_Maven_Demo {

    public static void main(String[] args) {
        //Classname ObjectName = new ClassName();
        JSONObject person = new JSONObject();
        person.put("name", "Jake");
        person.put("age", 30);
        person.put("isStudent", false);
        
        System.out.println(person.toString(4));
        
        
        
    }
}
