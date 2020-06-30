package am.tech42.app;

public class Student extends User {
	private String name;
    private String surName;
    private int age;
    private int id;

	public void setName(String name) {
        this.name = name;
    } 

    public void setSurName(String name) {
        this.surName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

	 public void setId(int id) {
        this.id = id;
    }
}
