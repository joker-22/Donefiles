import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF288A {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      int k = in.nextInt();
      boolean flag = false;
      if(n < k || (n>1 && k==1)){
    	  flag = true;
      }
      boolean f = false;
      if((n==1 && k==1)){
    	  out.print('a');
          f = true;
      }
      if(!flag && !f){
    	  char [] ar = new char[n];
    	  char [] op = new char[26];
    	  op[0] = 'a';
    	  for(int i=1;i<op.length;++i){
    		  op[i] = (char) (op[i-1] + 1);
    	  }
    	  char [] nw = new char[k];
    	  for(int i=0;i<nw.length;++i){
    		  nw[i] = op[i];
    	  }
    	  int l = k - 2;
    	  int m = n - l;
    //	  l--;
    	  boolean fl = false;
    	  for(int i=0;i<m;++i){
    		  if(!fl){
    			  ar[i] = 'a';
    			  fl = true;
    		  }
    		  else{
    			  ar[i] = 'b';
    			  fl = false;
    		  }
    	  }
    	  l = 2;
    	  for(int i=m;i<ar.length;++i){
    		  ar[i] = op[l];
    		  l++;
    	  }
    	  out.println(String.valueOf(ar));
      }
      else if(!f){
    	  out.println(-1);
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