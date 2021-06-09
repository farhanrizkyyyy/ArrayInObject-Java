package ArrayInObject;

public class DataMahasiswa {
	public static void main(String[] args) {
		int max = 100;
		ManageMahasiswa obj = new ManageMahasiswa(max);
		
		obj.insert("123456", "Farhan Rizky", 21);
		obj.insert("654321", "Rizky Farhan", 12);
		
		obj.display();
	}
}
