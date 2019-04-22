/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevacalculadora;

/**
 *
 * @author gab12
 */
public class NuevaCalculadora {

    private int num1;
    private int num2;
    private int num3;
    
    NuevaCalculadora (){
    num1 = 10;
    num2 = 20;
    num3 = 30;
    
    }
    
    NuevaCalculadora(int num1, int num2){
    this.setNum1 (num1);
    this.setNum2 (num2);
    }

   public void setNum1 (int num1){
     this.num1 = num1;  
       
   }
   public void setNum2 (int num2){
       this.num2 = num2;
   }
   
   public int getNum1(){
       return this.num1;
   }
   
   public int getNum2(){
       return this.num2;
   }
   
    public int getNum3(){
        return this.num3;
    }
   
}