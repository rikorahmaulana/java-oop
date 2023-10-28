class Person {

	String name;
	String address;
	final String country = "Indonesia"; // final adalah field yg tidak bisa di ubah

	Person(String paramName, String paramAddress) {
		name = paramName;
		address = paramAddress;
	}

	void sayHello (String paramName) {
		System.out.println("Hello" + paramName + ", My Name is " + name);
	}

}