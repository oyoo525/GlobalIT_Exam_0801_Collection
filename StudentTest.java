package com.javastudy.ch08.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(202001003, "홍길동", 1, "남성");
		Student st2 = new Student(201709103, "어머나", 3, "여성");
		Student st3 = new Student(201903001, "왕빛나", 2, "여성");
		Student st4 = new Student(201905023, "김유신", 2, "남성");
		Student st5 = new Student(202007275, "전해영", 1, "여성");
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		System.out.println("===== ArrayList =====");
		for(Student str : students) {
			System.out.println(str);
		}
		
		
		System.out.println("===== HashMap =====");
		HashMap<Integer, Student> hashStudents = new HashMap<>();
		for(Student str : students) {
			hashStudents.put(str.getStno(), str);
		}		
		
		Set<Integer> keySet =  hashStudents.keySet();
		for(int key : keySet) {
			System.out.println(hashStudents.get(key));
		}
		
		
		
	}


}
