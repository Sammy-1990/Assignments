class UninitializedVariables{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	
	public static void main(String args[]){
	
		UninitializedVariables obj = new UninitializedVariables();
	
		System.out.println("The value of byte is: " + obj.a);
		System.out.println("The value of short is: " + obj.b);
		System.out.println("The value of int is: " + obj.c);
		System.out.println("The value of long is: " + obj.d);
		System.out.println("The value of float is: " + obj.e);
		System.out.println("The value of double is: " + obj.f);
		System.out.println("The value of char is: " + obj.g);
		System.out.println("The value of boolean is: " + obj.h);
	}
}