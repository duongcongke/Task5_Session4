public class Task5_Session4 import java.awt.*;

public class Ex10_Rectangle {
    int width;
    int height;

    Ex10_Rectangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    Ex10_Rectangle(int wid, int heig){
        System.out.println("Parameterized Constructor");
        width = wid;
        height = heig;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}public class Ex11_RectangleInstances {
    public static void main(String[] args) {
        Ex10_Rectangle objRec1 = new Ex10_Rectangle(10,12);
        Ex10_Rectangle objRec2 = new Ex10_Rectangle(6,9);
        System.out.println("\nRetangle1 Details");
        System.out.println("====================");
        objRec1.displayDimensions();
        System.out.println("\nRetangle2 Details");
        System.out.println("====================");
        objRec2.displayDimensions();

    }
}public class Ex12_TestObjectReferences {
    public static void main(String[] args) {
        Ex10_Rectangle objRec1 = new Ex10_Rectangle(10,20);
        Ex10_Rectangle objRec2;
        objRec2 = objRec1;
        System.out.println("nRectanglel Details");
        System.out.println("====================");

        objRec1.displayDimensions();
        System.out.println("\nRetangle2Details");
        System.out.println("==================");
        objRec2.displayDimensions();

    }
}public class Ex13_NewRectangle {
    private int width;
    private int height;

    private Ex13_NewRectangle(){
        System.out.println("Constructor Invoked...");
        width=10;
        height=10;
    }
    private Ex13_NewRectangle(int wid, int heig){
        System.out.println("Parameterized Constructor Invoked...");
        width=wid;
        height=heig;
    }
    public void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}public class Ex14_Person {
    private String name = "John";
    private int age = 12;

    void displayDetails(){
        System.out.println("Person Details");
        System.out.println("===============");
        System.out.println("Person Name: "+name);
        System.out.println("Person Age: "+age);
    }
}public class Ex15_TestPerson {
    public static void main(String[] args) {
        Ex14_Person objPerson1 = new Ex14_Person();
        objPerson1.displayDetails();
    }
}public class Ex16_Account {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID=100;
        holderName="John Anderson";
        accountType="Savings";
    }
    public void displayAccountDetails(){
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println("Account ID: "+accountID +"\nAccount Type:"+accountType);
    }
}public class Ex17_TestInitializationBlock {
    public static void main(String[] args) {
        Ex16_Account objAccount = new Ex16_Account();
        objAccount.displayAccountDetails();
    }
}public class Ex19_Calculator {
    public void add(int num1, int num2){
        int num3;
        num3 = num1 + num2;
        System.out.println("Result after addition is"+num3);
    }
    public void mul(int num1, int num2){
        int num3;
        num3 = num1*num2;
        System.out.println("Result after multiplication is"+num3);
    }
    public void div(int num1, int num2){
        int num3;
        num3 = num1/num2;
        System.out.println("Result after division is "+num3);
    }

    public static void main(String[] args) {
        Ex19_Calculator objCalc = new Ex19_Calculator();
        objCalc.add(3,4);
        objCalc.mul(3,4);
    }
}
@@ -0,0 +1,11 @@
class Circle{
    public double getPI(){
        return 3.14;
    }
}
public class Ex21_PassByRef {
    public void calcArea (Circle objPi, double rad){
        double area = objPi.getPI() *rad *rad;
        System.out.println("Area of the circle is "+area);
    }

    public static void main(String[] args) {
        Ex21_PassByRef p1 = new Ex21_PassByRef();
        p1.calcArea(new Circle(),2);
    }
}
 6
         Session4/Ex22_Circle.javapublic class Ex22_Circle {
    private double PI = 3.14;
    public double getPI(){
        return PI;
    }
}public class Ex23_Varargs {
    public void addNumber(int...num){
        int sum=0;
        for (int i:num){
            sum = sum+i;
        }
        System.out.println("Sum of number is "+num);
    }

    public static void main(String[] args) {
        Ex23_Varargs obj = new Ex23_Varargs();
        obj.addNumber(10,30,20,40);
    }
}public class Ex24_Circle {
    private double PI = 3.14;
    public double calcArea (double rad){
        return (3.14 * rad *rad);
    }
}public class Ex26_Employee {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;

    public Ex26_Employee(int ID, String name){
        empID = ID;
        empName = name;
    }

    public String getSSN(){
        return SSN;
    }
    public void setSSN(String ssn){
        SSN = ssn;
    }
    public void setDesignation(String desig){
        empDesig = desig;
    }
    public void display(){
        System.out.println("Employee ID is "+empID);
        System.out.println("Employee name is "+empName);
        System.out.println("Designation is "+empDesig);
        System.out.println("SSN is "+SSN);
    }

    public static void main(String[] args) {
        Ex26_Employee objEmp1 = new Ex26_Employee(1200,"Roger Stevens");
        objEmp1.empDesig = "Manager";
        objEmp1.SSN = "281-72-3873";
        objEmp1.display();
    }
}public class Ex27_EmployeeDetails {
    public static void main(String[] args) {
        Ex26_Employee objEmp = new Ex26_Employee(1300,"Clara Smith");
        objEmp.empDesig="Receptionist";
        objEmp.setSSN("282-72-3873");
        objEmp.display();
    }
}public class Ex28_MathClass {
    public void add(int num1, int num2){
        System.out.println("Result after addition is "+ (num1+num2));
    }
    public void add(int num1, int num2, int num3){
        System.out.println("Result after addition is "+ (num1+num2));
    }
    public void add(float num1, int num2){
        System.out.println("Result after addition is "+(num1+num2));
    }

    public void add(int num1, float num2){
        System.out.println("Result after addition is "+ (num1+num2));
    }
    public void add(float num1, float num2){
        System.out.println("Result after addition is "+(num1+num2));
    }

    public static void main(String[] args) {
        Ex28_MathClass objMath = new Ex28_MathClass();
        objMath.add(3.4F,2);
        objMath.add(4,5);
        objMath.add(6,7,8);
    }
}public class Ex29_Student {
    int rollNo;
    String name;
    String address;
    float marks;
    public Ex29_Student(){
        rollNo = 0;
        name = "";
        marks = 0;
    }
    public Ex29_Student(int rNo, String sname){
        rollNo =rNo;
        name = sname;
    }
    public Ex29_Student(int rNo, float score){
        rollNo=rNo;
        marks=score;
    }
    public Ex29_Student(String sName, String addr){
        name = sName;
        address = addr;
    }
    public Ex29_Student(int rNo, String sname, float score){
        rollNo = rNo;
        name = sname;
        marks = score;
    }
    public void displayDetails(){
        System.out.println("Rollno :"+rollNo);
        System.out.println("Student name: "+name);
        System.out.println("Address "+address);
        System.out.println("Score "+marks);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Ex29_Student objStud1 = new Ex29_Student("David","302, Washington Street");
        objStud1.displayDetails();
        Ex29_Student objStud2 = new Ex29_Student(103,46);
        objStud2.displayDetails();
        Ex29_Student objStud3 = new Ex29_Student(104, "Roger",50);
        objStud3.displayDetails();
    }
}public class Ex30_Circle {
    float area;
    public float getPI(){
        return 3.14f;
    }
    public void calcArea(int rad){
        this.area = getPI()*rad*rad;
    }
}public class Ex31_Cricle {
    float area;
    public float getPI(){
        return 3.14f;
    }
    public void calcArea(int rad){
        this.area = this.getPI()*rad*rad;
    }
}public class Ex32_Circle {
    private float rad;
    private float PI;
    public Ex32_Circle(){
        PI = 3.14f;
    }
    public Ex32_Circle(float r){
        this();
        rad = r;
    }
}public class Ex33_Circle {
    private float rad;
    private float PI;
    public Ex33_Circle(){
        PI = 3.14f;
    }
    public  Ex33_Circle(float rad){
        this();
        this.rad = rad;
    }
}
 19
         Session4/Ex3_Customer.javapublic class Ex3_Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        Ex3_Customer objCustomer1 = new Ex3_Customer();
        objCustomer1.customerID =100;
        objCustomer1.customerName ="John";
        objCustomer1.customerAddress ="123Street";
        objCustomer1.customerAge =30;

        System.out.println("Customer Identification Number: "+objCustomer1.customerID);
        System.out.println("CustomerName: "+objCustomer1.customerName);
        System.out.println("CustomerAddress: "+objCustomer1.customerAddress);
        System.out.println("CustomerAge: "+objCustomer1.customerAge);
    }
}public class Ex4_Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress(String address){
        customerAddress = address;
    }
    void displayCustomerInformation(){
        System.out.println("Customer Identification Number: "+customerID);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Customer Address : "+customerAddress);
        System.out.println("Customer Age : "+customerAge);
    }
}public class Ex5_TestCustomer {
    public static void main(String[] args) {
        Ex4_Customer objCustomer = new Ex4_Customer();
        objCustomer.customerID = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;
        objCustomer.displayCustomerInformation();
        objCustomer.changeCustomerAddress("123 Fort, MainStreet");
        objCustomer.displayCustomerInformation();
    }
}public class Ex6_Rectangle {
    int width;
    int height;
    Ex6_Rectangle(){
        width = 10;
        height = 10;
    }
}import java.awt.*;

public class Ex7_TestConstructor {
    public static void main(String[] args) {
        Ex6_Rectangle objRec = new Ex6_Rectangle();
        System.out.println("Width: "+ objRec.width);
        System.out.println("Height: "+ objRec.height);
    }
}public class Ex8_Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;
    void displayEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("===============");
        System.out.println("EmployeeName: "+employeeName);
        System.out.println("EmployeeAge: "+employeeAge);
        System.out.println("EmployeeSalary: "+employeeSalary);
        System.out.println("EmployeeMaritalStatus: "+maritalStatus);
    }
}public class Ex9_TestEmployee {
    public static void main(String[] args) {
        Ex8_Employee objEmp = new Ex8_Employee();
        objEmp.displayEmployeeDetails();
    }
}public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}{
}
