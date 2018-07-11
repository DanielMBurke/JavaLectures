package com.techelevator.fbn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.fbn.model.MortgageLoanEstimate;

@Controller
public class PaymentCalculatorController {

	@RequestMapping(path="/mortgageCalculatorInput", method=RequestMethod.GET)
	public String showMortgagePaymentCalculatorInputPage() {
		return "mortgageCalculatorInput";
	}
	
	@RequestMapping(path="/mortgageCalculatorResult", method=RequestMethod.GET)
	public String showMortgagePaymentCalculatorResults(@RequestParam int loanAmount, @RequestParam int loanTerm, @RequestParam double rate, ModelMap modelHolder) {
		
		MortgageLoanEstimate estimate = new MortgageLoanEstimate(loanAmount, loanTerm, rate);
		modelHolder.put("estimate", estimate);
		
		return "mortgageCalculatorResult";
	}
}
