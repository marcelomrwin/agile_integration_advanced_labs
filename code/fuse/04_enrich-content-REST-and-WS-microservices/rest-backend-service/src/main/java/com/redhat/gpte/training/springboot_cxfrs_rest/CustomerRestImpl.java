package com.redhat.gpte.training.springboot_cxfrs_rest;

import org.globex.Account;
import org.globex.Company;

import io.swagger.annotations.Api;

@Api("/customerservice")
public class CustomerRestImpl implements CustomerRest {

	@Override
	public Account enrich(Account account) {
		Company company = account.getCompany();
		Region region = Region.valueOf(company.getGeo());

		company.setGeo(region.getDesc());
		account.setCompany(company);
		return account;
	}
}
