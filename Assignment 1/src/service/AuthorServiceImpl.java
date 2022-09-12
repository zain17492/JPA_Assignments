package service;

import Dao.AuthorDao;
import Dao.AuthorDaoImpl;
import entities.Author;

public class AuthorServiceImpl implements AuthorService
{
	private AuthorDao Dao;
	public AuthorServiceImpl() 
	{
		Dao = new AuthorDaoImpl();
	}

	@Override
	public Author getAuthorById(int Id) {
		// TODO Auto-generated method stub
		return Dao.getAuthorById(Id);
	}

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		Dao.beginTransaction();
		Dao.addAuthor(author);
		Dao.commitTransaction();
		System.out.println("Author Details Successfully Added In Database");
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		Dao.beginTransaction();
		Dao.updateAuthor(author);
		Dao.commitTransaction();
		System.out.println("Author Details Successfully Update In Database");
		
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		Dao.beginTransaction();
		Dao.removeAuthor(author);
		Dao.commitTransaction();
		System.out.println("Author Details Successfully Remove From Database");
		
	}

}
