import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF723B {
public static void main(String []args) throws IOException {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      String s = in.nextLine();
      int [] ar = new int[n];
      int nop = 0;
      for(int i=0;i<n;++i){
    	  if(s.charAt(i)=='('){
    		  ar[i] = 0;
    		  nop++;
    	  }
    	  else if(s.charAt(i)==')'){
    		  ar[i] = 1;
    	  }
    	  else if(s.charAt(i)=='_'){
    		  ar[i] = -1;
    	  }
    	  else{
    		  ar[i] = Integer.MAX_VALUE;
    	  }
      }
      int [] par1 = new int[nop];
      int [] par2 = new int[nop];
      int k = 0;
      int l = 0;
      for(int i=0;i<n;++i){
    	  if(ar[i]==0){
    		  par1[k] = i;
    		  k++;
    	  }
    	  else if(ar[i]==1){
    		  par2[l] = i;
    		  l++;
    	  }
      }
      int count = 0;
      int fo = 0;
    //  boolean flag = false;
      int x = 0;
      for(int i=0;i<n;++i){
    	  if(ar[i]==0){
    		  i = par2[x];
    		  x++;
    	  }
    	 if(ar[i]==Integer.MAX_VALUE){
    		 fo = i;
    		 break;
    	 }
      }
      boolean f = false;
      int y = 0;
      for(int i=0;i<par1.length;++i){
    	 int x1 = par1[y];
    	 int y1 = par2[y];
    	 for(int j=x1;j<=y1;++j){
    		 if(ar[j]==Integer.MAX_VALUE){
    			 f = true;
    		 }
    		 if((f==true && ar[j]==-1) || ((f==true &&  j==y1))){
    			 count++;
    			// out.print(j+" ");
    			 f = false;
    		 
    	 }
    	 
       } 
    	 y++;
    	 }
      int mm = 0;
      int ans = 0;
      boolean fla = false;
      boolean d = false;
      int len = 0;
      int z = 0;
      for(int i=0;i<n;++i){
    	  if(fla==false){
    		  if(ar[i]==Integer.MAX_VALUE){
    			  d = true;
    			  z++;
    			 // out.print(z+" ");
    		  }
    		  if(d==true){
    			  if(ar[i]==-1 || ar[i]==0 || i==n-1){
    				  len = z;
    				  ans = Math.max(ans, len);
    				  z = 0;
    				  d=false;
    			  }
    		  }
    	  }
    	  if(ar[i]==0){
    		  fla = true;
    	  }
    	  if(ar[i]==1){
    		  fla = false;
    	  }
      }
      out.println(ans+" "+count);
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