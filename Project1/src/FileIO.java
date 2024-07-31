import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileIO {
	
	void writeData() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\gopi1.txt"))
		{
			int i;
			String name="mohamed";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("FileInserted...");
			
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\gopi1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void copyData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\gopi1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\gopi2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readtwoData() throws IOException
	{
		FileInputStream f1=new FileInputStream("D:\\gopi1.txt");
		FileInputStream f2=new FileInputStream("D:\\gopi2.txt");
		FileOutputStream fos1=new FileOutputStream("D:\\gopi3.txt");
		SequenceInputStream sis=new SequenceInputStream(f1,f2);
		int i;
		while((i=sis.read())!=-1)
		{
			//System.out.print((char)i);
			fos1.write((byte)i);
		}
	}
     void filewriterp1() throws IOException
     {
    	 try
    	 {
    		 FileWriter fw=new FileWriter("D:\\gopi4.txt");
    		 fw.write("Haiwelcome");
    		 System.out.println("data Insereted");
    		 fw.close();
    	 }
    	 catch(FileNotFoundException t)
    	 {
    		 
    	 }
     }
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		//f1.writeData();
		//f1.readData();
          //f1.copyData();
		//f1.readtwoData();
		f1.filewriterp1();
	}

}
