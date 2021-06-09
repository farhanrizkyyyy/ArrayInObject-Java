package ArrayInObject;

public class Mahasiswa {
	private String nim;
	private String nama;
	private int umur;
	
	public Mahasiswa() {
		nim = "";
		nama = "";
		umur = 0;
	}
	
	public Mahasiswa(String nim, String nama, int umur) {
		this.nim = nim;
		this.nama = nama;
		this.umur = umur;
	}
	
	public void display() {
		System.out.println("NIM	: " + nim);
		System.out.println("Nama	: " + nama);
		System.out.println("Umur	: " + umur);
	}
	
	public String getNim() {
		return nim;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
}
