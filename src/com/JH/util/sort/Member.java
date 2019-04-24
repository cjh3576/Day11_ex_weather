package com.JH.util.sort;

public class Member implements Comparable<Member> {
	private int age;
	private String id;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.age == ((Member)obj).getAge()) {}
		return super.equals(obj);
	}
	
	@Override
	public int compareTo(Member o) {
		
		int result = 0;
		if(this.age > o.getAge()) { 
			result = 1; 
		} else if(this.age < o.getAge())  {
			result = -1;
		} else if(this.age == o.getAge()) { 
			result = this.id.compareTo(o.getId());
			result = 0; 
		}


//		result = this.id.compareTo(o.getId());
		
		
//		if (result > 0) {
//			result = -1;
//		} else {
//			result = 1;
//		} 내림차순

		return result;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
