class Study{
	String name;
	String teacher;
	
	void setName(String name, String teacher){
		this.name = name;
		this.teacher = teacher;
	}
	
	public void printmsgs(){
		System.out.println("���� Ŭ���������� ����Դϴ�.");
		System.out.println("������ " + name + "�̰�, ����ڴ� " + teacher+"�Դϴ�");
		
	}
}

class Study_Sub extends Study{
	public void printmsgs(){
		System.out.println("���� Ŭ���������� ����Դϴ�.");
		System.out.println("������ " + name + "�̰�, ����ڴ� " + teacher+"�Դϴ�");
	}
}

class Chapter6_3{
	public static void main(String[] args){
		Study SS = new Study_Sub();
		SS.setName("�ڹ�","���ȴ�");
		SS.printmsgs();
		
		Study S = new Study();
		S.setName("C","���ȴ�");
		S.printmsgs();
	}
}