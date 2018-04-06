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
public class ThisKeyWorldExample2 {
    private int value1;
    private int value2;
    private int value3;
    
    public ThisKeyWorldExample2(){
        this.value1=5;
        this.value2=8;
        this.value3=165;
    }

    public ThisKeyWorldExample2(int v1, int v2) {
        this.value1 = v1;
        this.value2 = v2;
    }

    public ThisKeyWorldExample2(int v1, int v2, int v3) {
        this.value1 = v1;
        this.value2 = v2;
        this.value3 = v3;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }
    
    
}
