import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;




public class CF745C {
	static boolean [] ar ;
	static ArrayList<Integer> [] op;
	static int [] br;
	static int [] cr;
	static int count = 0;
public static void main(String []args) {
      MyScanner in = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      //Start your solution from here.
      int n = in.nextInt();
      int m = in.nextInt();
      int k = in.nextInt();
      ar = new boolean[n];
      br = new int[k];
      cr = new int[k];
      CF745C ob = new CF745C(n);
      for(int i=0;i<k;++i){
    	  int l = in.nextInt() - 1;
    	  cr[i] = l;
      }
      for(int i=0;i<m;++i){
    	  int a = in.nextInt() - 1;
    	  int b = in.nextInt() - 1;
    	  ob.addedge(a, b);
      }
      int ans = 0;
      for(int i=0;i<k;++i){
    	  int before = count;
        	 dfs(cr[i]);
          br[i] = count - before;
          ans = Math.max(ans, br[i]);
      }
      int res = n - count;
      for (int i=0;i<k;i++)
		{
			if (br[i]==ans)
			{
				br[i]+=res;
				break;
			}
		}
      int add =0;
		for (int i=0;i<k;i++)
			add += (br[i]*(br[i]-1)/2);
		add-=m;
		System.out.println(add);
      //End your solution here.       
      out.close();
   }
 @SuppressWarnings("unchecked")
CF745C(int n){
	op = new ArrayList[n];
	for(int i=0;i<n;++i){
		op[i] = new ArrayList<Integer>();
	}
}
  void addedge(int i,int j){
	 op[i].add(j);
	 op[j].add(i);
 }
  static void dfs(int x){
	  ar[x] = true;
	  count++;
	//  out.println(x+" "+count);
	  Iterator<Integer> i = op[x].iterator();
	  while(i.hasNext()){
		  int k = i.next();
		  if(!ar[k]){
		 dfs(k);
		 }
	  }
	  return ;
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