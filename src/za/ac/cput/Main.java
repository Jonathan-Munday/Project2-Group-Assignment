/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

/**
 *
 * @author JonathansPC
 */
public class Main {
    public static void main(String[] args) {
    
    // create a list
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(60);
    list.add(30);
    list.add(40);
    list.add(50);
    
    Collections.sort(list);//sorts in ascending order
    System.out.println(list);
    
    Collections.reverse(list);//sorts in descending order
    System.out.println(list);
    
    }
    
}
