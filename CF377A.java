import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class CF377A {
	static boolean [][] ar;
    static char [][] cr;
    static int count;
    static int n;
    static int m;
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      n = in.nextInt();
      m = in.nextInt();
      int k = in.nextInt();
      cr = new char[n][m];
      for(int i=0;i<n;++i){
    	  cr[i] = in.nextLine().toCharArray();
      }
      ar = new boolean[n][m];
   //   br = new int[n][m];
      int x = -1;
      int y = -1;
      count = 0;
      for(int i=0;i<n;++i){
    	  for(int j=0;j<m;++j){
    		  if(cr[i][j]=='.'){
    			  x = i;
    			  y = j;
    			  count++;
    		  }
    	  }
      }
     // out.println(count +" "+x+" "+y);
      count -= k;
      if(k>0){
      dfs(x,y);
      for(int i=0;i<n;++i){
    	  for(int j=0;j<m;++j){
    		  if(!ar[i][j] && cr[i][j]=='.'){
    			  out.print('X');
    		  }
    		  else{
    			  out.print(cr[i][j]);
    		  }
    	  }
    	  out.println();
      }
      }
      else{
    	  for(int i=0;i<n;++i){
    		out.println(String.valueOf(cr[i]));  
    	  }
      }
      //End your solution here.       
      out.close();
   }
static void dfs(int x,int y){
	if(count > 0){
		//count--;
		int [] dx = {-1,0,1,0};
		int [] dy = {0,1,0,-1};
		for(int i=0;i<4;++i){
			int xi = x + dx[i];
			int yi = y + dy[i];
			if(xi >=0 && xi < n && yi >= 0 && yi < m){
				if(cr[xi][yi]=='.' && !ar[xi][yi] && count>0){
					//out.println(xi+" "+yi+" "+count);
					ar[xi][yi] = true;
					count--;
					dfs(xi,yi);
				}
			}
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
    	  return next().charAt(0);
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