/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.ArrayList;




// a Shape interface class, that will be base for all shapes
interface Shape{
    public void draw();
}


// some random shapes classes to form the village elements 

// Rectangle shape
class Rectangle implements Shape{
    public int height;
    public int width;
    public void  draw(){
        System.out.println("Rectangle Drawn");
    }
}


// a shape with leaf structure
class leaf implements Shape{
    public String color; 
    public void draw(){
        System.out.println("Leaft Drawn");
    }
}

// triangular shape
class triangle implements Shape{
    // sides of triangle
    public int a1;
    public int a2;
    public int a3;
    public void draw(){
        System.out.println("triangle Drawn");
    }
}
// cureved line shape
class curve implements Shape{
    // random properties for this class
    public int a;
    public int b;
    public int  c;
    public void draw(){
        System.out.println("Curve Drawn");
    }
}


// village_property class will have the objects which forms a village. ex. water,tree,river etc
// this will use composite design pattern
class village_property{
    public String name;
    public ArrayList<Shape>shapes_list = new ArrayList<Shape>();
    
    // constructor
    public village_property(String s){
        this.name = s;
        System.out.println(this.name +" Created !");
    }
    // add some shaped to village_property
    public void add_shape(Shape s){
        this.shapes_list.add(s);
    }
}


public class Main
{
        public static void main(String[] args) {
                System.out.println("Creating a village");
                
      //create some shapes to use in our objects 
      Rectangle rectangl1 = new Rectangle();
      Rectangle rectangl2 = new Rectangle();
      triangle  tringle1 = new triangle();
      curve  curv1 = new curve();
      leaf leaf1 = new leaf();
      leaf leaf2 = new leaf();
      
     //start crearting the village's objects  
                
      //create water 
      village_property water = new village_property("water");
      //water will have curves shape, and there is a leaf floating in the water   
      water.add_shape(curv1);
      water.add_shape(leaf1);
      
      //create tree 
      village_property tree = new village_property("tree");
      tree.add_shape(leaf1);
      tree.add_shape(leaf2);
      tree.add_shape(rectangl2);
      
      //create house 
      village_property house = new village_property("house");
      house.add_shape(rectangl1);
      house.add_shape(tringle1);
      house.add_shape(rectangl2);
      house.add_shape(tringle1);
      
      
      
      //if our program runs successfully, it means this representaiton of village objects, will work properly   
      
        }
}