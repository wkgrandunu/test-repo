package com.ran.test.repo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("testrepo/health")
public class TestRepoHealthController {

	final static Logger logger = LoggerFactory.getLogger(TestRepoHealthController.class);

	@RequestMapping(value = "/status", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> status() {
		logger.debug("Enters on method status in TestRepoHealthController : ");
		return ResponseEntity.ok("{ \"application\":\"test-repo\",\"status\":\"success\"} ");
	}

	@RequestMapping(value = "/statustwo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> statusTwoEditted() {
		logger.debug("Enters on method status in TestRepoHealthController : ");
		return ResponseEntity.ok("{ \"application\":\"test-repo\",\"status\":\"success\"} ");
	}

}
