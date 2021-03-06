package br.com.erudio.foo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.foo.exception.UnsuportedMathOperationException;
import br.com.erudio.foo.math.OperationMath;
import br.com.erudio.foo.utilNumber.ValidNumber;

@RestController
@RequestMapping(value = "/calculadora")
public class MathController {

	
	private ValidNumber validNumber = new ValidNumber();
	
	
	private OperationMath operationMath = new OperationMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if(!validNumber.isNumeric(numberOne) || !validNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		return operationMath.sum(validNumber.convertToDouble(numberOne), validNumber.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}")
	public Double subtract(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if(!validNumber.isNumeric(numberOne) || !validNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		return operationMath.subtract(validNumber.convertToDouble(numberOne), validNumber.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}")
	public Double multiply(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if(!validNumber.isNumeric(numberOne) || !validNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		return operationMath.multiply(validNumber.convertToDouble(numberOne), validNumber.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if(!validNumber.isNumeric(numberOne) || !validNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		return operationMath.division(validNumber.convertToDouble(numberOne), validNumber.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}")
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if(!validNumber.isNumeric(numberOne) || !validNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		return operationMath.average(validNumber.convertToDouble(numberOne), validNumber.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/squareRoot/{numberOne}")
	public Double squareRoot(@PathVariable("numberOne") String numberOne){	
		if(!validNumber.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		return operationMath.squareRoot(validNumber.convertToDouble(numberOne));

	}
}
