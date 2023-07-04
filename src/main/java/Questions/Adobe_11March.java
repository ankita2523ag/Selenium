package Questions;

/*
 * 
 * arr = [1, 2,5, 3 , 4, 3]   ..... 100]


1-1
2-1
5-1
3-2
4-1

arr_base[0,0,0,0,0,0]	[0,1,1,2,1,1]

int[] arr = new arr[1, 2,5, 3 , 4, 3];
int[] arr_base = new arr[arr.length+1];
for(int i=0; i< arr.length+1; i++)
{
	arr_base[i] = 0;
}
for(int i=0; i< arr.length; i++)
{
	arr_base[arr[i]] = arr_base[arr[i]] +1;
}

arr_base[arr[arr.length-1]] = arr_base[arr.length-1] +1;

-----------------------------------
vr1 = ver10.1
vr2 = ver10.2

int compareVersion(String vr1, String vr2)
{
	Char[] arr_vr1 = vr1.split("ver");
	Char[] arr_vr2 = vr2.split("ver");

}



 */
public class Adobe_11March {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vr1 = "ver10.1";
		String vr2 = "ver10.2";
		Adobe_11March ab = new Adobe_11March();
		ab.compareVersion(vr1,vr2);
		
	}
	
	public int compareVersion(String vr1, String vr2)
	{
		String[] arr_vr1 = vr1.split("ver");
		String[] arr_vr2 = vr2.split("ver");
		double v1 = Double.parseDouble(arr_vr1[1]);
		double v2 = Double.parseDouble(arr_vr2[1]);
		System.out.println(v1);
		System.out.println(v2);
		if(v1>v2) {
			return 0;
		}
		return 1;
		
	}

}
