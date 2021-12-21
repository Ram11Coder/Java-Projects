

public final class RelationShipCalculator {

	private RelationShipCalculator() {
	}

	public static String relationshipCheck(int number) {
		int val = 0, count;
//		if(number ==0) {
//			System.out.println("We can't apply the FLAMES for above names");
//			return
//		}
		char cArr[] = "FLAMES".toCharArray();
		for (int i = 0; i < 5; i++) {
			count = 0;

			while (count < number) {
				if (cArr[val % 6] != 'x')
					count++;
				val++;
			}
			// System.out.println("Removed char ->" + cArr[(val - 1) % 6]);
			cArr[(val - 1) % 6] = 'x';
		}
		// System.out.println("cArr is ->" + String.valueOf(cArr));
		return getrelation(cArr);

	}

	private static String getrelation(char[] cArr) {
		char relationChar = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] != 'x') {
				relationChar = cArr[i];
			}
		}
		// System.out.println("Relationcahr is -> " + relationChar);
		return getActualRelationName(relationChar);
	}

	public static String getActualRelationName(char relationChar) {
		switch (relationChar) {
		case 'F':
			return "Friendship";
		case 'L':
			return "Lover";
		case 'A':
			return "Affection";
		case 'M':
			return "Marriage";
		case 'E':
			return "Enemy";
		case 'S':
			return "Sister";
		default:
			return "No relation";

		}

	}

	public static int calculator(String p1, String p2) {
		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();
		char arr1[] = p1.toCharArray();
		char arr2[] = p2.toCharArray();
		int count = 0, total = arr1.length + arr2.length;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr1[i] = arr2[j] = '0';
					count += 2;
					break;
				}
			}
		}
		// System.out.println("Total ->" + (total - count));
		return (total - count);
	}
}
