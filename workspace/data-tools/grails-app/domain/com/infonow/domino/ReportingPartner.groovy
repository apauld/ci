package com.infonow.domino

class ReportingPartner {
	
	Long idOriginal
	Date createDate
	Date udpateDate
	Long inowProfileSid

    static constraints = {
    }
	
	static mapping = {
		table 'reporting_partner'
		version false
		id column: 'sid'
		idOriginal column: 'id'
		createDate column: 'create_date'
		udpateDate column: 'update_date'
		inowProfileSid column: 'inow_profile_sid'
    }
}
