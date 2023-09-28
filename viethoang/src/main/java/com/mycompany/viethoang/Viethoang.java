/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viethoang;

/**
 *
 * @author HOANG
 */
public class Viethoang {

   public static void main(String[] args) {
        Person person = new Person("123hoangxxx@gmai.com", "viethoang", 2004, "Male", "0356645624", "123 Main St","QE180166" );
        person.changePhoneNumber("987654321");
        person.changeAddress("456 New St");
        person.displayInfo();
        
    }
}
