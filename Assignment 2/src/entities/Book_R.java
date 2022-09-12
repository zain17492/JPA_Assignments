package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book_ass2")
public class Book_R implements Serializable{

	@Id
	private int bookIsbn;
	private String bookTitle;
	private int bookPrice;
	
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(name="Book_Author", joinColumns= {@JoinColumn(name="Book_Isbn")},inverseJoinColumns= {@JoinColumn(name="AuthorI_d")})
	
    Set<Author_R>  author_rs = new HashSet <Author_R>();

	public int getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	

	public Set<Author_R> getAuthor_rs() {
		return author_rs;
	}

	public void setAuthor_rs(Set<Author_R> author_rs) {
		this.author_rs = author_rs;
	}


	private static final long serialVersionUID = 1L;

}
