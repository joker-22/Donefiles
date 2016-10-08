import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class BYTESM2 {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int t = in.nextInt();
      while(t-->0){
    	  int row = in.nextInt();
    	  int col = in.nextInt();
    	  int [][] ar = new int[row][col];
    	  for(int i=0;i<row;++i){
    		  for(int j=0;j<col;++j){
    			  ar[i][j] = in.nextInt();
    		  }
    	  }
    	  int ans = 0;
    	  for(int i=0;i<col;++i){
    		 ans = Math.max(ans, ar[0][i]);
    	  }
    	  for(int i=1;i<row;++i){
    		  ans = -1;
    		  for(int j=0;j<col;++j){
    			  if(j>0 && j<col-1){
    				  ar[i][j] = Math.max(ar[i-1][j]+ar[i][j],
    						  Math.max(ar[i-1][j-1]+ar[i][j], ar[i-1][j+1]+ar[i][j]));
    			  }
    			  else if(j>0){
    				  ar[i][j] = Math.max(ar[i-1][j]+ar[i][j], ar[i-1][j-1]+ar[i][j]);
    			  }
    			  else if(j<col-1){
    				  ar[i][j] = Math.max(ar[i-1][j]+ar[i][j], ar[i-1][j+1]+ar[i][j]);
    			  }
    			  ans = Math.max(ans, ar[i][j]);
    		  }
    	  }
    	  out.println(ans);
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