package com.enrol

class Module {

		String module_title
		String module_code
		int credits
		String lecturer
		String course
		String description

    static constraints = {

		module_title nullable:false, blank:true
		module_code nullable:false, blank:true
		credits nullable:false, blank:true, minSize:20, maxSize:120
		lecturer nullable:false, blank:true
		description nullable:false, blank:true, maxSize:5000, widget:'textarea'

    }
}
