package com.example.gallary.gallery.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public abstract class AbstractController {
	private static final Logger LOG = LoggerFactory
			.getLogger(AbstractController.class);

	@ExceptionHandler
	public ModelAndView handleException(final Exception e) {
		LOG.error("Exception on controller", e);
		
		return new ModelAndView("error", "message", e.getMessage());
	}
}
