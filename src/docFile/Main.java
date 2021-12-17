package docFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	static ArrayList<employee>  list  = new ArrayList<>();
	static ArrayList<employee>  listItem  = new ArrayList<>();
	 static File file = new File("nhanVien.dat");
		
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
				
		while(true)
		{
			System.out.println("======================");
            System.out.println("\t1. add employee");
            System.out.println("\t2.write to file");
            System.out.println("\t3.read to file");
            System.out.println("=======nhap vao option=======");
            int check = sc.nextInt();
            switch(check)
            {	case 1: 
            	employee nv1= new employee();
            	nv1.NhapDL();
            	list.add(nv1);
            	break;
            case 2:
            	writeFile();
            	break;
            case 3:
            	readFile();
            	break;
            	
          
            
            }
			
		}
		
		
	}
	
 	
	static void writeFile() throws IOException
 	 {
 		
		 if(!file.isFile()) {
				file.createNewFile();
			 }
 		 System.out.println(file.getPath());
 		 FileOutputStream out = null;
 		 ObjectOutputStream objectOut = null;
 				 try {
 					 out = new FileOutputStream("nhanVien.dat");
 					 objectOut = new ObjectOutputStream(out);
 					 objectOut.writeObject(list);
 					 
					
				} catch (Exception e) {
					// TODO: handle exception
				}
 				 finally {
					if(out!=null)
						out.close();
					if(objectOut!=null)
						objectOut.close();
				}
 				 
 				
 	 }

	@SuppressWarnings("unchecked")
	static void readFile() throws IOException
	{
		FileInputStream in =null;
 	 	 ObjectInputStream inputStream = null;
 	 	
 	 		try
 	 		{
 	 		in= new FileInputStream(file);
 	 		inputStream = new  ObjectInputStream(in);
 	 		try {
 	 		listItem = (ArrayList<employee>) inputStream.readObject();
// 	 		listItem.add(myEmployee);
 	 		}
 	 		catch(Exception e)
 	 		{
 	 			System.out.println("lỗi nhap mang");
 	 		}
 	 		
 	 		
 	 		}
 	 		catch(Exception e)
 	 		{
 	 			System.out.println("lỗi ko xuát đc file");
 	 		}
 	 		finally {
				if(in !=null)
					in.close();
				if(inputStream !=null)
					inputStream.close();
			}
 	 		for(employee i : listItem)
 	 	 	{
 	 	 		i.showInfor();;
 	 	 	}
 	 		System.out.println(listItem.size());
 	 	}
	

}
 		 
 		 
 		 
 	 
 	 	
 	 		
 	 	


