package com.hemanth.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateInterestAmountMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalculateInterestAmountMethodReplacer.reimplement(-,-,-) (Simple Interest)");
		double pamt = (double)args[0];
		double rate = (double)args[1];
		double time = (double)args[2];
		
		// Calculate Simple Interest Amount
		double intramount = pamt*rate*time/100.0f;
		
		return intramount;
	}

}
