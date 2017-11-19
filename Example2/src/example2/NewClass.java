/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author Arod6
 */


class NewClass {
    private int num;

    public NewClass(int newNum) {
        num = newNum;
    }
    public NewClass(){
        
    }
    public int getNum(){
        return num;
    }
   
    public void setNum(int newValue){
        num = newValue;
    }

    @Override
    public String toString() {
        //System.out.println(" hola"+getNum());
        return "toString "+getNum();
    }
    
    
}
