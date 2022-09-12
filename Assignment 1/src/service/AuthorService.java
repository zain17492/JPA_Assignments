package service;

import entities.Author;

public interface AuthorService {
	public abstract Author getAuthorById(int Id);
	public abstract void addAuthor(Author author);
	public abstract void updateAuthor(Author author);
	public abstract void removeAuthor(Author author);

}
