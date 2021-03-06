package com.infonow.domino

import java.sql.Blob;

class DataFile {
	
	Date loadDate
	Long customerSid
	Long reportingPartnerSid
	Date reportDate
	Long partnerTypeSid
	Date createDate
	Date updateDate
	Integer deleted
	Long idOriginal
	String fileName
	String fileType
	String dataType
	String controlSum
	String encoding
	Blob fileContent
	Long serviceUserSid
	Integer parseable
	Integer parsed
	Long parentSid
	Long fileSize
	Long recordCount
	Integer processingComplete
	Integer endStateValidationsComplete
	

    static constraints = {
    }
	
	static mapping = {
		table 'configuration'
		version false
		id column: 'sid'
		loadDate column: 'load_date'
		customerSid column: 'customer_sid'
		reportingPartnerSid column: 'reporting_partner_sid'
		reportDate column: 'reporting_date'
		partnerTypeSid column: 'partner_type_sid'
		createDate column: 'create_date'
		updateDate column: 'update_date'
		deleted column: 'deleted'
		idOriginal column: 'id'
		fileName column: 'file_name'
		fileType column: 'file_type'
		dataType column: 'data_type'
		controlSum column: 'control_sum'
		encoding column: 'encoding'
		fileContent column: 'file_content'
		serviceUserSid column: 'service_user_sid'
		parseable column: 'parseable'
		parsed column: 'parsed'
		parentSid column: 'parent_sid'
		fileSize column: 'file_size'
		recordCount column: 'record_count'
		processingComplete column: 'processing_complete'
		endStateValidationsComplete column: 'end_state_validations_complete'
	}
}
