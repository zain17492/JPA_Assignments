package Service;

import Dao.Author_RDao;
import Dao.Author_RDaoImpl;
import entities.Author_R;

public class Author_RServiceImpl implements Author_RService
{
	private Author_RDao dao;
    public Author_RServiceImpl()
    {
    	dao=new Author_RDaoImpl();
    }

	@Override
	public Author_R getAuthor_RById(int id) {
		// TODO Auto-generated method stub
		return dao.getAuthor_RById(id);
	}

	@Override
	public void addAuthor_R(Author_R author_r) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addAuthor_R(author_r);
		dao.commitTransaction();
		System.out.println("Author added..");
		
	}

	@Override
	public void updateAuthor_R(Author_R author_r) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateAuthor_R(author_r);
		dao.commitTransaction();
		System.out.println("Author updated..");
		
		
	}

	@Override
	public void removeAuthor_R(Author_R author_r) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeAuthor_R(author_r);
		dao.commitTransaction();
		System.out.println("Author deleted..");
	}

}
