import java.io.*;
 
 class test1{
	 
	 public static void main(String a[]){
		 try{
 
//			 String prg = "import sys\nprint int(sys.argv[1])+int(sys.argv[2])\n";
//			 BufferedWriter out = new BufferedWriter(new FileWriter("D:/test1.py"));
//			 out.write(prg);
//			 out.close();
			 int number1 = 10;
			 int number2 = 32;
			 
			 
			 File f = new File("./").getAbsoluteFile();
			 String path = f.getAbsolutePath();
				
			 String classDir = path.substring(0, path.length()-1);

			 System.out.println(classDir);
			 String bin = classDir + "bin";
			 System.out.println(bin);
//			 Runtime.getRuntime().exec("cmd /C \"start rmiregistry\"", null, new File(bin));
			 
			 Process p = Runtime.getRuntime().exec("cmd /D python test1.py "+number1+" "+number2);
			 BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			 int ret = new Integer(in.readLine()).intValue();
			 System.out.println("value is : "+ret);
		 }catch(Exception e){}
	 }
 }
