import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class Jpython{
	
	public static void main(String[] args) {
		
		File pyFile = new File("./Python/RanTest.py");
		
		long st = new Date().getTime();
		
		try {
			Process p = Runtime.getRuntime().exec("python ./Python/test.py aa");
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String str = in.readLine();
//			str = in.readLine();
		    String str; 
			String ret = "";
			while((str=in.readLine())!=null){
				ret += str+" \t";
			}
			
			System.out.println("value is : "+ret);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		try {
//			Process p = Runtime.getRuntime().exec("./EXE/wincpu.exe");
//			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
//			String str = in.readLine();
//			str = in.readLine();
//		
//			System.out.println("value is : "+str);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		
//		long et = new Date().getTime();
//	    System.out.println(et-st+" ms");
		
//		System.out.println(pyFile.getAbsolutePath());
		
	    
		 
		 
//	    
//		String ranTestPyStr = "";
//		
//		try {
//			BufferedReader br = new BufferedReader(new FileReader(pyFile));
//			
//			String line = br.readLine();
//			while(line!=null){
//				ranTestPyStr+=line+"\n";
//				line = br.readLine();
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		System.out.println(ranTestPyStr);
		
//		long st = new Date().getTime();
		
//	    PythonInterpreter py = new PythonInterpreter();
//	    System.out.println("Hello, brave new world");
//	    
//	    long et = new Date().getTime();
//	    System.out.println(et-st+" ms");
	    
//	    String pyStr = "import sys\nimport os\na = 42\nprint a\nx = 2+2\narr=[1,2,3]";
//	    
	   
	    
//	    py.exec(ranTestPyStr);
	    
	    
	    
	    
	    
	   
	    
//	    File cDirFile = new File("C:/");
//	    String[] files = cDirFile.list();
//	    for(String name : files)
//	    	System.out.print(name+" ");
//	    
	    
	    
	    
//	    py.exec(pyStr);
	   
	    
//	    PyObject x = py.get("x");
//	    PyList plist = (PyList) py.get("arr");
//	 
//	    System.out.println("x: "+x);
//	    System.out.println("arr: "+plist);
//	    System.out.println("Goodbye, cruel world");
	}
	
}

