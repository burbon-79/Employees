package com.company;

class Employee extends Person {

    public Employee(String company, int age, String name) {
        super(company, age, name);
    }

    public void WhoAmI(){
        System.out.println(getName() + " " + getAge());
    }

    public void positionInComp(){
        System.out.println("My position in the company " + getCompany() +" - Manager\n");
    }
}
