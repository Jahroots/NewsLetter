package com.newsletter.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {
	private static final long serialVersionUID = 1L;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}
}
