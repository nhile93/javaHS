package chapter5;

public class Main_Program {

	public static void main(String[] args) {
		/*SoftWare_Book swb = new SoftWare_Book();
		swb.title = "PHP Program";
		swb.author = "John";
		swb.nPages = 250;
		swb.displayDetail();
		
		HardWare_Book hwb = new HardWare_Book();
		hwb.title = "Netrowk Fundamental";
		hwb.author = "Hook";
		hwb.nPages = 150;
		hwb.displayDetail();*/
		
		Book b1 = new SoftWare_Book(); // kieu lop Book, vung nho thuoc SoftWare_Book. Uu tien lop con, khi nao ko co thi way lai lop cha
		b1.title = "PHP Program";
		b1.author = "John";
		b1.nPages = 250;
		b1.displayDetail();
		SoftWare_Book b1_download = new SoftWare_Book();
		b1_download.downloadCode();
		
		b1 = new HardWare_Book();
		b1.title = "Netrowk Fundamental";
		b1.author = "Hook";
		b1.nPages = 150;
		b1.displayDetail();
		
	}

}
