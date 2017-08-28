package com.qlth.dbprovider;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.qlth.dao.DataConnection;
import com.qlth.model.HocSinh;

public class HocSinhDao {
	private DataConnection con = new DataConnection();
	private static final Log logger = LogFactory.getLog(HocSinhDao.class);

	public ArrayList<HocSinh> getDanhSachHocSinh() {
		ArrayList<HocSinh> arr = new ArrayList<HocSinh>();
		String query = "{CALL getHocSinh()}";
		try {
			CallableStatement st = con.createConnect().prepareCall(query);
			ResultSet result = null;
			logger.info("Querying data in nguoidung table");
			result = st.executeQuery();
			logger.info("Queried");
			HocSinh hs;
			while (result.next()) {
				hs = new HocSinh(result.getString(1), result.getString(2), result.getString(3), result.getString(4),
						result.getString(5), result.getDate(6), result.getString(7), result.getString(8),
						result.getDate(9), result.getString(10), result.getString(11), result.getString(12),
						result.getString(13), result.getString(14), result.getString(15), result.getString(16),
						result.getString(17));
				arr.add(hs);
			}
			return arr;
		} catch (SQLException e) {
			logger.error(e.getMessage());
			return null;
		}

	}

}