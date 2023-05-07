package lambada;

interface refer{
	void reference();
}
interface getInfo{
	Info getmsg(String str);
}
class Info {
	Info(String msg){
		System.out.println(msg);
	}

	
}
public class methodref {
	public static void referdef() {
		System.out.println("eg of method ref");
	}
	public static void process() {
		System.out.println("processing");
	}
	public void hello() {
		System.out.println("instance method ref");
	}

	public static void main(String[] args) {
		// constructor ref
		getInfo info=Info::new;
		info.getmsg("my message");
		methodref mt=new methodref();
		refer isv=mt::hello;
		isv.reference();
		refer r =methodref::referdef;
		r.reference();
		Thread t1=new Thread(methodref::process);
		t1.start();
		//Thread t2=new Thread(new methodref()::hello);
		Thread t2=new Thread(mt::hello);
		t2.start();
	

	}

}
