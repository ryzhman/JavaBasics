package com.go2it.edu.collectionsAndMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.go2it.edu.inheritence.Bank;
import com.go2it.edu.inheritence.FinancialInstitution;
import com.go2it.edu.inheritence.InsuranceCompany;

/**
 * @author Alex Ryzhkov
 */
public class MapExample {

	public static void main(String[] args) {
		Map<String, Set<FinancialInstitution>> mapAccManagerToFinInstits = new HashMap<>();
		Set<FinancialInstitution> set1 = new HashSet<>();
		set1.add(new InsuranceCompany());

		Bank b1 = new Bank();
		b1.setTitle("JP Morgan Chase");
		b1.setBankAccNumber("1232131243-2");
		set1.add(b1);
		set1.add(new Bank("RBC", "2323-22", "Government", true));

		mapAccManagerToFinInstits.put("Joe Doe", set1);
		mapAccManagerToFinInstits.put("Alan Brown", new HashSet<>());

		for(Map.Entry<String, Set<FinancialInstitution>> entry : mapAccManagerToFinInstits.entrySet()) {
			System.out.println("Account manager name is - "+  entry.getKey());
			Set<FinancialInstitution> clients = entry.getValue();
			if (clients.size() != 0) {
				System.out.println("His clients are:");
			} else {
				System.out.println("There is no clients for this manager");
			}
			for(FinancialInstitution inst: clients) {
				System.out.println(inst.getClass());
			}
		}

	}

}
