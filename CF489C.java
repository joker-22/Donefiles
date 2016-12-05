import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF489C {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int m = in.nextInt();
      int s = in.nextInt();
      if( s > (9*m) || (s==0 && m>1)){
    	  out.println("-1"+" "+"-1");
      }
      else{
    	  int [] val = new int[m];
    	  int [] rev = new int[m];
    	  int r = s;
    	  for(int i=0;i<m;++i){
    		  if(s>9){
    			  val[i] = 9;
    			  s -= 9;
    		  }
    		  else if(s>0 || s<9){
    			  val[i] = s;
    			  s = 0;
    		  }
    		  else{
    			  val[i] = 0;
    		  }
    	  }
    	  r -= 1;
    	  for(int i=m-1;i>0;i--){
    		  if(r >9){
    			  rev[i] = 9;
    			  r -= 9;
    		  }
    		  else{
    			  rev[i] = r;
    			  r = 0;
    		  }
    	  }
    	  rev[0] = r+1;
    	  String min = "";
    	  String max = "";
    	  for(int i=0;i<m;++i){
    		  min += val[i];
    		  max += rev[i];
    	  }
    	  out.print(max+" "+min);
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