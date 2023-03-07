package ua.foxminded.javaspring;

public class ToDivision {

	public String toDivision(Integer inputDividend, int divisor) {

		if (divisor == 0) {
			throw new IllegalArgumentException("Divisor cannot be 0, division by zero");
		}

		if (inputDividend < divisor) {
			return "" + inputDividend + "/" + divisor + "=0";
		}

		String[] arrayOfInputDividend = inputDividend.toString().trim().split("");
		StringBuilder dividendNumber = new StringBuilder();
		StringBuilder quotient = new StringBuilder();
		StringBuilder result = new StringBuilder();
		Repeat repeat = new Repeat();

		for (int i = 0; i < arrayOfInputDividend.length; i++) {

			dividendNumber.append(arrayOfInputDividend[i]);
			int dividend = Integer.parseInt(dividendNumber.toString());

			if (dividend >= divisor) {

				quotient.append(dividend / divisor);

				Integer remainder = dividend % divisor;

				Integer multiplyResult = dividend / divisor * divisor;

				dividendNumber.replace(0, dividendNumber.length(), remainder.toString());
				result.append(String.format("%" + (i + 2) + "s", "_" + dividend)).append("\n");
				result.append(String.format("%" + (i + 2) + "s", multiplyResult)).append("\n");
				result.append(String.format("%" + (i + 2) + "s", repeat.repeat("-", multiplyResult.toString().length()))).append("\n");

				if (i == arrayOfInputDividend.length - 1) {
					result.append(String.format("%" + (inputDividend.toString().length() + 1) + "s", remainder))
							.append("\n");
				}
			}

		}

		ModifyResultToView modifyResultToView = new ModifyResultToView();
		return modifyResultToView.modifyResultToView(result, inputDividend, divisor, quotient.toString());

	}
}
