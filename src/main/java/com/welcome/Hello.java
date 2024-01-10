package com.welcome;

public class Hello {
    private String name;
    public void setupName(String name){
        if (!name.trim().isEmpty()) {
            this.name = name;
        }
    }
    public void welcome(){
        if (name != null) {
            System.out.printf("Hello, %s%n", name);
        } else {
            System.out.println("Hi, noname");
        }
    }

    public void byeBay(){
        if (name != null) {
            System.out.printf("Bye, %s%n", name);
        } else {
            System.out.println("Bye, noname");
        }
    }
}
