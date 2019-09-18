class Box<T> { 
     // T stands for "Type" 
     private T t; 
     public void add(T t) {  this.t = t;     } 
     public T get() {     return t;      }  
}  
public class TestSubType{
	public static void main(String[] args) {
		Number n=null;//Number是抽象类，是Integer,Float,Double类的父类
		Integer i=new Integer(1);
        n=i;
		System.out.println(n);

		Double d=new Double(1.0);
        n=d;
		System.out.println(n);

		Box<Number> mybox=new Box<Number>();
		mybox.add(i); 
		System.out.println(mybox.get( ) );
		mybox.add(d); 
		System.out.println(mybox.get( ) );
		
	} 
}
