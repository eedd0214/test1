class Study{
	String name;
	String teacher;
	
	void setName(String name, String teacher){
		this.name = name;
		this.teacher = teacher;
	}
	
	public void printmsgs(){
		System.out.println("상위 클래스에서의 출력입니다.");
		System.out.println("과목은 " + name + "이고, 담당자는 " + teacher+"입니다");
		
	}
}

class Study_Sub extends Study{
	public void printmsgs(){
		System.out.println("서브 클래스에서의 출력입니다.");
		System.out.println("과목은 " + name + "이고, 담당자는 " + teacher+"입니다");
	}
}

class Chapter6_3{
	public static void main(String[] args){
		Study SS = new Study_Sub();
		SS.setName("자바","성안당");
		SS.printmsgs();
		
		Study S = new Study();
		S.setName("C","성안당");
		S.printmsgs();
	}
}