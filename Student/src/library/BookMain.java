package library;

public class BookMain {

	public static void main(String[] args) {
		
		Book b1 = new Book("종이여자", "기욤 뮈소", "밝은세상", 9500, 2010);
		System.out.println(b1.getTitle());		
		System.out.println(b1.getWriter());		
		System.out.println(b1.getPublisher());		
		System.out.println(b1.getPrice());
		System.out.println(b1.getWriteDate());	
		System.out.println();
		
		
		Book b2 = new Book();
		b2.setTitle("할머니가 미안하다고 전해달랬어요");
		
		b2.setWriter("프레드릭 베르만");
		b2.setPublisher("다산 책방");
		b2.setPrice(13000);
		b2.setWriteDate(2016);
		
		
		System.out.println(b2.getTitle());		
		System.out.println(b2.getWriter());		
		System.out.println(b2.getPublisher());		
		System.out.println(b2.getPrice());
		System.out.println(b2.getWriteDate());
		
	}
	
}
