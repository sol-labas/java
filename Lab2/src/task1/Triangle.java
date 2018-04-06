/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Angela.Kuznetsova
 */
public class Triangle {
    double base;
    double height;

    public static void main(String[] args) {
        Triangle obj1 = new Triangle(16, 5);
        obj1.area(obj1);
    }
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public void area(Triangle t1){
        double areaT = 0.5*t1.base*t1.height;
        System.out.println("this is area"+areaT);
                
    
    }
    
}
