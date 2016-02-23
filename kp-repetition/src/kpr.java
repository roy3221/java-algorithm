/*
 * Please put the input file at the working directory.		
 * Input absoluteFilePath = workingDirectory + File.separator + filename;
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class kpr {
	 int numofItems;
	 int W; // variable to store the maximum weight.
	 int [] w,v,item;// arrays to store weight, value and item ID of each item.
	 int [] result;//  array to store result.
	 List<List<Integer>> items= new ArrayList<List<Integer>>();
	 List<Integer> witems= new ArrayList<Integer>();
	 int [] [] items1= new int[W+1][numofItems];// an array to store which item selected for how many times.
	 
	 public kpr() throws IOException{
		 this.input();
	 }
	 
	public int kp(){
		for(int i=0; i<numofItems;i++){
			for(int w=this.w[i];w<=W;w++){
				if(result[w-this.w[i]]+v[i]> result[w]){
					result[w]=result[w-this.w[i]]+v[i];
				}	
			}
	    }
		for(int i=numofItems-1;i>=0;i--){
			for(int j=W;j>=this.w[i];j--){
				if(result[j]==result[j-this.w[i]]+v[i]){
					items1[j][i]++;
					if(j-this.w[i]>this.w[i]){
						items1[j][i]++;
					}
				}
			}
		}
			
		return result[W];
	}
	
	@SuppressWarnings("resource")
	public void input() throws IOException{
		// define the path of the input file.
		String filename= "input.txt";
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = "";
		absoluteFilePath = workingDirectory + File.separator + filename;
		System.out.println("input file path : " + absoluteFilePath);// print the input file path
		// get the input file and scan each data.
		List<String> lines = Files.readAllLines(Paths.get(filename));
		List<Integer> iteml= new ArrayList<Integer>();
		List<Integer> wl= new ArrayList<Integer>();
		List<Integer> vl= new ArrayList<Integer>();
		int[] ret= new int[2];
		ret[0]=lines.size()-1;
		int[] win= new int[ret[0]];
		int[] vin= new int[ret[0]];
		int[] itemin= new int[ret[0]];
		ret[1]=Integer.parseInt(lines.get(0));
		int [] resultin= new int[W+1];
		int [] [] itemsin= new int[W+1][ret[0]];
				for(int i=1;i<lines.size();i++){
					Scanner sc= new Scanner(lines.get(i));
					sc.useDelimiter(" ");
					 while (sc.hasNext()) {
						 iteml.add(Integer.parseInt(sc.next()));
						 wl.add(Integer.parseInt(sc.next()));
						 vl.add(Integer.parseInt(sc.next()));
					 }
				}
				 for(int i = 0;i<wl.size();i++){
					 win[i]=wl.get(i);
				 }
				 for(int i = 0;i<vl.size();i++){
					 vin[i]=vl.get(i);
				 }
				 for(int i = 0;i<iteml.size();i++){
					 itemin[i]=vl.get(i);
				 }
				 this.w=win;
				 this.v=vin;
				 this.item=itemin;
				 this.W=ret[1];
				 this.result=resultin;
				 this.items1=itemsin;
				 this.numofItems=ret[0];
				 this.W=ret[1];
	}
	
	public static void main(String args[]) throws IOException {
		kpr test= new kpr();
		test.input();
		int result=test.kp();
		System.out.println();
		System.out.println("The Result is:");
		System.out.println(result);
		System.out.print("item: 	1	2	3	4");
		System.out.println();
		System.out.print("num.:");
		for(int i=0;i<test.items1[test.W].length;i++){
				System.out.print("	"+test.items1[10][i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("The array to store the optimal value is:");
		System.out.print("w	");
		for(int i=0;i<test.result.length;i++){
			System.out.print(i+"	");
		}
		System.out.println();
		System.out.print("Opt(w) 	");
		for(int i=0;i<test.result.length;i++){
			System.out.print(test.result[i]+"	");
		}
		System.out.println();
	}
}
