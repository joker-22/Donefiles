import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF282C {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      String a = in.nextLine();
      String b = in.nextLine();
      if(a.length()!=b.length()){
    	  out.println("NO");
      }
      else{
    	 int n = a.length();
    	 char [] ar = new char[n];
    	 for(int i=0;i<n;++i){
    		 ar[i] = '0';
    	 }
    	 String sr = String.valueOf(ar);
    	 if((a.equals(sr) && !b.equals(sr)) || 
    			 (!a.equals(sr) && b.equals(sr))){
    		 out.println("NO");
    	 }
    	 else{
    		 out.println("YES");
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
    	  return next().charAt(0);
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