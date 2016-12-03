import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class CF492C {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      long r = in.nextLong();
      long avg = in.nextLong();
      avg = avg * n;
      long pre = 0;
      long ans = 0;
      ArrayList<essay> essays = new ArrayList<essay>();
      for(int i=0;i<n;++i){
    	  int a1 = in.nextInt();
    	  int b1 = in.nextInt();
    	  pre += a1;
    	  essays.add(new essay(a1,b1));
      }
      Collections.sort(essays);
     // out.println(pre);
      long count = Math.max(0, avg - pre);
     for(int i=0;i<n;++i){
    	 essay obj = essays.get(i);
    	 long add = Math.min(count, r - obj.a);
    	 ans += add*obj.b;
    	 count -= add;
     }
      out.println(ans);
      //End your solution here.       
      out.close();
      
   }
static class essay implements Comparable<essay>{
	 private int a;
	 private int b;
	 essay(int a,int b){
		 this.a = a;
		 this.b = b;
	 }


	public int compareTo(essay e) {
		// TODO Auto-generated method stub
		if(this.b == e.b)
		return 0;
		else{
			return this.b > e.b ? 1 : -1;
		}
	}
	
	 
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