package com.enrol

class Lecturer {

		String fullName
		String post
		String subject
		String lecturerEmail
		String office
		String bio		

    static constraints = {

		fullName nullable:false, blank:true
		post nullable:false, blank:true
		subject nullable:false, blank:true
		lecturerEmail nullable:false, blank:true, email:true
		office nullable:false, blank:true
		bio nullable:false, blank:true, maxSize:5000, widget:'textarea'

    }
}
