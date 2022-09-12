package Dao;

import entities.Author_R;

public interface Author_RDao {
	public abstract Author_R getAuthor_RById(int id);
    public abstract void addAuthor_R(Author_R author_r);
    public abstract void updateAuthor_R(Author_R author_r);
    public abstract void removeAuthor_R(Author_R author_r);
    public abstract void beginTransaction();
    public abstract void commitTransaction();    

}
 



