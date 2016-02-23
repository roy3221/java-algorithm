/*
 * In this program use the 0,1,2,3,4,5,6 to represent the nodes s,a,b,c,d,e,t in the graph.
 * use 99 to denote the infinity distance between two nodes.
 * Please put the input file at the working directory.		
 * Input absoluteFilePath = workingDirectory + File.separator + filename;
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class DV {
	int[][] s= new int [7][3];
	int[][] a= new int [7][3];
	int[][] b= new int [7][3];
	int[][] c= new int [7][3];
	int[][] d= new int [7][3];
	int[][] e= new int [7][3];
	int[][] t= new int [7][3];
	List<Boolean> update= new ArrayList<Boolean>();// a boolean list to denote if there is updates or not.
	List<int[][]> node= Arrays.asList(s,a,b,c,d,e,t);

	public void initialization(){
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				for(int k=0;k<3;k++){
					if(k==0){
						this.node.get(i)[j][k]=j;	
					}else if(j==i){
						this.node.get(i)[j][k]=0;
					}else{
						this.node.get(i)[j][k]=99;
					}
				}
			}
		}
		for(int i=0;i<7;i++){
			update.add(i,true);
		}
	}
	public void IO() throws IOException{
	this.initialization();
	String filename= "input.txt";
	String workingDirectory = System.getProperty("user.dir");
	String absoluteFilePath = "";
	absoluteFilePath = workingDirectory + File.separator + filename;
	System.out.println("input file path : " + absoluteFilePath);// print the input file path
	// get the input file and scan each data.
	List<String> lines = Files.readAllLines(Paths.get(filename));
			for(int i=2;i<lines.size();i++){
				@SuppressWarnings("resource")
				Scanner sc= new Scanner(lines.get(i));
				sc.useDelimiter(" ");
				if(i==2){
					while(sc.hasNext()){
						sc.next();
						s[1][1]=Integer.parseInt(sc.next());
						s[1][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==3){
					while(sc.hasNext()){
						sc.next();
						s[2][1]=Integer.parseInt(sc.next());
						s[2][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==4){
					while(sc.hasNext()){
						sc.next();
						s[3][1]=Integer.parseInt(sc.next());
						s[3][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==5){
					while(sc.hasNext()){
						sc.next();
						a[4][1]=Integer.parseInt(sc.next());
						a[4][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==6){
					while(sc.hasNext()){
						sc.next();
						b[1][1]=Integer.parseInt(sc.next());
						b[1][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==7){
					while(sc.hasNext()){
						sc.next();
						b[4][1]=Integer.parseInt(sc.next());
						b[4][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==8){
					while(sc.hasNext()){
						sc.next();
						c[5][1]=Integer.parseInt(sc.next());
						c[5][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==9){
					while(sc.hasNext()){
						sc.next();
						d[3][1]=Integer.parseInt(sc.next());
						d[3][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==10){
					while(sc.hasNext()){
						sc.next();
						d[5][1]=Integer.parseInt(sc.next());
						d[5][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==11){
					while(sc.hasNext()){
						sc.next();
						d[6][1]=Integer.parseInt(sc.next());
						d[6][2]=Integer.parseInt(sc.next());
					}
				}
				if(i==12){
					while(sc.hasNext()){
						sc.next();
						e[6][1]=Integer.parseInt(sc.next());
						e[6][2]=Integer.parseInt(sc.next());
					}
				}
				
			}
	}
	
	
	public void update(int[][] run){
		for(int i=0;i<7;i++){
			int before=run[i][2];
			for(int j=0;j<7;j++){
				int[][]next=node.get(j);
				if(run[i][2]>run[j][2]+next[i][2]){
					run[i][2]=run[j][2]+next[i][2];
					run[i][1]=j;
				}
			}
			if(before==run[i][2]){
				update.add(i,false);
			}else {
				update.add(i,true);
			}
		}
	}
	
	public void printResult(){
		System.out.println();
		System.out.println("Notes:");
		System.out.println("In this program use the 0,1,2,3,4,5,6 to represent the nodes s,a,b,c,d,e,t in the graph.");
		System.out.println("Use the number of 99 to denote the infinity distance between two nodes.");
		System.out.println();
		System.out.println("The Distance Vector result is showed below:");
		System.out.println();

		System.out.println();
		for(int i=0; i<=7;i++){
			if(i==0){
				System.out.println("node 0(s)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
			if(i==1){
				System.out.println("node 1(a)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
			if(i==2){
				System.out.println("node 2(b)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
			if(i==3){
				System.out.println("node 3(c)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
			if(i==4){
				System.out.println("node 4(d)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
			if(i==5){
				System.out.println("node 5(e)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
			if(i==6){
				System.out.println("node 6(t)");
				for(int j=0; j<7;j++){
					for(int k=0;k<3;k++){
						System.out.print(node.get(i)[j][k]+"	");
					}
					System.out.println();
				}
				System.out.println();
			}
		}
	}
	
	
	public static void main(String args[]) throws IOException{
		DV getDV= new DV();
		getDV.IO();
		if(getDV.update.contains(true)){
			for(int i=0; i<7;i++){
				getDV.update(getDV.node.get(i));
			}	
		}
		getDV.printResult();
	}
}
