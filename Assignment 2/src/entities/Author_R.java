package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="author_ass2")
public class Author_R implements Serializable{
	@Id
	private int authorId;
	private String authorName;
	
	@ManyToMany(mappedBy="author_rs")
	Set<Book_R>  book_rs = new HashSet <Book_R>();
	
	
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	

	public Set<Book_R> getBook_rs() {
		return book_rs;
	}

	public void setBook_rs(Set<Book_R> book_rs) {
		this.book_rs = book_rs;
	}



	private static final long serialVersionUID = 1L;

}
