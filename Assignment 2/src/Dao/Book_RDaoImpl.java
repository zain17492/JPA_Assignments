package Dao;

import javax.persistence.EntityManager;

import entities.Book_R;


public  class Book_RDaoImpl implements Book_RDao
{

	 private EntityManager em;
	    public Book_RDaoImpl()
	    {
	    	em=JPAUtil.getEntityManager();
	    }
		public Book_R getBook_RByIsbn(int isbn) {
			// TODO Auto-generated method stub
			return em.find(Book_R.class, isbn);
		}
		@Override
		public void addBook_R(Book_R book_r) {
			// TODO Auto-generated method stub
			em.persist(book_r);
		}
		@Override
		public void updateBook_R(Book_R book_r) {
			// TODO Auto-generated method stub
			em.merge(book_r);
		}
		@Override
		public void removeBook_R(Book_R book_r) {
			// TODO Auto-generated method stub
			em.remove(book_r);
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
