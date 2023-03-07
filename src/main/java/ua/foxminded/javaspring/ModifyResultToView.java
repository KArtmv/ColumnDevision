package ua.foxminded.javaspring;

public class ModifyResultToView {

	public String modifyResultToView(StringBuilder sb, Integer dividend, int divisor, String quotient) {
		Repeat repeat = new Repeat();
		int[] index = new int[3];
		for (int i = 0, j = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '\n') {
				index[j] = i;
				j++;
			}

			if (j == 3) {
				break;
			}
		}

		int tab = dividend.toString().length() + 1 - index[0];
		sb.insert(index[2], repeat.repeat(" ", tab) + "│" + quotient);
		sb.insert(index[1], repeat.repeat(" ", tab) + "│" + repeat.repeat("-", quotient.length()));
		sb.insert(index[0], "│" + divisor);
		sb.replace(1, index[0], dividend.toString());

		return sb.toString();
	}

}
