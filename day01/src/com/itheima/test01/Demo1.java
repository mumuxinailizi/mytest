package com.itheima.test01;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("abc"=="ab"+"c");
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("����",23));
		list.add(new Student("����",24));
		list.add(new Student("����",25));
		list.add(new Student("����",26));
		System.out.println(list.get(0).getAge());
	}

}
