package org.example;

public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorld {" +
                "name='" + name + '\'' +
                '}';
    }
}
