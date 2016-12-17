import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class CF468A {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      if(n <= 3){
    	  out.println("NO");
      }
      else{
    	  ArrayList<Integer> ar = new ArrayList<Integer>();
    	  for(int i=0;i<n;++i){
    		  ar.add(i+1);
    	  }
    	  if(n%2==0){
    		  out.println("YES");
    		  int count = 0;
    		  for(int i=4;i<ar.size();i+=2){
    			count++;
    			 out.println((i+2)+" "+"-"+" "+(i+1)+" "+"="+" "+"1");
    		  }
    		  for(int i=0;i<count;++i){
    			  out.println("4"+" "+"*"+" "+"1"+" "+"="+" "+"4");
    		  }
    		  out.println("4"+" "+"*"+" "+"3"+" "+"="+" "+"12");
    		  out.println("12"+" "+"*"+" "+"2"+" "+"="+" "+"24");
    		  out.println("24"+" "+"*"+" "+"1"+" "+"="+" "+"24");
    	  }
    	  else{
    		  out.println("YES");
    		  int count = 0;
    		  for(int i=5;i<ar.size();i+=2){
    			  count++;
    			  out.println((i+2)+" "+"-"+" "+(i+1)+" "+"="+" "+"1");
    		  }
    		  for(int i=0;i<count;++i){
    			  out.println("5"+" "+"*"+" "+"1"+" "+"="+" "+"5");
    		  }
    		  out.println("5"+" "+"+"+" "+"4"+" "+"="+" "+"9");
    		  out.println("9"+" "+"*"+" "+"3"+" "+"="+" "+"27");
    		  out.println("27"+" "+"-"+" "+"2"+" "+"="+" "+"25");
    		  out.println("25"+" "+"-"+" "+"1"+" "+"="+" "+"24");
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