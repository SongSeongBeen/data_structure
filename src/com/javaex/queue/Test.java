package com.javaex.queue;

import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
			
			ArrayQueue<Student> q = new ArrayQueue<>();
	 
			q.offer(new Student("어렵네", 92));
			q.offer(new Student("큐라는", 72));
			q.offer(new Student("아오씨", 98));
			q.offer(new Student("머리", 51));
			
			q.sort(customComp);	// Comparator을 넘겨준다. 
			
			for(Object a : q.toArray()) {
				System.out.println(a);
			}
		}
		
		// 사용자 설정 comparator(비교기)
		static Comparator<Student> customComp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.score - o1.score;
			}
		};
		
	}
	 
	class Student {
		String name;
		int score;
		
		Student(String name, int score){
			this.name = name;
			this.score = score;
		}
		
		public String toString() {
			return "이름 : " + name + "\t성적 : " + score;
		}

}
