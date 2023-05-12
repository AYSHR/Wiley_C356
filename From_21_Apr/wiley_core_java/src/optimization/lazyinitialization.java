package optimization;

public class lazyinitialization {

	//it's a lazy initialization
	private Object myobject;
	private Object getmyobj() {
		if(myobject==null) {
			myobject=new lazyinitialization();
		}
			return myobject;
	}
	public static void main(String[] args) {
		//lazyinitialization lz=new lazyinitialization();
		
	}

}
