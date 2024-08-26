/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author cle13
 */
public class Rectangle {
    private double width, height;
    private String color = "";
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        String tmp = color.toLowerCase();
        this.color += String.valueOf(tmp.charAt(0)).toUpperCase();
        this.color += tmp.substring(1, tmp.length());
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width; 
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return height*width;
    }
    public double findPerimeter(){
        return (height+width)*2;
    }
    @Override
    public String toString(){
        return String.format("%.0f",findPerimeter())+" "+String.format("%.0f",findArea())+" "+color;
    }
    
}