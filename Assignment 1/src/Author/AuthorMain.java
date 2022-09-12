package Author;

import java.util.Scanner;

import entities.Author;
import exception.AuthorNotFoundException;
import service.AuthorService;
import service.AuthorServiceImpl;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorService service = new AuthorServiceImpl();
		int ch =5;
		try (Scanner sc = new Scanner(System.in))
				{
			
			Author a1;
			do {
				
					System.out.println("------------------Author Menu-------------");
					System.out.println("1. Insert Author");
					System.out.println("2. Update Author");
					System.out.println("3. Delete Author");
					System.out.println("4. Display Author");
					System.out.println("5. Exit");
					System.out.println("Enter Choice(1..5) ");
					ch=sc.nextInt();
						switch(ch)
						{
					
						case 1:
							System.out.println("Enter Author Id, First_Name, Middle_Name,Last_Name,Phone_No ");
							int Author_Id=sc.nextInt();
							String First_Name=sc.next();
							String Middle_Name=sc.next();
							String Last_Name=sc.next();
							long Phone_No=sc.nextInt();
							
							a1=new Author();
							a1.setAuthor_Id(Author_Id);
							a1.setFirst_name(First_Name);
							a1.setMiddle_name(Middle_Name);
							a1.setLast_name(Last_Name);
							a1.setPhone_No(Phone_No);
							service.addAuthor(a1);
							break;
							
						case 2:
			               System.out.println("Enter Author Id and updated Phone_No ");
			               Author_Id=sc.nextInt();
			               Phone_No=sc.nextInt();
			               a1=service.getAuthorById(Author_Id);
			               if (a1==null)
			
				           throw new AuthorNotFoundException();								
			               else
			               {
				            a1.setPhone_No(Phone_No);
				            service.updateAuthor(a1);
			               }
			               break;
			               
					case 3:	
						System.out.println("Enter Author Id to be delete ");
						Author_Id=sc.nextInt();
						a1=service.getAuthorById(Author_Id);
						if (a1==null)
							
							throw new AuthorNotFoundException();
						else
						{
							service.removeAuthor(a1);
						}
						break;
						
					case 4:	
						System.out.println("Enter Author Id to be search...");
					Author_Id=sc.nextInt();
					a1=service.getAuthorById(Author_Id);
					if (a1==null)
						throw new AuthorNotFoundException();
						
					else
					{
						System.out.println("Author_Id "+a1.getAuthor_Id()+"\tFirst_Name "+a1.getFirst_name()+"\tMiddle_Name "+a1.getMiddle_name()+"\tLast_Name "+a1.getLast_name()+"\tPhone_No"+a1.getPhone_No());
					}
					
					break;
					
					case 5:System.exit(0);
				}
		}while(ch!=5);
	   }
         catch(Exception e) {
        	 System.out.println("Error..."+e.getMessage());
        	 
         }
	}

}
