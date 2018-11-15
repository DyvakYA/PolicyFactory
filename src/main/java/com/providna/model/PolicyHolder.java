package com.providna.model;

import java.util.HashMap;
import java.util.Map;

public class PolicyHolder {

	private Map<String, AbstractPolicy> policies = new HashMap<>();

	PolicyHolder() {
		init();
	}

	private void init() {
		policies.put("VZR", new VZRPolicyFactory());
		policies.put("OSAGO", new VZRPolicyFactory());
		policies.put("KASKO", new VZRPolicyFactory());
		policies.put("GREEN", new VZRPolicyFactory());
	}

	public AbstractPolicy findPolicy(String commandKey) {
		return policies.getOrDefault(commandKey, new VZRPolicyFactory());
	}

}
