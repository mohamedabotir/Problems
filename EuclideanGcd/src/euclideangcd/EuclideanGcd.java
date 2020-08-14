/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclideangcd;

/**
 *
 * @author Threading
 */
public class EuclideanGcd {

    static int gcd(int a,int b){//54/24=2 54=r+24*2 ,24/6=4 24=r+4*6 r=0
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(54,24));
    }
    
}
