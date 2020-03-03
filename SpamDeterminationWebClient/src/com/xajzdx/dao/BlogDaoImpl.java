package com.xajzdx.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xajzdx.pojo.Blog;



public class BlogDaoImpl extends BaseDao{
	//删除博客
	public int delete(int id) {
		int i = 0;
		try {
			super.connection();
			String sql = "delete from blog where id = ?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	/*
	 * 添加博客详情
	 */
	public int saveInfo(Blog blog) {
		int i = 0;
		try {
			super.connection();
			String sql = "insert into blog(uid,title,`schema`,content,datetime )  values (?,?,?,?,?)";
			super.getPst(sql);
			
			pstmt.setInt(1, blog.getUid());
			pstmt.setString(2,blog.getTitle() );
			pstmt.setString(3, blog.getSchema());
			pstmt.setString(4, blog.getContent());
			pstmt.setDate(5, new Date(blog.getDatatime().getTime()));
			
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	//返回博客列表
	public List<Blog> findBlogList() {
		List<Blog> list = new ArrayList<Blog>();
		try {
			super.connection();
			String sql = "select * from blog  order by id desc";
			super.getPst(sql);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Blog blog = this.createBlog(rs);
				list.add(blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//返回博客列表
	public List<Blog> finduBlogList(int id) {
		List<Blog> list = new ArrayList<Blog>();
		try {
			super.connection();
			String sql = "select * from blog where id=? order by id desc";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				Blog blog = this.createBlog(rs);
				list.add(blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//通过博客ID查找博客信息
	public Blog find(int id) {
		Blog blog = null;
		try {
			super.connection();
			String sql = "select * from blog where id=?";
			super.getPst(sql);
			pstmt.setInt(1, id);
			rs = super.pstmt.executeQuery();
			while (rs.next()) {
				blog=this.createBlog(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blog;
	}
	//更新访问量
	public int updateclicks(Blog blog) {
		int i = 0;
		try {
			super.connection();
			String sql = "update blog set clicks=? where id=?";
			super.getPst(sql);
			pstmt.setInt(1, blog.getClicks()+1);
			pstmt.setInt(2, blog.getId());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	/**
	 * 创建博客对象
	 */
	private Blog createBlog(ResultSet rs) throws SQLException {
		Blog blog = new Blog();
		blog.setId(rs.getInt(1));
		blog.setKid(rs.getInt(2));
		blog.setUid(rs.getInt(3));
		blog.setTitle(rs.getString(4));
		blog.setSchema(rs.getString(5));
		blog.setContent(rs.getString(6));
		blog.setClicks(rs.getInt(7));
		blog.setDatatime(rs.getDate(8));
		return blog;
	}

}
