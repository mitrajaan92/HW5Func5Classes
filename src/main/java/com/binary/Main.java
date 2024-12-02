package com.binary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Func5Class obj1 = new Func5Class();
        System.out.println("_____________________________Func: checkVowel_____________________________________");
        obj1.checkVowel('e');
        System.out.println("_____________________________Func: checkVowel_____________________________________");
        String word = "Hello";
        int size = word.length();
        int counter = 0;
        while(counter < size){
            char c = word.charAt(counter);
            obj1.checkVowel(c);
            counter++;
        }
        System.out.println("_____________________________Func: calcFactorial_____________________________________");
        obj1.calcFactorial(0);
        System.out.println("_____________________________Func: sumEven_____________________________________");
        obj1.sumEven();
        System.out.println("_____________________________Class: Student______________________________________");
        Student student = new Student("John", 12, 7);
        System.out.println("Student age is: "+ student.getName());
        System.out.println("_____________________________Class: Rectangle______________________________________");
        Rectangle rec = new Rectangle();
        rec.setLength(10);
        rec.setHeight(5);
        int perimeter = rec.calcPerimeter();
        int area = rec.calcArea();
        System.out.println("Area = "+ area +" Perimeter = "+perimeter);
        System.out.println("_____________________________Class: BankAccount______________________________________");
        BankAccount acc = new BankAccount();
        acc.setAccNumber(1234);
        acc.setBalance(100);
        acc.deposite(200);
        acc.withdraw(450);
        System.out.println("_____________________________Class: Product______________________________________");
        Product p1 = new Product(1,"Candy", 1.50);
        System.out.println(p1.getProductID());
        System.out.println(p1.getProductName());
        System.out.println(p1.getPrice());
        Product p2 = new Product(2,"Bell", 5.50);
        System.out.println(p2.getProductID());
        System.out.println(p2.getProductName());
        System.out.println(p2.getPrice());
        System.out.println("_____________________________Class: Book______________________________________");
        Book b1 = new Book("Red Hat", "John Blue", "isbn123", true);
        Book b2 = new Book("Dragon Master", "Micheal Pop", "isbn4567", true);
        System.out.println("Author: "+b1.getAuthor() +" Title: "+b1.getTitle()+" ISBN: "+ b1.getIsbn()+" Available: "+b1.isAvailable());
        System.out.println("Author: "+b2.getAuthor() +" Title: "+b2.getTitle()+" ISBN: "+ b2.getIsbn()+" Available: "+b2.isAvailable());
        b2.setAvailable(false);
        System.out.println("Author: "+b2.getAuthor() +" Title: "+b2.getTitle()+" ISBN: "+ b2.getIsbn()+" Available: "+b2.isAvailable());
    }
}