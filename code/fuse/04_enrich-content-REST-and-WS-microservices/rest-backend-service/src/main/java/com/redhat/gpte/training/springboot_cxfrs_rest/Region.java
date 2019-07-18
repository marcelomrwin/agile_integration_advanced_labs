package com.redhat.gpte.training.springboot_cxfrs_rest;

public enum Region {
	NA("NORTH_AMERICA"), SA("SOUTH_AMERICA"), WA("WEST_AMERICA"), EA("EAST_AMERICA");

	private final String desc;

	Region(String pDesc) {
		this.desc = pDesc;
	}

	public String getDesc() {
		return desc;
	}

}
