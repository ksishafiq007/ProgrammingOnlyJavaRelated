/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author KSI
 */
public class VectorCheck {
    public static void main(String args[]){      
  Vector<String> v=new Vector<String>();//creating vector  
  v.add("Rikta");//method of Collection  
  v.addElement("Arman");//method of Vector  
  v.addElement("Rita");  
  //traversing elements using Enumeration  
  Enumeration e=v.elements();  
  while(e.hasMoreElements()){  
   System.out.println(e.nextElement());  
  }  
 }   
    
}
