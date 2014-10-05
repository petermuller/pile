package com.petermuller.pile;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * SimpleResponse
 * A class for returning data with a single key-value pair
 *
 * @author pmuller
 */
@XmlRootElement
public class SimpleResponse {

	public String resp;

	/**
	 * Empty constructor. Do not use
	 */
	public SimpleResponse(){}

	/**
	* Constructs object consisting of a string
	*/
	public SimpleResponse(String r){
		resp = r;
	}

	/**
	 * Gets the given response string
	 * @returns String response
	 */
	public String getResp(){
		return resp;
	}

	@Override
	public boolean equals(Object o){
		if (this == o){
			return true;
		}
		if (o == null || getClass() != o.getClass()){
			return false;
		}
		SimpleResponse other = (SimpleResponse) o;
		if (resp == other.getResp()){
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return resp.hashCode();
	}

}
