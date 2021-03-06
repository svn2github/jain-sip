/*******************************************************************************
* Product of NIST/ITL Advanced Networking Technologies Division (ANTD).        *
*******************************************************************************/
package gov.nist.javax.sip.header;
import gov.nist.core.*;
import java.text.ParseException;

/**
* Allow SIPHeader.
*
*@author M. Ranganathan <mranga@nist.gov> NIST/ITL ANTD. <br/>
*
*<a href="{@docRoot}/uncopyright.html">This code is in the public domain.</a>
*
*@version JAIN-SIP-1.1
*/
public class Allow extends SIPHeader implements javax.sip.header.AllowHeader {
    
        /** method field
         */    
	protected String method;

        /** default constructor
         */        
        public Allow() { 
            super(ALLOW);
        }
	
        /** constructor
         * @param m String to set
         */        
        public Allow(String m ) { 
            super(ALLOW);
            method = m;
        }

        /** get the method field
         * @return String
         */        
	public	 String getMethod() { 
            return method ;
        } 

	/**
         * Set the method member
         * @param method method to set.
         */
	public	 void setMethod(String method) throws ParseException{
		if (method==null) 
		throw new  NullPointerException("JAIN-SIP Exception"+
		", Allow, setMethod(), the method parameter is null.");
            this.method = method ;
    } 
		
        /** Return body encoded in canonical form.
         * @return body encoded as a string.
         */        
	protected String encodeBody() {
		return method;
	}
        
}
