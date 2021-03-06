import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;


public class CF721A {
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      String s =  in.nextLine();
      char[] ar = s.toCharArray();
      int ans = 0;
      int grp = -1;
      boolean flag = false;
      ArrayList<Integer> op = new ArrayList<Integer>();
      for(int i=0;i<n;++i){
    	  if(ar[i]=='W'){
    		  if(grp!=-1 && flag==true){
    			  grp++;
    			  op.add(ans);
    			  ans = 0;
    			  flag = false;
    		  }
    	  }
    	  else{
    		  flag = true;
    		  if(grp==-1){
    			  grp = 0;
    		  }
    		  ans++;
    		  if(i==n-1){
    			  op.add(ans);
    			  grp++;
    		  }
    	  }
      }
      if(grp!=-1)
      out.println(grp);
      else
      out.println(0);
      Iterator<Integer> j = op.iterator();
      for(int i=0;i<op.size();++i){
    	  if(j.hasNext())
    	  out.print(j.next()+" ");
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