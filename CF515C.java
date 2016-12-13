import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class CF515C {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      ArrayList<Integer> op = new ArrayList<Integer>();
      String s = in.nextLine();
      for(int i=0;i<n;++i){
    	  if(s.charAt(i)=='0' || s.charAt(i)=='1'){
    		  continue;
    	  }
    	  else if(s.charAt(i)=='2'){
    		  op.add(2);
    	  }
    	  else if(s.charAt(i)=='3'){
    		  op.add(3);
    	  }
    	  else if(s.charAt(i)=='4'){
    		  op.add(2);
    		  op.add(2);
    		  op.add(3);
    	  }
    	  else if(s.charAt(i)=='5'){
    		  op.add(5);
    	  }
    	  else if(s.charAt(i)=='6'){
    		  op.add(3);
    		  op.add(5);
    	  }
    	  else if(s.charAt(i)=='7'){
    		  op.add(7);
    	  }
    	  else if(s.charAt(i)=='8'){
    		  op.add(7);
    		  op.add(2);
    		  op.add(2);
    		  op.add(2);
    	  }
    	  else if(s.charAt(i)=='9'){
    		  op.add(7);
    		  op.add(3);
    		  op.add(3);
    		  op.add(2);
    	  }
      }
      Collections.sort(op);
      String ans = "";
      for(int i=op.size()-1;i>=0;i--){
    	  ans += op.get(i);
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