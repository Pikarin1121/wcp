
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		int [] array = { 1, 4, 14, 25};
//		インデックス番号は0から始まり、要素は4つあるため、インデックス番号は0，1，2，3 → インデックスiが4以下になればよい
		for (int i = 0; i < array.length; i++) {
//			配列は要素のデータを出す際、インデックス番号iの時、array[i]で出す
			System.out.println(array[i]);
		}
		for (int val : array) {
//			偶数の要素ををスキップ、つまり2で割った余りが0になればよい
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
