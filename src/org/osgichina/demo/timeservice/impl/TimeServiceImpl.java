package org.osgichina.demo.timeservice.impl;

import java.util.Date;

import org.osgichina.demo.timeservice.TimeService;


/**
 * TimeService的实现
 * @author chris
 *
 */
public class TimeServiceImpl implements TimeService{

	public String getCurrentTime() {
		return (new Date()).toString();
	}

}
