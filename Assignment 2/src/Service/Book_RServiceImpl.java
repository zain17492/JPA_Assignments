package Service;

import Dao.Book_RDao;
import Dao.Book_RDaoImpl;
import entities.Book_R;

public class Book_RServiceImpl implements Book_RService
{
	private Book_RDao dao;
    public Book_RServiceImpl()
    {
    	dao = new Book_RDaoImpl();
    }
	@Override
	public Book_R getBook_RByIsbn(int isbn) {
		// TODO Auto-generated method stub
		return dao.getBook_RByIsbn(isbn);
	}
	@Override
	public void addBook_R(Book_R book_r) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addBook_R(book_r);
		dao.commitTransaction();
		System.out.println("Book added..");
		
	}
	@Override
	public void updateBook_R(Book_R book_r) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateBook_R(book_r);
		dao.commitTransaction();
		System.out.println("Book updated..");
		
	}
	@Override
	public void removeBook_R(Book_R book_r) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeBook_R(book_r);
		dao.commitTransaction();
		System.out.println("Book deleted..");
		
	}

}
