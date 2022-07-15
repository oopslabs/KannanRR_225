import java.io.*;

public class FileCpy {
public static void main(String [] args) throws IOException{
	int l;
	FileInputStream f1=new FileInputStream("C:\\Users\\TEMP\\Desktop\\a.txt");
	FileOutputStream f2=new FileOutputStream("C:\\Users\\TEMP\\Desktop\\b.txt");
		while((l=f1.read())!=-1)
		{
			f2.write(l);
		}
		f1.close();
		f2.close();
}
}
