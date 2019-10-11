package com.go2it.edu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.go2it.edu.inheritence.Bank;
import com.go2it.edu.inheritence.CreditUnion;
import com.go2it.edu.inheritence.FinancialInstitution;
import com.go2it.edu.inheritence.InsuranceCompany;

/**
 * @author Alex Ryzhkov
 */
public class IterationRemoval {
	public static void main(String[] args) {
		List<FinancialInstitution> fins = new ArrayList<>();
		fins.add(new InsuranceCompany());
		fins.add(new Bank());
		fins.add(new CreditUnion());

		//		for (FinancialInstitution inst : fins) {
		//			if ("com.go2it.edu.inheritence.InsuranceCompany".equals(inst.getClass().getName())) {
		//				fins.remove(inst);
		//			}
		//		}

		Iterator<FinancialInstitution> iter = fins.iterator();
		while (iter.hasNext()) {
			FinancialInstitution inst = iter.next();
			if ("com.go2it.edu.inheritence.InsuranceCompany".equals(inst.getClass().getName())) {
				iter.remove();
			}
		}

		System.out.println(fins.size());

	}

}
