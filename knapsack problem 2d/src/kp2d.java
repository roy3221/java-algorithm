import java.util.ArrayList;
import java.util.List;


public class kp2d {
	int[] w, z,v= new int[5];
	int result=0;
	List<Integer> items= new ArrayList<Integer>();
	List<Integer> itemR= new ArrayList<Integer>();
	
 public  kp2d(int[] w, int [] z,int [] v,int W,int Z){
	 this.w=w;
	 this.z=z;
	 this.v=v;
 }
 
 private int kp(int i, int W, int Z){
	 int res=0;
	 if(i<0||W<0||Z<0){
		 return res;
	 }
	 int o1=kp(i-1,W,Z);
	 int o2=kp(i-1,W-w[i],Z-z[i])+v[i];
	 res= Math.max(o1, o2);
	 items.add(i);		
	 return res;
 }
 /*public static void main(String args[]){
	 int [] w={1,2,5,6,7};
	 int [] z={1,10,3,2,2};
	 int [] v={1,6,18,22,28};
	 int W=11, Z=15;
	 kp2d test= new kp2d(w,z,v,W,Z);
	 test.result=test.kp(4,11,15);
	 System.out.println("the result="+test.result);
	 for(int j=0;j<test.itemR.size();j++){
		 System.out.println("the items are "+test.itemR.get(j));
	 }
 }*/
}
