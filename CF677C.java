import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF677C {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      String s = in.nextLine();
      int [] ar = new int[s.length()];
      for(int i=0;i<ar.length;++i){
    	  if(s.charAt(i)>='0' && s.charAt(i)<='9'){
    		  String sr = ""+s.charAt(i);
    		  ar[i] = Integer.parseInt(sr);
    	  }
    	  else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
    		  int a = 10 + (s.charAt(i)- 'A');
    		  ar[i] = a;
    	  }
    	  else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
    		  int a = 36 + (s.charAt(i)-'a');
    		  ar[i] = a;
    	  }
    	  else if(s.charAt(i)=='-'){
    		  ar[i] = 62;
    	  }
    	  else{
    		  ar[i] = 63;
    	  }	  
      }
      String [] br = new String[ar.length];
      for(int i=0;i<br.length;++i){
    	  StringBuilder sb = new StringBuilder("");
    	  while(ar[i]!=0){
    		  if(ar[i]%2==0){
    			  sb.append('0');
    		  }
    		  else{
    			  sb.append('1');
    		  }
    		  ar[i] /= 2;
    	  }
    	  int a = sb.length();
    	  if(a!=6){
    		  int b = 6 - a;
    		  for(int j=0;j<b;++j){
    			  sb.append('0');
    		  }
    	  }
    	  sb = sb.reverse();
    	  br[i] = sb.toString();
      }
      long count = 0;
      for(int i=0;i<br.length;++i){
    	  for(int j=0;j<br[i].length();++j){
    		  if(br[i].charAt(j)=='0'){
    			  count++;
    		  }
    	  }
      }
      long max = 1000000007;
      long ans = 1;
      for(int i=0;i<count;++i){
    	  long a = (ans * 3) % max;
    	  ans = a;
      }
      out.println(ans);
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