package coding_challenge;

import java.util.ArrayList;
import java.util.Collections;

public class closestSequence2 {
	public static void main(String[]args){
		System.out.println(closestSequence(new int[]{1, 2, 6},new int[]{0, 1, 3, 4, 5}));
	}
	private static int closestSequence(int[]a,int[]b){
		if(a.length<3||a.length>1000||b.length<a.length||b.length>1000){
			throw new IllegalArgumentException();
		}
		if(a.length==b.length){
			int result=0;
			for(int i=0;i<a.length;i++){
				int aval = a[i];
				int bval = b[i];
				if(aval <-1000 || bval<-1000 || aval>1000|| bval>1000){
					throw new IllegalArgumentException();
				}
				result+=Math.abs(aval-bval);
			}
			return result;
		}
		ArrayList<ArrayList<Integer>> results=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a.length;i++){
			results.add(new ArrayList<Integer>());
			int aval = a[i];
			if(aval<-1000||aval>1000){
				throw new IllegalArgumentException();
			}
			for(int j=i, sublist=1;j<(b.length-(a.length-(i+1)));j++,sublist++){
				int bval= b[j];
				if(bval<-1000||bval>1000){
					throw new IllegalArgumentException();
				}
				if(i!=0){
					results.get(i).add(Collections.min(results.get(i-1).subList(0, sublist))+Math.abs(aval-bval));
				}
				else{
				results.get(i).add(Math.abs(aval-bval));
				}
			}
			System.out.println(results.get(i));
		}
		
		return Collections.min(results.get(results.size()-1));
	}
}
