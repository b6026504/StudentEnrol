package com.enrol

class Course {
		String department
		String courseTitle
		String courseLeader
		String courseCode
		Date startDate
		Date endDate
		String description
		int numberOfStudents
		double tuitionFees
		String studyMode

    static constraints = {
		
		courseTitle nullable:false, blank:true
		department nullable:false, blank:true
		courseLeader nullable:false, blank:true
		courseCode nullable:false, blank:true
		numberOfStudents nullable:false, blank:true, maxSize:60, minSize:20
		startDate nullable:false, blank:true
		endDate nullable:false, blank:true
		studyMode nullable:false, blank:true, maxSize:20
		description nullable:false, blank:true, maxSize:5000, widget:'textarea'
		tuitionFees nullable:false, blank:true, scale:2
		
    }
}
