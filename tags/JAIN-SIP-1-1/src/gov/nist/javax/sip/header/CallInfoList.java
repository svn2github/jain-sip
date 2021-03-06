/*******************************************************************************
* Product of NIST/ITL Advanced Networking Technologies Division (ANTD).        *
*******************************************************************************/
package gov.nist.javax.sip.header;
import javax.sip.header.*;

/**
 * A list of CallInfo headers (there can be multiple in a message).
 *
 * @author M. Ranganathan <mranga@nist.gov>  <br/>
 * @version JAIN-SIP-1.1 $Revision: 1.2 $ $Date: 2004-01-22 13:26:29 $
 *
 *<a href="${docRoot}/uncopyright.html">This code is in the public domain.</a>
 */
public class CallInfoList extends SIPHeaderList {

	/**
	 * Default constructor
	 */
	public CallInfoList() {
		super(CallInfo.class, CallInfoHeader.NAME);
	}
}
/*
 * $Log: not supported by cvs2svn $
 */
