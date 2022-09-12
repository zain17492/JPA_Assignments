package Client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author_R;
import entities.Book_R;



public class Client {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		
		Author_R a1=new Author_R();
		a1.setAuthorId(13);
		a1.setAuthorName("Chetan Bhagat");
		
		Author_R a2=new Author_R();
		a2.setAuthorId(14);
		a2.setAuthorName("Rabindranath Tagore");
		
		Set<Author_R> as= new HashSet<Author_R>();
		as.add(a1);
		Book_R b1=new Book_R();
		b1.setBookIsbn(10);
		b1.setBookTitle("Indian Positive");
		b1.setBookPrice(800);
		b1.setAuthor_rs(as);


	
		Set<Author_R> ab= new HashSet<Author_R>();
		ab.add(a1);
	
		Book_R b2=new Book_R();
		b2.setBookIsbn(20);
		b2.setBookTitle("Collage Gate");
		b2.setBookPrice(2200);
		b2.setAuthor_rs(ab);
		
		
		Set<Author_R> ac= new HashSet<Author_R>();
		ac.add(a2);
		
		Book_R b3=new Book_R();
		b3.setBookIsbn(30);
		b3.setBookTitle("Friend");
		b3.setBookPrice(1600);
		b3.setAuthor_rs(ac);
		
		
		Set<Author_R> ad= new HashSet<Author_R>();
		ad.add(a2);
		Book_R b4=new Book_R();
		b4.setBookIsbn(40);
		b4.setBookTitle("On the Nature of Love");
		b4.setBookPrice(900);
		b4.setAuthor_rs(ad);
		
		Set<Book_R> s1=new HashSet<Book_R>();
		s1.add(b1);
		s1.add(b2);
		
		Set<Book_R> s2=new HashSet<Book_R>();
		s2.add(b3);
		s2.add(b4);
	
		a1.setBook_rs(s1);
		a2.setBook_rs(s2);
		
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(b4);
		em.persist(a1);
		em.persist(a2);
		
		em.getTransaction().commit();
		System.out.println("Books and Author record added in Database");
		
	}
	
	
}