package debit.service;

import framework.service.InterestStrategy;

public class SavingInterestStrategy implements InterestStrategy {

	private final Double rate = 0.05;

	public Double getInterest(Double balance) {
		return balance * rate;
	}

}

