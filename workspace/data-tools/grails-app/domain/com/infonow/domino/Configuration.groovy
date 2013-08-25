package com.infonow.domino

class Configuration {
	Long serviceSid
	Long customerSid
	Long reportingPartnerSid
	String serviceName
	String name
	String configurationType
	String xmlData
	Date createDate
	Date updateDate
	

    static constraints = {
    }
	
	static mapping = {
		table 'configuration'
		version false
		id column: 'sid'
		serviceSid column: 'service_sid'
		customerSid column: 'customer_sid'
		reportingPartnerSid column: 'reporting_partner_sid'
		serviceName column: 'service_name'
		name column: 'name'
		configurationType column: 'configuration_type'
		xmlData column: 'xml_data', type: "text"
		createDate column: 'create_date'
		updateDate column: 'update_date'
	}
}
