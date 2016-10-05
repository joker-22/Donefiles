import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF722A {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      String s = in.nextLine();
      String [] ar = s.split(":");
      int hr = Integer.parseInt(ar[0]);
      int mm = Integer.parseInt(ar[1]);
      if(n==24){
    	  if((hr >=0 && hr <24) && (mm >=0 && mm <60)){
    		  out.println(s);
    	  }
    	  else if(hr >=24 && mm<=59){
    		  while(hr>=24){
    			  hr %= 10;
    		  }
    		  String s1 = "0"+hr;
    		  out.println(s1+":"+ar[1]);
    		//  out.print("holla"); 
    	  }
    	  else if(mm >=60 && hr <24){
    		  while(mm>=60){
    			  mm %= 10;
    		  }
    		  String s1 = "0"+mm;
    		  out.println(ar[0]+":"+s1);
    		 // out.print("holla2");
    		  
    	  }
    	  else{
    		  while(hr>=24){
    			  hr %= 10;
    		  }
    		  String s1 = "0"+hr;
    		  while(mm>=60){
    			  mm %= 10;
    		  }
    		  String s2 = "0"+mm;
    		  out.println(s1+":"+s2);
    	  }
      }
      else{
    	  if((hr >0 && hr <=12) && (mm >=0 && mm <60)){ 
    		  out.println(s);  
    	  }
    	  else if(hr >12 && mm<=60){
    		  while(hr>12){
    			  hr %= 10;
    		  }
    		  int c = Integer.parseInt("1"+hr);
    		//  out.println(c);
    		  String s1 = "";
    		  if(c>12)
    		   s1 = "0"+hr;
    		  else
    		   s1 = "1"+hr;
    		  if(mm!=0 && mm!=60)
    		  out.println(s1+":"+ar[1]);
    		  else if(mm==60){
    			  out.println(s1+":"+"00");
    		  }
    		  else
    			  out.println(s1+":"+mm+"0");
    		//  out.print("holla"); 
    	  }
    	  else if(hr==0){
    		  hr += 1;
    		  String s1 = "0"+hr;
    		  if(mm<10 && mm>0)
    		  out.println(s1+":"+"0"+mm);
    		  else if(mm!=0 && mm!=60)
    			  out.println(s1+":"+ar[1]);
    		  else if(mm==60){
    			  out.println(s1+":"+"00");
    		  }
    		  else
    			  out.println(s1+":"+mm+"0"); 
    		//  out.print("holla"); 
    	  }
    	  else if(mm >=60 && hr <=12 && hr>0){
    		  while(mm>=60){
    			  mm %= 10;
    		  }
    		  String s1 = "0"+mm;
    		  out.println(ar[0]+":"+s1);
    		 // out.print("holla2");
    		  
    	  }
    	  else{
    		  while(hr>12){
    			  hr %= 10;
    		  }
    		  String s1 = "0"+hr;
    		  while(mm>=60){
    			  mm %= 10;
    		  }
    		  String s2 = "0"+mm;
    		  out.println(s1+":"+s2);
    	  }
      }
      //End your solution here.       
      out.close();
    
   }

 

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;

   //-----------MyScanner class for faster input----------
   public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;

      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }

      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }

      int nextInt() {
          return Integer.parseInt(next());
      }

      long nextLong() {
          return Long.parseLong(next());
      }

      double nextDouble() {
          return Double.parseDouble(next());
      }
      char nextChar()  {
    	  try {
			return br.readLine().charAt(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0 ;
      }
      int [] nextIntAr(int [] ar){
    	  for(int i=0;i<ar.length;++i){
    		  ar[i] = Integer.parseInt(next());
    	  }
    	  return ar;
      }
      long [] nextLongAr(long [] ar){
    	  for(int i=0;i<ar.length;++i){
    		  ar[i] = Long.parseLong(next());
    	  }
    	  return ar;
      }
      double [] nextDoubleAr(double [] ar){
    	  for(int i=0;i<ar.length;++i){
    		  ar[i] = Double.parseDouble(next());
    	  }
    	  return ar;
      }
      String [] nextStringAr(String [] ar){
    	  for(int i=0;i<ar.length;++i){
    		  ar[i] = next();
    	  }
    	  return ar;
      }

      String nextLine(){
          String str = "";
      try {
         str = br.readLine();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return str;
      }

   }
}