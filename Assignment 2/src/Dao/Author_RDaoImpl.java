package Dao;

import javax.persistence.EntityManager;

import entities.Author_R;


public class Author_RDaoImpl implements Author_RDao 
{
	private EntityManager em;
    public Author_RDaoImpl()
    {
    	em=JPAUtil.getEntityManager();
    }
	@Override
	public Author_R getAuthor_RById(int id) {
		// TODO Auto-generated method stub
		 return  em.find(Author_R.class, id);
	}
	@Override
	public void addAuthor_R(Author_R author_r) {
		// TODO Auto-generated method stub
		em.persist(author_r);
	}
	@Override
	public void updateAuthor_R(Author_R author_r) {
		// TODO Auto-generated method stub
		em.merge(author_r);
	}
	@Override
	public void removeAuthor_R(Author_R author_r) {
		// TODO Auto-generated method stub
		em.remove(author_r);
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
