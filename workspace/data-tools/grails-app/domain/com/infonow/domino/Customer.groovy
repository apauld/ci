package com.infonow.domino

class Customer {
	
	Long idOriginal
	String customerName
	Long inowAddressSid
	Date createDate
	Date updateDate
	Long currencySid
	String operationalStatus
	String updateHost
	String updateOsUser
	String updateIpAddress

    static constraints = {
    }
	
	static mapping = {
		table 'configuration'
		version false
		id column: 'sid'
		idOriginal column: 'id'
		idOriginal column: 'customer_name'
		idOriginal column: 'inow_address_sid'
		idOriginal column: 'create_date'
		idOriginal column: 'update_date'
		idOriginal column: 'currency_sid'
		idOriginal column: 'operational_status'
		idOriginal column: 'update_host'
		idOriginal column: 'update_os_user'
		idOriginal column: 'update_ip_address'
		
	}
}
