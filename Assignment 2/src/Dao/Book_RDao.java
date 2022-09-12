package Dao;

import entities.Book_R;

public interface Book_RDao {
	
	public abstract Book_R getBook_RByIsbn(int isbn);
    public abstract void addBook_R(Book_R book_r);
    public abstract void updateBook_R(Book_R book_r);
    public abstract void removeBook_R(Book_R book_r);
    public abstract void beginTransaction();
    public abstract void commitTransaction();  

}
