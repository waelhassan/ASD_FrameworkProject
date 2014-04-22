package edu.mum.cs.asd.framework.model.test;

import edu.mum.cs.asd.framework.model.IAccount;
import edu.mum.cs.asd.framework.model.predicate.IPredicate;

public class AlwaysSufficientPredicate implements IPredicate<IAccount> {

	@Override
	public boolean check(IAccount t) {
		return true;
	}

}
