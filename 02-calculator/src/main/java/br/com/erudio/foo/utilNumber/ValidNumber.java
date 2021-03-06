package br.com.erudio.foo.utilNumber;

public class ValidNumber {
	
	public Double convertToDouble(String strNumber) {
		if(strNumber == null)
			return 0D;
		
		String number = strNumber.replace(",", ".");
		if(isNumeric(number))
			return Double.parseDouble(number);
		
		return 0D;
	}

	public boolean isNumeric(String strNumber) {
		boolean result;
		if(strNumber == null)
			return false;
		
		String number = strNumber.replace(",", ".");
				
		result = number.matches("[-+]?[0-9]*\\.?[0-9]");	
				
		return result;
	}
}
