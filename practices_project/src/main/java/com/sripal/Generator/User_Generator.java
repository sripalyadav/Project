package com.sripal.Generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class User_Generator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		String prefix="UID";
		String suffix=null;
		try {
			
			Connection con = session.connection();
			Statement stmnt = con.createStatement();
			
			String sql ="select user_seq.nextval from dual";
			
			ResultSet Rs = stmnt.executeQuery(sql);
			
			if (Rs.next()) {
				
			int seqval = Rs.getInt(1);
			
			suffix = String.valueOf(seqval);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
}
		return prefix+suffix;
	}

}
