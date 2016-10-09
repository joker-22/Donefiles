import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class GRGUY {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int t = in.nextInt();
      while(t-->0){
    	  String s1 = in.nextLine();
    	  String s2 = in.nextLine();
    	  int [] dp1 = new int[s1.length()+1];
    	  int [] dp2 = new int[s1.length()+1];
    	  dp1[0] = 0;
    	  dp2[0] = 0;
    	  for(int i=0;i<s2.length();++i){
    		  if(s1.charAt(i)=='#'){
    			  dp1[i+1] = Integer.MAX_VALUE - 100;
    		  }
    		  else{
    			  dp1[i+1] = Math.min(dp1[i], dp2[i]+1);
    		  }
    		  if(s2.charAt(i)=='#'){
    			  dp2[i+1] = Integer.MAX_VALUE - 100;
    		  }
    		  else{
    			  dp2[i+1] = Math.min(dp2[i], dp1[i]+1);
    		  }
    	  }
    	  if(dp1[s1.length()]<Integer.MAX_VALUE-100 
    			  || dp2[s1.length()]<Integer.MAX_VALUE-100){
    	  out.println("Yes");
    	  out.println(Math.min(dp1[s1.length()], dp2[s2.length()]));
    	  }
    	  else{
    		  out.println("No");
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