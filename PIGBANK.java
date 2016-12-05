import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class PIGBANK {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int t = in.nextInt();
      while(t-->0){
    	  int init = in.nextInt();
    	  int fina = in.nextInt();
    	  int n = in.nextInt();
    	  int [] val = new int[n];
    	  int [] wei = new int[n];
    	  for(int i=0;i<n;++i){
    		  val[i] = in.nextInt();
    		  wei[i] = in.nextInt();
    	  }
    	  fina -= init;
    	  int ans = knap(val,wei,fina,n);
    	  out.println(ans);
      }
      //End your solution here.       
      out.close();
      
   }
static int knap(int [] val,int [] wei,int W,int n){
	int [][] k = new int[n+1][W+1];
	for(int i=0;i<=n;++i){
		for(int j=0;j<=W;++j){
			if(i==0 || j==0){
				k[i][j] = 0;
			}
			
			else if(wei[i-1] <= j){
				k[i][j] = Math.max(k[i-1][j], val[i-1] + k[i-1][j-wei[i-1]]);
			}
			else{
				k[i][j] = k[i-1][j];
			}
		}
	}
	return k[n][W];
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