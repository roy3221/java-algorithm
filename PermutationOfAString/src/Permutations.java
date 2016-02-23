

public class Permutations {
	private boolean[] used;
	private StringBuilder out= new StringBuilder();
	private final String in;
	private int num;
	
	public Permutations(final String str){
		in=str;
		used= new boolean[in.length()];
		System.out.println(in);
		num=0;

	}
	
	public void permute(){
		System.out.println("out="+out);
		if(out.length()==in.length()){
			System.out.println(out);
			num++;
			return;
		}
		
		for(int i=0; i<in.length();i++){
			//if(i==1){System.out.println("i=1");}
			//if(i==2){System.out.println("i=2");}
			//if(i==3){System.out.println("i=3");}
			//if(i==0){System.out.println("i=0");}

			if(used[i]) continue;
			out.append(in.charAt(i));
			used[i]=true;
			permute();
			used[i]=false;
			out.setLength(out.length()-1);
		}
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
		//System.out.println("please enter your strings");
		//Scanner s = new Scanner(System.in);
		// String str = s.nextLine();
		Permutations test= new Permutations("abcd");
		test.permute();
		System.out.println(test.num);
	}
}

