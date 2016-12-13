import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class CF570C {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      int m = in.nextInt();
      String s = in.nextLine();
      char [] ar = new char[n];
      ar = s.toCharArray();
      int count = 0;
      for(int i=0;i<n-1;++i){
    	  if(s.charAt(i)=='.' && s.charAt(i+1)=='.'){
    		  count++;
    	  }
      }
      //out.println(count);
      while(m-- >0){
    	  int pos = in.nextInt() - 1;
    	  char c = in.next().charAt(0);
    	  if(ar[pos]=='.' && c!='.'){
    		  if(pos > 0 && ar[pos-1]=='.'){
    			  count--;
    		  }
    		  if(pos < (n-1) && ar[pos+1]=='.'){
    			  count--;
    		  }
    	  }
    	  else if(ar[pos]!='.' && c=='.'){
    		  if(pos > 0 && ar[pos-1]=='.'){
    			  count++;
    		  }
    		  if(pos < (n-1) && ar[pos+1]=='.'){
    			  count++;
    		  }
    	  }
    	  out.println(count);
    	  ar[pos] = c;
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