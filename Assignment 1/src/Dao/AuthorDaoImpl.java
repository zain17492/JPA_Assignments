package Dao;

import javax.persistence.EntityManager;

import entities.Author;

public class AuthorDaoImpl implements AuthorDao 
{
	private EntityManager em;
	public AuthorDaoImpl()
	{
		em=JPAUtil.getEntityManager();
	}
	

	@Override
	public Author getAuthorById(int Id) {
		// TODO Auto-generated method stub
		return em.find(Author.class, Id);
	}

	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		em.persist(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		// TODO Auto-generated method stub
		em.merge(author);
		
	}

	@Override
	public void removeAuthor(Author author) {
		// TODO Auto-generated method stub
		em.remove(author);
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
		
	}

}
