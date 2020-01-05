import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class IO {
	

	
	private   Scanner x;
	private Formatter y;
	
	
	public void fileexistingcheck(String adress) {
		
		File f = new File(adress+".txt");
		
		if (f.exists()) {
			System.out.println(f.getName()+" is Here");
			
		}
		else {
			System.out.println(f.getName()+" is not here\n now i'm creating it");
			JOptionPane.showMessageDialog(null, f.getName()+" is not here\n now i'm creating it");
			openfile(adress);
			yclose();
		}
		
	}
	
	public   void openfile(String adress) {
		
		try {
			y = new Formatter(adress+".txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 public  void copyfile(String copyfrom,String copyto) {
		   
			try {
				x = new Scanner(new File(copyfrom+".txt"));
				y = new Formatter(copyto+".txt");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			   while(x.hasNextLine())
			   {
				   String a = x.nextLine();
				   y.format("%s\n", a);
			   }
			
			
		}
	
	public  void write(String MvM , String Winner,String Score) {
		System.out.println("yeap");
		
		y.format("%s   %s    %s\n",MvM,Winner,Score);
		
		
	}
	
	public void close() {
		x.close();
		y.close();

	}
	
	public void yclose() {
		y.close();
		

	}

}
