package com.company;

class Person extends Company {
    private int age;
    private String name;

    public Person(String company, int age, String name) {
        super(company);
        this.age = age;
        this.name = name;
        WhoAmI();
        positionInComp();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void WhoAmI(){
        System.out.println(name + " " + age);
    }

    public void positionInComp(){
        System.out.println("My position in the company " + getCompany() + " - None\n");
    }
}
