import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF363B {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution here.
      int n = in.nextInt();
      int k = in.nextInt();
      int [] ar = new int[n];
      ar = in.nextIntAr(ar);
      int [] dp = new int[n];
      dp[0] = ar[0];
      for(int i=1;i<k;++i){
    	  dp[i] = dp[i-1] + ar[i];
      }
      if(k==1){
    	  int min = Integer.MAX_VALUE;
    	  int idx = 0;
    	  for(int i=0;i<n;++i){
    		  if(min > ar[i]){
    			  min = ar[i];
    			  idx = i;
    		  }
    	  }
    	  out.println(idx+1);
      }
      else if(n==k){
    	  out.println(1);
      }
      else{
      int l = 0;
      for(int i=k;i<n;++i){
    	  dp[i] = dp[i-1] + ar[i];
    	  dp[i] -= ar[l];
    	  l++;
      }
      int min = Integer.MAX_VALUE;
      int idx = 0;
      for(int i=k-1;i<n;++i){
    	  if(min > dp[i]){
    		  min = dp[i];
    		  idx = i;
    	  }
      }
      //out.println(idx);
      idx++;
      idx -= k;
      out.println(idx+1);
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