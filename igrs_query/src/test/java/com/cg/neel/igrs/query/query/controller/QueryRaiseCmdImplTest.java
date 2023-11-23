/**
 * 
 */
package com.cg.neel.igrs.query.query.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean;

/**
 * 
 */
class QueryRaiseCmdImplTest {
	

	/**
	 * Test method for {@link com.cg.neel.igrs.query.query.controller.QueryRaiseCmdImpl#saveDocumentNotFoundComplaint(com.cg.neel.igrs.query.query.DocumentNotFoundAccessBean)}.
	 */
	@Test
	void testSaveDocumentNotFoundComplaint() {
		DocumentNotFoundAccessBean documentNotFoundAccessBean = new DocumentNotFoundAccessBean();
		documentNotFoundAccessBean.setAddress("");
	}

}
