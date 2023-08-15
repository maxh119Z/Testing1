
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] poop ={10,4,3,9,5};
int lol;
int dang;
for(int e = 0; e < poop.length-1; e++){

	
	for (int i=0; i<poop.length-1; i++)
	{
		if (poop[i]>poop[i+1]){
		
			lol = poop[i];
			dang = poop[i+1];
			poop[i]=dang;
			poop[i+1]=lol;

	}	
	}
} 
for(int f = 0; f<poop.length; f ++){
	System.out.println(poop[f]);
}

	}

}
