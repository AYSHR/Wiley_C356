package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordReader {
   
	DataInputStream dis;
	public StudentRecordReader(String inputfile) throws IOException {
		dis=new DataInputStream(new FileInputStream(inputfile));
		
	}
	//data in byte
	public List<Student> readAll() throws IOException{
		List<Student> lstu=new ArrayList<>();
		try {
			while(true) {
				String name=dis.readUTF();
				boolean gender=dis.readBoolean();
				int age=dis.readInt();
				float grade=dis.readFloat();
				Student student=new Student(name,gender,age,grade);
				lstu.add(student);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		dis.close();
		return lstu;
	}
	public static void main(String[] args) throws IOException {
		String inputfile="D:\\\\Wiley_practice_git\\\\data\\\\student.dat" ;
		try {
			StudentRecordReader reader = new StudentRecordReader(inputfile);
			
			List<Student> list=reader.readAll();
			for(Student st: list) {
				System.out.print(st.getName()+"\t");
				System.out.print(st.getGender()+"\t");
				System.out.print(st.getAge()+"\t");
				System.out.println(st.getGrade()+"\t");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
