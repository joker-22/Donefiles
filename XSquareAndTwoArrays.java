import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class XSquareAndTwoArrays {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      int q = in.nextInt();
      long [] a = new long[n+1];
      long [] b = new long[n+1];
      for(int i=1;i<=n;++i)
    	  a[i] = in.nextLong();
      for(int i=1;i<=n;++i)
    	  b[i] = in.nextLong();
      for(int i=2;i<=n;i+=2){
    	  long temp = a[i];
    	  a[i] = b[i];
    	  b[i] = temp;
      }
      for(int i=1;i<=n;++i){
    	  a[i] += a[i-1];
    	  b[i] += b[i-1];
      }
      for(int i=0;i<q;++i){
    	  int ins = in.nextInt();
    	  int le = in.nextInt();
    	  int ri = in.nextInt() ;
    	  if(ins==1 && (le %2==1)){
    		  out.println((a[ri] - a[le-1]));
    	  }
    	  else if(ins==1 && (le %2==0)){
    		  out.println(b[ri] - b[le-1] );
    	  }
    	  else if(ins==2 && (le %2==1)){
    		  out.println(b[ri] - b[le-1]);
    	  }
    	  else{
    		  out.println(a[ri] - a[le-1] );
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