package api.lang.string;

public class Test08_1 {
	public static void main(String[] args) {

		String[] filter = new String[] {
			"수박씨", "신발끈", "개나리", "십장생", "시베리아",
			"주옥", "조카", "게불", "10원"
		};

		String line = "이런 수박씨 신발끈 개나리같은 십장생!!!!";

		for(int i=0; i < filter.length; i++) {
			line = line.replace(filter[i], "***");
		}

		System.out.println(line);

	}
}