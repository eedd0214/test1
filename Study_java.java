abstract class Study{
	void printmsg(){
		System.out.println("�ڹٰ� ���̴� �׸�å");
	}
}

class Study_java extends Study{
	public static void main(String[] args){
		Study_java study = new Study_java();
		study.printmsg();
	}
}