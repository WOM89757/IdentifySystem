package com.xajzdx.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.xajzdx.pojo.User;

/**
 * @author WOM
 * @category 鐢ㄦ埛鐨勬暟鎹闂眰
 */
public class UserDaoImpl extends BaseDao{
	


	/*
	 * 閫氳繃鐢ㄦ埛鍚嶅拰瀵嗙爜璁块棶鏁版嵁搴擄紝鏌ヨ鍑虹粨鏋滐紝濡傛灉姝ｇ‘锛岃繑鍥炵敤鎴凤紝鍚﹀垯涓簄ull
	 */
	public User find(String userName, String passWord) {
		User user = null;
		try {
			super.connection();
			String sql = "select * from users where name=? and pass=?";
			super.getPst(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, passWord);
			
			super.rs = pstmt.executeQuery();
			while (rs.next()) {
				user = createUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	/*
	 * 娣诲姞鐢ㄦ埛
	 */
	public int save(User user) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into users (name,pass,sex,birthday,age,tel,inputdate,ip) values (?,?,?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			pstmt.setString(3, user.getSex());
			pstmt.setDate(4, new Date(user.getBirthday().getTime()));
			pstmt.setInt(5, user.getAge());
			pstmt.setString(6, user.getTel());
			//浣跨敤鏃堕棿鎴冲璞★紝鑾峰彇浜嬩欢锛岃鏁版嵁搴撹褰曞綋鍓嶆椂闂达紝鍏蜂綋鍒版椂鍒嗙銆�
			pstmt.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			pstmt.setString(8, user.getIp());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	/*
	 * 娣诲姞鐢ㄦ埛璇︽儏
	 */
	public int saveInfo(User user) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into users (name,pass,birthday,age,sex,tel,provinceId,cityId,areaId,inputdate,ip) values (?,?,?,?,?,?,?,?,?,?,?)";
			super.getPst(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			pstmt.setDate(3, new Date(user.getBirthday().getTime()));
			pstmt.setInt(4, user.getAge());
			pstmt.setString(5, user.getSex());
			pstmt.setString(6, user.getTel());
			pstmt.setString(7, user.getProvinceId());
			pstmt.setString(8, user.getCityId());
			pstmt.setString(9, user.getAreaId());
			pstmt.setDate(10, new Date(user.getInputdate().getTime()));
			pstmt.setString(11, user.getIp());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public List<User> findUserList() {
		List<User> list = new ArrayList<User>();
		try {
			super.connection();
			String sql = "select * from users where id<>1 order by id desc";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				User user = this.createUser(rs);
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public User find(int id) {
		User user = null;
		try {
			super.connection();
			String sql = "select id,name,pass,sex,birthday,age,tel,provinceId,cityId,areaId,inputdate,ip from users where id=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				user = createUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public int delete(int id) {
		int i = 0;
		try {
			super.connection();
			String sql = "delete from users where id = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	/*
	 * 鏇存柊鐢ㄦ埛淇℃伅
	 */
	public int update(User user) {
		int i = 0;
		try {
			super.connection();
			String sql = "update users set name=?,pass=?,birthday=?,age=?,sex=?,tel=?,provinceId=?,cityId=?,areaId=? where id=?";
			super.getPst(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			pstmt.setDate(3, new Date(user.getBirthday().getTime()));
			pstmt.setInt(4, user.getAge());
			pstmt.setString(5, user.getSex());
			pstmt.setString(6, user.getTel());
			pstmt.setString(7, user.getProvinceId());
			pstmt.setString(8, user.getCityId());
			pstmt.setString(9, user.getAreaId());
			pstmt.setInt(10, user.getId());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public User find(String name) {
		User user = null;
		try {
			super.connection();
			String sql = "select id,name,pass,sex,birthday,age,tel,provinceId,cityId,areaId,inputdate,ip from users where name=?";
			super.getPst(sql);
			pstmt.setString(1, name);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				user = createUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	
	/**
	 * 鍒涘缓鐢ㄦ埛瀵硅薄
	 */
	private User createUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setPass(rs.getString(3));
		user.setSex(rs.getString(4));
		user.setBirthday(rs.getDate(5));
		user.setAge(rs.getInt(6));
		user.setTel(rs.getString(7));
		user.setProvinceId(rs.getString(8));
		user.setCityId(rs.getString(9));
		user.setAreaId(rs.getString(10));
		user.setInputdate(rs.getDate(11));
		user.setIp(rs.getString(12));
		return user;
	}
}
