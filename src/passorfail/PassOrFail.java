/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passorfail;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class PassOrFail {
    static Scanner sc=new Scanner(System.in);
    static int[] weights=new int[4];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        for (int i=0;i<10;i++) {
            doTestCase();
        }
    }

    private static void doTestCase() {
        for (int i=0;i<4;i++) {
            weights[i]=sc.nextInt();
        }
        int passCount=0;
        int noStudent=sc.nextInt();
        for (int i=0;i<noStudent;i++) {
            int studentFinal=getStudentFinal();
            if (studentFinal>=5000) passCount++;
        }
        System.out.println(passCount);
    }

    private static int getStudentFinal() {
        int iRet=0;
        for (int i=0;i<4;i++) {
            iRet+=sc.nextInt()*weights[i];
        }
        return iRet;
    }
    
}
