class Person {

	/*
	- fields/properties/attributes adalah data yang bisa kita sisipkan di dalam object
	- namum sebelum memasukan data di fields kita harus mendeklarasikan data apa saja yang dimiliki object tersebut di dalam deklarasi classnya
	- membuat fields sama seperti membuat variable, namun di tempatkan di block class
	*/ 

	/*
	- fileds final tidak bisa di manipulasi
	- untuk mengakses field, butuh kata kunci .(titik) setelah nama object dan diikuti nama fields nya
	*/
	String name;
	String address;
	final String country = "Indonesia"; // final adalah field yg tidak bisa di ubah

}