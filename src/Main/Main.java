/*
* Created by Intellij IDEA
* User: Tavishi123-singh
 */
package Main;

import ArrayADT.MyArrayADT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size=10;
        MyArrayADT obj=new MyArrayADT(size);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < size; i++) {
            if(obj.insert(sc.nextInt())){
                System.out.println("Insert successfully");
            }
            else {
                System.out.println("Array is full");
            }
        }

        obj.traverse();
        obj.delete();
        obj.traverse();
        if(obj.search(4)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
        System.out.println("Original Array....");
        obj.traverse();
    }
}
