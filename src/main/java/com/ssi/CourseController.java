package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	@RequestMapping("newcourse")
	public String showCourseEntryPage() {
		return "centry";
	}
	
	@RequestMapping("savecourse")
	public void saveCourseData() {
		//read-the-data-coming-with-request
		//store-that-to-db-using-hibernate
		//return-the-view-name
	}
}
