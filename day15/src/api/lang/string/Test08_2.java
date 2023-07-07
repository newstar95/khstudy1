package api.lang.string;

public class Test08_2 {
	public static void main(String[] args) {

		String[] filter = new String[] {
			"수박씨", "신발끈", "개나리", "십장생", "시베리아",
			"주옥", "조카", "게불", "10원"
		};

		String line = "조카 수박씨 신발끈 개나리같은 시베리아!!!!";
		String star = "*";

		for(int i=0; i < filter.length; i++) {
			int count = filter[i].length();
			line = line.replace(filter[i], star.repeat(count));
		}

		System.out.println(line);

	}
}