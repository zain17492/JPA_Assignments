package Service;

import entities.Author_R;


public interface Author_RService {
	public abstract Author_R getAuthor_RById(int id);
    public abstract void addAuthor_R(Author_R product);
    public abstract void updateAuthor_R(Author_R product);
    public abstract void removeAuthor_R(Author_R product);

}
