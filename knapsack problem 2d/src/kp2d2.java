import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class kp2d2 {
	int n,W,Z;
	int[] w, z,v= new int[n];
	int result=0;
	 public  kp2d2(int[] w, int [] z,int [] v,int n, int W,int Z){
		 this.w=w;
		 this.z=z;
		 this.v=v;
		 this.W=W;
		 this.Z=Z;
		 this.n=n;
	 }
	 public void kp(){
			int [][][] opt= new int[n][W+1][Z+1];
			List<List<Integer>> item= new ArrayList<List<Integer>>();
			for(int w2=0;w2<=W;w2++){
				 for(int z2=0;z2<=Z;z2++){
					 opt[0][w2][z2]=v[0];
				 }
			}
			
				 List<Integer> item0= new ArrayList<Integer>();
				 item0.add(0);
				 item.add(0,item0);
			 for(int i=1;i<n;i++){
				 List<Integer> items= new ArrayList<Integer>();
				 for(int w1=0;w1<=W;w1++){
					 for(int z1=0;z1<=Z;z1++){
						 if(w1-w[i]>=0&&z1-z[i]>=0){
								opt[i][w1][z1]=Math.max(opt[i-1][w1][z1], opt[i-1][w1-w[i]][z1-z[i]]+v[i]); 
						 }else continue;
					 }
				 }
				item.add(i,items); 
			 }
			 for(int i=0;i<item.size();i++){
				 System.out.println("opt["+(i+1)+"][11][15]="+opt[i][W][Z]);
			 }			
	 }
	 public static void main(String args[]){
		 int [] w={1,2,5,6,7};
		 int [] z={1,10,3,2,2};
		 int [] v={1,6,18,22,28};
		 int W=11, Z=15, n=5;
		 kp2d2 test= new kp2d2(w,z,v,n,W,Z);
		 test.kp();
	 }
}
