package needleinHaystacl;

public class needle {
	public int strStr(String haystack, String needle) {
        int hl=haystack.length(), nl=needle.length();
        if(hl<nl) return -1;
        if(hl==0&&nl==0) return 0;
        int p1=0;//p2=p1+nl-1;
        char[] h= new char[hl], n =new char[nl], c=new char[nl];
        h=haystack.toCharArray();
        n=needle.toCharArray();
        //System.arraycopy(haystack.toCharArray(),0,h,0,hl);
        //System.arraycopy(needle.toCharArray(),0,n,0,nl);
            while(p1<hl-nl+1){
                if(h[p1]==n[0]){
                    System.arraycopy(h,p1,c,0,nl);
                    if(c==n) return p1;
                }
                p1++;
            }
        return -1;
    }
}
