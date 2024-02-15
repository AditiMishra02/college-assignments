class Box<T> {
	private T t;

	Box(T a) {
		t = a;
	}

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> stringBox1 = new Box<String>("Welcome");
		Box<String> stringBox2 = stringBox1;
		System.out.println(stringBox2.get());
		stringBox1.add("hello world");
		System.out.println(stringBox2.get());

		Box<Integer> IntBox1 = new Box<Integer>(10);
		Box<Integer> IntBox2 = IntBox1;
		System.out.println(IntBox2.get());
		IntBox1.add(20);
		System.out.println(IntBox2.get());

		Box<Object> obj1 = new Box<Object>("Hi");
		Box<Object> obj2 = obj1;
		System.out.println(obj2.get());
		obj1.add("Hello");
		System.out.println(obj2.get());
		obj1.add(20);
		System.out.println(obj2.get());

		Box obj11 = new Box("Hi");
		Box obj22 = obj11;
		System.out.println(obj22.get());
		obj11.add("Hello");
		System.out.println(obj22.get());
		obj11.add(20);
		System.out.println(obj22.get());
	}

}
