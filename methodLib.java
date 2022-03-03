package FirstTerm;

public class methodLib {
	int binarySearchIntinArray(int arr[], int x) {
		int min = 0, max = arr.length - 1;
		while (min <= max) {
			int m = min + (max - min) / 2;
			// x değeri ortanca değer mi kontrol et
			if (arr[m] == x)
				return m;
			// x ortanca değerden büyükse, sol yarıyı görmezden gelir
			if (arr[m] < x)
				min = m + 1;
			// x ortanca değerden küçükse, sağ yarıyı görmezden gelir
			else
				max = m - 1;
		}
		// x değeri dizide bulunamadıysa -1 değerini döner
		return -1;
	}
	public static int[] intselectedarraysort(int[] input) {
		int min=0;
				for (int i = 0; i < input.length; i++) {
				min=i;
					for (int j =0; j < input.length-1; j++) {
						int temp ;
						if (input[i] <input[j]){
		min=j;
							
							temp = input[i];
						input[i] = input[j];
						input[j] = temp;
					}
				
					}}
				return input;
			}
	public static int[] intbublearraysort(int[] input) {
		int temp;
		for (int f = 0; f < input.length; f++) {
		for (int i = 0; i < input.length-1; i++) {
				if(input[i]>input[i+1]) {
					temp=input[i];
					input[i]=input[i+1];
					input[i+1]=temp;
						
				}
			}
		}
		return input;
		}
	public static int[] intshufflearray(int[] input) {
		int temp;
		int random=(int)(Math.random()*(input.length-1));
		for (int i = 0; i < input.length; i++) {
			temp=input[i];
	        input[i]=input[random];
	        input[random]=temp;
		}
		return input;
	}
	
	public static boolean textmaymunproof(String input) {
		for (int j = 0; j < input.length(); j++) {
			char index = input.charAt(j);
			if (index > '0' && index < '9')
				return false;
		}
		return true;
	}
	public static int HarfSayısı(String input)
	{
	int harfsayısı=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)<'Z'&&input.charAt(i)>'A'||input.charAt(i)<'z'&&input.charAt(i)>'a') {
				harfsayısı++;
			}
		}
	return harfsayısı;
	}

	public static int kelimesayısı(String input1) {
		int kelimesayı = 0;
		String input = input1.trim();
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == ' ') {
				kelimesayı++;
			}
		}
		return kelimesayı + 1;

	}
}
