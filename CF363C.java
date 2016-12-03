import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF363C {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      String s = in.nextLine();
      char [] ar = s.toCharArray();
      StringBuilder sr = new StringBuilder();
      if(s.length()>1){
      sr.append("");
      sr.append(ar[0]);
      sr.append(ar[1]);
      for(int i=2;i<ar.length;++i){
    	//  out.println(sr.charAt(sr.length()-1));
    	 if(ar[i]==sr.charAt(sr.length()-1) && ar[i]==sr.charAt(sr.length()-2)){
    		 continue;
    	 }
    	 else if((ar[i]==sr.charAt(sr.length()-1))){
    		 if(i>=3 && 
    				 (sr.charAt(sr.length()-3)==sr.charAt(sr.length()-2)))
    		 //out.println(sr.toString());
    		 continue;
    		 else{
    			 sr.append(ar[i]);
    			 continue;
    		 }
    		 
    	 }
    	 else{
    	//	 out.println(sr.toString());
    		 sr.append(ar[i]);
    	 }
      }
      out.println(sr.toString());
      }
      else{
    	  out.println(s);
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