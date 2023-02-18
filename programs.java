import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

//Taking input from user
// import java.util.Scanner;
// class programs {
//     public static void main(String[] args) {
//         System.out.println("Enter a number");
//         Scanner obj = new Scanner(System.in);
//         int num = obj.nextInt();
//         System.out.println(num);
//     }
// }

// class programs {
//     public static void main(String[] args) {
//         System.out.println("Enter your percentage");
//         Scanner obj = new Scanner(System.in);
//         Double per= obj.nextDouble();
//         System.out.println(per);
//     }
// }

// class programs {
//     public static void main(String[] args) {
//         System.out.println("Enter your name");
//         Scanner obj = new Scanner(System.in);
//         String name = obj.nextLine();
//         System.out.println(name);
//     }
// }

// class programs{
// public static void main(String a[]){
// int num1=2;
// int num2=12;
// System.out.println("vineet jadhav");
// System.out.println(num1+num2);

// float n1=23.34f;
// double n2=12.45;
// System.out.println(n1);
// System.out.println(n2);
// char b='A';
// System.out.println(b);
// boolean c=true;
// System.out.println(c);

// int x=12;
// byte y=13;
// // x=y;
// y=(byte)x;
// System.out.println(x);

// float m=5.6f;
// int n=(int)m;
// System.out.println(n);

// int k=258;
// byte l=(byte)k;
// System.out.println(l);
// }
// }

// class programs {
// public static void main(String a[]) {
// int n1=20;
// int n2=10;
// System.out.println(n1+n2);
// System.out.println(n1-n2);
// System.out.println(n1*n2);
// System.out.println(n1/n2);
// System.out.println(n1%n2);
// n1+=2;
// System.out.println(n1);

// int num=1;
// // int result=++num;
// int result=num++;
// System.out.println(result);

// final int n1=23;
// // n1=21;
// System.out.println(n1);

// boolean bool= n1>=30 ? true:false;
// System.out.println(bool);
// }
// }

// class programs{
// public static void main(String[] args){
// int array[]={0,1,2,3,4};
// int[] array1={0,1,2,3,4};
// for(int i=0;i<=4;i++){
// System.out.println(array[i]);
// }

// for(int num:array){
// System.out.println(num);
// }
// }
// }

// class programs {
// int age;
// String name;

// public void set_value() {
// age = 21;
// name = "vineet";
// }

// public void get_value() {
// System.out.println("My age is" + age);
// System.out.println("My name is" + name);
// }

// public static void main(String args[]) {
// programs obj = new programs();
// obj.set_value();
// obj.get_value();
// }
// }

// class programs {
// int age;
// String name;
// public programs(int x,String y){
// // age=x;
// // name=y;
// this.age=x;
// this.name=y;
// }
// public void get_values(){
// System.out.println(age);
// System.out.println(name);
// }

// public static void main(String args[]) {
// programs obj=new programs(21,"vineet");
// obj.get_values();
// System.out.println(obj);
// // System.out.println(obj.age);
// // System.out.println(obj.name);
// }
// }

// class programs{
// public static int sum(int x,int y){
// return x+y;
// }
// public static void main(String args[]){
// int store=sum(1,2);
// System.out.println(store);

// }
// }

// class Calc{
// int age;
// String name;
// public void set_value(){
// age=21;
// name="vineet";
// }
// public void get_value(){
// System.out.println(age);
// System.out.println(name);
// }
// }
// class programs{

// public static void main(String args[]){
// Calc obj=new Calc();
// obj.set_value();
// obj.get_value();
// }
// }

// method overloading
// class programs{
// public static int fun(int x,int y){
// return x+y;
// }
// public static double fun(double a,double b){
// return a+b;
// }
// public static void main(String args[]){
// int store1=fun(1,2);
// double store2=fun(1.2,3.4);
// System.out.println(store1);
// System.out.println(store2);
// }
// }

// class programs{
// public static void main(String args[]){
// System.out.println((int)(Math.random()*100));
// }
// }

// class programs{
// public static void main(String args[]){
// int a[]=new int[5];
// for(int i=0;i<=4;i++){
// a[i]=(int)(Math.random()*100);
// }
// for(int i=0;i<=4;i++){
// System.out.println(a[i]);
// }

// }
// }

// class programs {
// public static void main(String args[]) {
// int a[][] = new int[3][4];
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 4; j++) {
// a[i][j] = (int) (Math.random() * 100);
// }
// }
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 4; j++) {
// System.out.print(a[i][j]+" ");
// }
// System.out.println();
// }

// }
// }

// class programs {
// public static void main(String args[]) {
// int a[][] = new int[3][2];

// a[0]=new int[3];
// a[1]=new int[4];
// a[2]=new int[2];

// for (int i = 0; i < a.length; i++) {
// for (int j = 0; j < a[i].length; j++) {
// a[i][j] = (int) (Math.random() * 100);
// }
// }
// for (int i = 0; i < a.length; i++) {
// for (int j = 0; j < a[i].length; j++) {
// System.out.print(a[i][j]+" ");
// }
// System.out.println();
// }
// }
// }

// class programs{
// public static void main(String args[]){
// int a[]=new int[4];
// a[0]=0;
// a[1]=1;
// a[2]=2;
// a[3]=3;
// for(int i=0;i<=3;i++){
// System.out.println(a[i]);
// }
// }
// }

// class Person{
// int age;
// int roll_no;
// String name;
// }
// class programs{
// public static void main(String args[]){
// //object creation
// Person s1=new Person();
// Person s2=new Person();
// Person s3=new Person();

// //value assign
// s1.age=21;
// s1.roll_no=121;
// s1.name="vineet";

// s2.age=22;
// s2.roll_no=122;
// s2.name="Aman";

// s3.age=23;
// s3.roll_no=123;
// s3.name="akshay";

// // Array of students
// Person student[]=new Person[3];
// student[0]=s1;
// student[1]=s2;
// student[2]=s3;
// for(int i=0;i< student.length;i++){
// System.out.println(student[i].age+" "+student[i].roll_no+"
// "+student[i].name);
// }

// //using forEach loop
// // for(Person stud: student){
// // System.out.println(stud.age+" "+stud.roll_no+" "+stud.name);
// // }
// }
// }

// class programs{
// public static void main(String args[]){
// String name="vineet";
// String name=new String("vineet");
// System.out.println(name);
// System.out.println(name.hashCode());
// System.out.println("hello"+" "+name);
// System.out.println(name.charAt(3));
// System.out.println(name.concat(" jadhav"));

// String str1="vineet";
// String str2="jadhav";
// str1=str1+str2;
// System.out.println(str1);

// StringBuffer name=new StringBuffer("vineet");
// System.out.println(name.capacity());//16+6
// name.append("jadhav");
// name.insert(0,"hello");
// System.out.println(name.substring(0, 5));
// System.out.println(name);
// String str=name.toString();
// System.out.println(name);
// }
// }

// static variable and static block and static methods

// class mobiles {
//     String brand;
//     int price;
//     static String name;

//     // constructor
//     public mobiles() {
//         brand = "";
//         price = 200;
//         System.out.println("In constructor");
//     }

//     // used to initilize static variables
//     static {
//         name = "phone";
//         System.out.println("In static block");
//     }

//     // non static method
//     public void show() {
//         System.out.println("in non-static method");
//         System.out.println(name + " " + brand + " " + price);
//     }

//     // static method
//     public static void show1(mobiles obj) {
//         System.out.println("in static method");
//         System.out.println(name + " " + obj.brand + " " + obj.price);
//     }
// }

// class programs {
//     public static void main(String args[]) {

//         mobiles obj1 = new mobiles();
//         obj1.brand = "Iphone";
//         obj1.price = 1500;
//         mobiles.name = "smartphone";

//         mobiles obj2 = new mobiles();
//         obj2.brand = "Samsung";
//         obj2.price = 1200;
//         mobiles.name = "smartphone";

//         mobiles obj3 = new mobiles();
//         obj3.brand = "Xiomi";
//         obj3.price = 1700;
//         mobiles.name = "smartphone";

//         System.out.println(mobiles.name);
//         mobiles.show1(obj1);
//         obj1.show();

//     }
// }

// class programs {
// private int age;
// private String name;

// public void setAge(int age) {
// // age=age;
// this.age = age;
// }

// public int getAge() {
// return age;
// }

// public void setName(String name) {
// // name=name;
// this.name = name;
// }

// public String getName() {
// return name;
// }

// public static void main(String args[]) {
// programs obj = new programs();
// obj.setAge(21);
// System.out.println(obj.getAge());
// obj.setName("vineet");
// System.out.println(obj.getName());

// }
// }

// class A {
// public A() {
// super();//every Constructor Having by default super()
// System.out.println("in A");
// }
// public A(int n) {
// super();
// System.out.println("in A int");
// }
// }

// class B extends A {
// public B() {
// super(5);
// System.out.println("in B");
// }
// public B(int n) {
// super();//it will call the constructor of parent class
// System.out.println("in B int");
// }
// }

// class programs {
// public static void main(String args[]) {
// B obj = new B(2);
// }

// }

// class A {
// public A() {
// super();
// System.out.println("in A");
// }
// public A(int n) {
// super();
// System.out.println("in A int");
// }
// }

// class B extends A {
// public B() {
// super();
// System.out.println("in B");
// }
// public B(int n) {
// this();//it will call all constructors of current class
// System.out.println("in B int");
// }
// }

// class programs {
// public static void main(String args[]) {
// B obj = new B(5);
// }

// }

// class A{
// public A(){
// System.out.println("Object created");
// }
// public void fun(){
// System.out.println("In fun method");
// }
// }
// class programs{
// public static void main(String args[]){
// new A().fun(); //anonymoys object
// }
// }

// inheritance - multilevel
// class Calc{
// public int add(int n1,int n2){
// return n1+n2;
// }
// public int sub(int n1,int n2){
// return n1-n2;
// }
// }
// class AdvCalc extends Calc{
// public int mul(int n1,int n2){
// return n1*n2;
// }
// public int div(int n1,int n2){
// return n1/n2;
// }
// }
// class VeryAdvCalc extends AdvCalc{
// public int mod(int n1,int n2){
// return n1%n2;
// }
// }
// class programs{
// public static void main(String args[]){
// VeryAdvCalc obj=new VeryAdvCalc();
// System.out.println(obj.add(20, 10));
// System.out.println(obj.sub(20, 10));
// System.out.println(obj.mul(20, 10));
// System.out.println(obj.div(20, 10));
// System.out.println(obj.mod(20, 10));
// }
// }

// JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE
// class A{

// }
// class B{

// }
// class C extends A,B{

// }

// method overriding
// class A{
// public int add(int n1,int n2){
// return n1+n2;
// }
// }
// class B extends A{
// public int add(int n1,int n2){
// return n1+n2+1;
// }
// }
// class programs{
// public static void main(String args[]){
// B obj=new B();
// System.out.println(obj.add(2, 3));

// }
// }

// dynamic method dispatch
// polymorphism
// class A{
// public void show(){
// System.out.println("in class A");
// }
// }
// class B extends A{
// public void show(){
// System.out.println("in class B");
// }
// }
// class C extends A{
// public void show(){
// System.out.println("in class C");
// }
// }
// class programs{
// public static void main(String[] args){
// A obj=new A();
// obj.show();
// obj=new B();//here object created of B but A refer to it
// obj.show();
// obj=new C();//here object created of C but A refer to it
// obj.show();
// }
// }

// final variable:used for constant values
// class programs{
// public static void main(String args[]){
// final double PI=3.14;//no one can change this value
// PI=20;
// System.out.println(n);
// }
// }

// final class:no one can inherit final class
// final class A {

// }

// class B extends A {

// }

// class programs {
// public static void main(String args[]) {

// }
// }

// final method:no one can override final method
// class A {
// final public void show() {
// System.out.println("in class A");
// }
// }

// class B extends A {
// public void show() {
// System.out.println("in class B");
// }
// }

// class programs {
// public static void main(String args[]) {
// B obj = new B();
// obj.show();
// }
// }

// upcasting and downcasting
// class A{
// public void show1(){
// System.out.println("in A show");
// }
// }
// class B extends A{
// public void show2(){
// System.out.println("in B show");
// }
// }
// class programs{
// public static void main(String []args){
// //upcasting
// A obj1=(A)new B();
// obj1.show1();

// //downcasting
// B obj2= (B)obj1;
// obj2.show2();
// }
// }

// abstarct method and class - we cant create object of abstact class and
// abstract method should have been defined in sub-class
// abstract class Car { // abstract class
//     public abstract void drive();// not any compulsion that it having abstact
//     // methods

//     public abstract void fly();

//     public void playmusic() {
//         System.out.println("Music played");
//     }
// }

// class Lambo extends Car { // concrete class
//     public void drive() {
//         System.out.println("Driving...");
//     }

//     public void fly() {
//         System.out.println("Flying...");
//     }
// }

// class programs {
//     public static void main(String[] args) {
//         // Car obj1=new Car();
//         Car obj2 = new Lambo();// we can create reference of abstract class
//         obj2.playmusic();
//     }
// }

//innerclass
// class A{
//     int age;
//     public void show(){
//         System.out.println("in Outer class show");
//     }
//    class B{ //inner class
//         int a;
//         public void show1(){
//             System.out.println("in Inner class show");
//         }
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj1=new A();
//         obj1.show();
//         A.B obj=obj1.new B();
//         obj.show1();
//     }
// }

//class A{
//     int age;
//     public void show(){
//         System.out.println("in Outer class show");
//     }
//   static class B{ //inner class
//         int a;
//         public void show1(){
//             System.out.println("in Inner class show");
//         }
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj1=new A();
//         obj1.show();
//         A.B obj=new A.B();
//         obj.show1();
//     }
// }

//anonymous inner class - it doesnt have a class name
// class A {
//     public void show() { //it will overridden by anonomyous inner class
//         System.out.println("in A show");
//     }
// }
// class programs {
//     public static void main(String[] args) {
//         A obj=new A(){
//             public void show() { 
//                 System.out.println("in anonymous inner class show");
//             }
//         };
//         obj.show();
//     }
// }

//abstract and anonymous inner class
// abstract class A {
//     public abstract void show();
// }
// class programs {
//     public static void main(String[] args) {
//         A obj = new A() {// HereWeCreatedObjectOfAnonomyous class notOFAbstractClass
//             public void show() {
//                 System.out.println("in ANONOMYOUS INNER class show");
//             }
//         };
//         obj.show();
//     }
// }

//Interface- if there are only abstract methods in abstract class then we can create interface of it
// interface A{
//     int age=21;//varibale in interface are by default final and static
//     void show();//this methods are by default public abstract
//     void fly();
// }
// class B implements A{
//     public void show(){
//         System.out.println("in Show defination");
//     }
//     public void fly(){
//         System.out.println("in fly defination");
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj=new B();
//         obj.show();
//         obj.fly();
//         // A.age=35;//not possible bcoz- final
//         System.out.println(A.age);//without calling object we can access it-static
//     }
// }

//class - class :extends
//interface - class :implements
//interface - interface :extends
// interface A{
//     void show();
//     void fly();
// }
// interface X{
//     void run();
// }
// interface Y extends X{

// }
// class B implements A,X{
//     public void show(){
//         System.out.println("in Show defination");
//     }
//     public void fly(){
//         System.out.println("in fly defination");
//     }
//     public void run(){
//         System.out.println("in run defination");
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj=new B();
//         obj.show();
//         obj.fly();
//         X obj1=new B();
//         obj1.run();

//     }
// }

//need of interface
// interface Computer {
//     void code();
// }
// class Laptop implements Computer {
//     public void code() {
//         System.out.println("Code run compile");
//     }
// }
// class Desktop implements Computer {
//     public void code() {
//         System.out.println("Code run compile faster");
//     }
// }
// class Developer {
//     public void devApp(Computer obj) {
//         obj.code();
//     }
// }
// class programs {
//     public static void main(String[] args) {
//         Computer desk = new Desktop();
//         Computer lap = new Laptop();
//         Developer dev = new Developer();
//         dev.devApp(desk);
//         dev.devApp(lap);
//     }
// }

//enum
// enum Status{
//     Running,Failed,pending,success;
// }
// class programs{
//     public static void main(String []args){
//         // Status c=Status.success;//c=success
//         // System.out.println(c.ordinal());//3(index)
//         Status s[]=Status.values();
//         for(Status a:s){
//             System.out.println(a+" : "+a.ordinal());
//         }
//     }
// }

// enum Status {
//     Running, Failed, pending, success;
// }
// class programs {
//     public static void main(String[] args) {
//         Status s = Status.success;
//         switch (s) {
//             case Running:
//                 System.out.println("Running");
//                 break;
//             case Failed:
//                 System.out.println("Failed");
//                 break;
//             case pending:
//                 System.out.println("pending");
//                 break;
//             default:
//                 System.out.println("success");
//         }
//     }
// }

// enum Status {
//     Macbook(2000), XPS(2200), Surface, Thinkpad(1700);

//     private int price;
//     private Status(){
//         price=500;
//     }
//     private Status(int price) {// constructor
//         this.price = price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }
// }

// class programs {
//     public static void main(String[] args) {
//         // Status s=Status.Macbook;
//         // System.out.println(s);

//         Status s[] = Status.values();
//         for (Status a : s) {
//             System.out.println(a + " : " + a.getPrice());
//         }
//     }
// }

//Annotation
// class A{
//     public void show(){
//         System.out.println("in class A method");
//     }
// }
// class B extends A{
//     @Override //Annotation
//     public void show(){
//         System.out.println("in class B method");
//     }
// }
// class programs{
//     public static void main(String []args){
//         B obj=new B();
//         obj.show();
//     }
// }

// functional interface- it contanins only one method
// @FunctionalInterface // annotation
// interface A {
//     int show(int i, int j);
// }
// class programs {
//     public static void main(String[] args) {
//         A obj = new A() { // insted of this we can use lambda expression
//             public int show(int i, int j) {
//                 System.out.println("in anonomyous inner class show ");
//                 return i+j;
//             }
//         };    
//         System.out.println("Addition is "+ obj.show(5, 3));;
//     }
// }

// @FunctionalInterface // annotation
// interface A {
//     int show(int i, int j);
// }
// class programs {
//     public static void main(String[] args) {
//         // A obj = new A() { // insted of this we can use lambda expression
//         //     public int show(int i, int j) {
//         //         System.out.println("in anonomyous inner class show ");
//         //         return i+j;
//         //     }
//         // };
//         // lambda expression
//          A obj = (int i,int j) -> {
//             System.out.println("in anonomyous inner class show");
//             return i+j;
//         };    
//         System.out.println("Addition is "+ obj.show(5, 3));;
//     }
// }

//functional interface- it contanins only one method
// @FunctionalInterface // annotation
// interface A {
//     int show(int i, int j);
// }
// class programs {
//     public static void main(String[] args) {
//         //lambda expression
//         A obj = (i,j) -> i+j;
//         System.out.println("Addition is "+ obj.show(5, 3));;
//     }
// }

//Exception handling - it continues the excution of program by handling errors
// class programs{
//     public static void main(String []args){
//         int b=0;
//         int a=0;
//         try{
//             b=10/a;
//         }
//         catch(Exception e){
//             System.out.println("Divide by Zero Error "+ e);
//         }
//         System.out.println(b);
//         System.out.println("Bye");
//     }
// }

// class programs{
//     public static void main(String []args){
//         int b=0;
//         int a=10;
//         int array[]=new int[5];
//         try{
//             b=10/a;
//             array[5]=4;
//         }
//         catch(Exception e){
//             if(a==0)
//                 System.out.println("can't divide by zero ");
//             else
//                 System.out.println("can't assign value to out of bound index ");
//         }
//         System.out.println("Bye");
//     }
// }

// class programs {
//     public static void main(String[] args) {
//         int b = 0;
//         int a = 10;
//         int array[] = new int[5];
//         String name=null;
//         try {
//             b = 10 / a;
//             array[2] = 4;
//             name.length();
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("can't divide by zero ");
//         }
//         catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("can't assign value to out of bound index ");
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong...");
//         }
//         System.out.println("Bye");
//     }
// }

//throw the exception using throw keyword
// class programs {
//     public static void main(String[] args) {
//         int b = 0;
//         int a = 20;
//         try {
//             b = 10 / a;
//             if(b==0)
//                 throw new ArithmeticException("I don't want to print zero");
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("Thats the default output "+ e);
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong...");
//         }
//         System.out.println(b);
//         System.out.println("Bye");
//     }
// }

//user-defined exception
// class MyException extends Exception{
//     public MyException(String str){
//         super(str);
//     }
// }
// class programs {
//     public static void main(String[] args) {
//         try{
//             int n=-12;
//             if(n<0)
//                 throw new MyException("negative value");
//         }
//         catch(MyException e){
//             System.out.println("You Entered negative value");
//         }

//         System.out.println("Bye");
//     }
// }

//throws
// class A{
//     public void show() throws ClassNotFoundException{
//         Class.forName("Vineet");
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj=new A();
//         try{
//             obj.show();
//         }
//        catch(ClassNotFoundException e){
//             // e.printStackTrace();
//             System.out.println("Not able to find class");
//        }
//     }
// }

//finally:it will excute always
// class programs{
//     public static void main(String []args){
//         int b=0;
//         int a=0;
//         try{
//             b=18/a;
//         }
//         catch(Exception e){
//             System.out.println("You enterd zero");
//         }
//         finally{
//             System.out.println("it will excute always");
//         }
//     }
// }

//Threads- used to do multitasking
// class A extends Thread{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("vineet");
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("jadhav");
//         }
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj1=new A();
//         B obj2=new B();
//         obj1.start();
//         obj2.start();   
//     }
// }

//set thread priority
// class A extends Thread{
//     public void run(){
//         for(int i=1;i<=30;i++){
//             System.out.println("vineet");
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=1;i<=30;i++){
//             System.out.println("jadhav");
//         }
//     }
// }
// class programs{
//     public static void main(String []args){
//         A obj1=new A();
//         B obj2=new B();
//         obj1.setPriority(Thread.MAX_PRIORITY);
//         obj1.start();
//         obj2.start();   
//     }
// }

//sleep(waiting for time)
// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("vineet");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("jadhav");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class programs {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();
//     }
// }

//ArrayList-used for dynamic memory allocation(not having fixed size like array)
// import java.util.ArrayList;
// class programs{
//     public static void main(String []args){
//         Collection <Integer>a=new ArrayList<Integer>();
//         a.add(12);
//         a.add(13);
//         a.add(14);
//         a.add(15);
//         // System.out.println(a);
//         for(int n:a){
//             System.out.println(n);
//         }
//     }
// }

//List
// import java.util.*;
// class programs{
//     public static void main(String []args){
//         List <Integer>a=new ArrayList<Integer>();
//         a.add(12);
//         a.add(13);
//         a.add(14);
//         a.add(15);
//         a.add(15);
//         System.out.println(a.indexOf(14));
//         System.out.println(a.get(1));

//         // System.out.println(a[3]);
//         // System.out.println(a);
//         System.out.println();
//         for(int n:a){
//             System.out.println(n);
//         }
//     }
// }

//Set
// import java.util.*;
// class programs{
//     public static void main(String []args){
//         Set <Integer>a=new HashSet<Integer>();
//         a.add(34);
//         a.add(67);
//         a.add(12);
//         a.add(56);
//         a.add(12);
//         a.add(100);
//         // System.out.println(a);
//         System.out.println();
//         for(int n:a){
//             System.out.println(n);
//         }
//     }
// }

//Treeset- sorted set
// import java.util.*;
// class programs{
//     public static void main(String []args){
//         Set <Integer>a=new TreeSet<Integer>();
//         a.add(34);
//         a.add(67);
//         a.add(12);
//         a.add(56);
//         a.add(12);
//         a.add(100);
//         // System.out.println(a);
//         System.out.println();
//         for(int n:a){
//             System.out.println(n);
//         }
//     }
// }

//Map : key-value pairs
// import java.util.*;
// class programs{
//     public static void main(String []args){
//         Map<String,Integer> student=new HashMap<>();
//         student.put("vineet",11);
//         student.put("virat",18);
//         student.put("rohit",45);
//         student.put("AB",17);
//         student.put("Gayle",175);
//         System.out.println(student.keySet());
//         System.out.println(student.values());
//         for(String n: student.keySet()){
//             System.out.println(n+":"+student.get(n));
//         }
//     }
// }

// import java.util.Arrays;
// import java.util.List;
// class programs {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(4, 5, 7, 2,3,6);
//         int store=0;
//         for (int n : nums) {
//             if (n % 2 == 0) {
//                 store=(n*2)+store;
//             }
//         }
//         System.out.println(store);
//     }
// }

//forEach loop
// import java.util.Arrays;
// import java.util.List;
// class programs {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(4, 5, 7, 2,3,6);
//         nums.forEach(n->System.out.println(n));
//     }
// }

//Stream
//Map filter Reduce
// class programs{
//     public static void main(String []args){
//         List<Integer> nums=Arrays.asList(2,1,5,4,6);
//         Stream <Integer>s1=nums.stream();
//         Stream <Integer>s2=s1.filter(n->n%2==0);
//         Stream <Integer>s3=s2.map(n->n*2);
//         int result=s3.reduce(0,(c,e)->c+e);
//         System.out.println(result);        
//     }
// }

// class programs {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(2, 1, 5, 4, 6);
//         int result = nums.stream().filter(n -> n % 2 == 0)
//                                   .map(n -> n * 2)
//                                   .reduce(0, (c, e) -> c + e);
//         System.out.println(result);
//     }
// }

// import java.sql.*;

// public class programs {
   

//     public static void main(String[] args) throws Exception {
//         // Load MySQL JDBC driver
//         Class.forName("com.mysql.jdbc.Driver");
        
//         // Connect to MySQL database
//         String url = "jdbc:mysql://localhost:3306/mydatabase";
//         String username = "root";
//         String password = "mypassword";
//         Connection conn = DriverManager.getConnection(url, username, password);
        
//         // Create a statement object
//         Statement stmt = conn.createStatement();
        
//         // Execute SQL statement
//         ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
        
//         // Process results
//         while (rs.next()) {
//             int id = rs.getInt("id");
//             String name = rs.getString("name");
//             int age = rs.getInt("age");
//             System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
//         }
        
//         // Close resources
//         rs.close();
//         stmt.close();
//         conn.close();
//     }
// }


