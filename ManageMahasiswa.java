package ArrayInObject;

public class ManageMahasiswa {
	private Mahasiswa[] dataMhs;
	private int n;
	
	public ManageMahasiswa(int max) {
		dataMhs = new Mahasiswa[max];
		n = 0;
	}
	
	public void insert(String nim, String nama, int umur) {
		dataMhs[n] = new Mahasiswa(nim, nama, umur);
		n++;
	}
	
	public void display() {
		for(int i = 0; i < n; i++) {
			dataMhs[i].display();
			
			System.out.println();
		}
	}
}
