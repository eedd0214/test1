interface Super{
	void printmsg_super();
}

interface Sub{
	void printmsg_sub();
}

class Super_Sub implements Super,Sub{
	public void printmsg_super(){
		System.out.println("상위클래스입니다.");
	}
	public void printmsg_sub(){
		System.out.println("서브클래스입니다.");
	}
}

class Chapter6_2{
	public static void main(String[] args){
		Super_Sub SS = new Super_Sub();
		SS.printmsg_super();
		SS.printmsg_sub();
	}
}