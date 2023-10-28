public class PersonApp {
	public static void main(String[] args){
		// object adalah hasil dari instanisasi dari sebuah class
		// untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ()

		var person1 = new Person();

		// manipulasi fields
		person1.name = "riko";
		person1.address = "cikarang";
		// person1.country = "jakarta"; ini akan eror karena menggunakan final di fields nya

		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);

		Person person2 = new Person();
		Person person3;
		person3 = new Person();

	}
}