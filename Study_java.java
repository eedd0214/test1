abstract class Study{
	void printmsg(){
		System.out.println("자바가 보이는 그림책");
	}
}

class Study_java extends Study{
	public static void main(String[] args){
		Study_java study = new Study_java();
		study.printmsg();
	}
}