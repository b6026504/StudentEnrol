package com.enrol

class Student {

		String studentName
		String studentID
		Date dob
		Boolean isFundingAvailable
		String studentEmail
		String studentUsername
		String studentPassword
		String course

    static constraints = {

		studentName nullable:false, blank:true 
		studentID nullable:false, blank:true
		dob nullable:false, blank:true 
		studentEmail nullable:false, blank:true, email:true
		studentUsername nullable:false, blank:true, unique:true
		studentPassword nullable:false, blank:true
		isFundingAvailable nullable:false, blank:true
		course nullable:false, blank:true

    }
}
