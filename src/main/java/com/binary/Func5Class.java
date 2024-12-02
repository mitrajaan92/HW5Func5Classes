package com.binary;

public class Func5Class {

    public int findLargest( int n1, int n2, int n3){
        int result =0;
        if(n1 >= n2 && n1 >=n3){
            result = n1;
        }
        else if(n2 >= n1 && n2 >=n3){
            result = n2;
        }
        else{
            result = n3;
        }
        System.out.println("The largest number is: "+result);
        return result;
    }
    public void checkVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("--> "+ c+" :is a vowel!");
        }
        else{
            System.out.println("--> "+c+" :Not a vowel!");
        }
    }
    public void checkAgeForVote(int age){
        if(age >= 18){
            System.out.println("This person is eligible to vote!");
        }
        else{
            System.out.println("Not eligible to vote!");
        }
    }
    public void calcFactorial(int n){
        int result =0;
        int num =n;
        if(n == 0){
            result =1;
        }
        else{
            result = n;
            System.out.println(" n = "+ n);
            while( n > 1){
                n--;
                result = result * n;

            }
        }
        System.out.println("The result for the factorial "+ num  +"! = "+ result);
    }
    public void sumEven(){
        int sum =0;
        for(int i=0; i <= 100; i++){
            if(i%2 == 0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of all the even numbners from 1 to 100 = "+sum);
    }
}
