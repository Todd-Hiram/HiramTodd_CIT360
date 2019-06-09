/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_qcjsonexample;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author hiramtodd
 */


@SuppressWarnings("serial")
public class Json_QCJsonExample implements Serializable {
	private String theString;
	private int theInt;
	private Date theDate;

	public Json_QCJsonExample(String aString, int anInt, Date aDate) {
		theString = aString;
		theInt = anInt;
		theDate = aDate;
	}

	public Json_QCJsonExample(HashMap aMapRepresentation){
		this.theString = (String)aMapRepresentation.get("theString");
		//dates are stored as timestamp strings.
		String stampString = (String)aMapRepresentation.get("theDate");
		this.theDate = new Date(Timestamp.valueOf(stampString).getTime());
		//numbers are stored as longs or doubles.
		Long asLong = (Long)aMapRepresentation.get("theInt");
		this.theInt = asLong.intValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Json_QCJsonExample other = (Json_QCJsonExample) obj;
		if (theDate == null) {
			if (other.theDate != null)
				return false;
		} else if (!theDate.equals(other.theDate)){
			System.out.println("failed: "+theDate+" "+other.theDate);
			return false;
		}
		if (theInt != other.theInt)
			return false;
		if (theString == null) {
			if (other.theString != null)
				return false;
		} else if (!theString.equals(other.theString))
			return false;
		return true;
	}
}
