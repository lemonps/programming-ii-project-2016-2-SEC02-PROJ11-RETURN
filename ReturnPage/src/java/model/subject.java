/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author homun
 */
public class subject {

    private int id;
    private String name;
    private String course_id;

    public static subject findBySubId(int subId) {
        subject sub = null;
        try {
            Connection con = ConnectionBuilder.getConnection();  // Load driver + Connect 
            String sql = "select * from subject where id = " + subId;
            Statement st = con.createStatement();  // make Query
            ResultSet rs = st.executeQuery(sql);  // execute
            if (rs.next()) {
                sub = new subject();
                sub.setId(rs.getInt("id"));
                sub.setName(rs.getString("name"));
                sub.setCourse_id(rs.getString("course_id"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        String sub2 = "Subject Name = " + sub.getName();
        sub2 += "\nSubject Course_id = " + sub.getCourse_id();
        System.out.println(sub2);
        return sub;
    }

    public static List<subject> findBySubName(String sname) {
        List<subject> subject = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from subject where name like ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, "%" + sname + "%");
            // Statement st = con.createStatement();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                subject sub = new subject();
                sub.setId(rs.getInt("id"));
                sub.setName(rs.getString("name"));
                sub.setCourse_id(rs.getString("course_id"));
                if (subject == null) {
                    subject = new ArrayList<>();
                }
                subject.add(sub);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        return subject;
    }
    
        public static List<subject> findByCourseId(String sname) {
        List<subject> subject = null;
        try {
            Connection con = ConnectionBuilder.getConnection();
            String sql = "select * from subject where course_id like ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, "%" + sname + "%");
            // Statement st = con.createStatement();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                subject sub = new subject();
                sub.setId(rs.getInt("id"));
                sub.setName(rs.getString("name"));
                sub.setCourse_id(rs.getString("course_id"));
                if (subject == null) {
                    subject = new ArrayList<>();
                }
                subject.add(sub);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        return subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public static void main(String[] args) {
        List<subject> s = findByCourseId("mth111");
        for (subject ve : s) {
            System.out.println(ve.toString());
        }

    }

    @Override
    public String toString() {
        return "subject{" + "id=" + id + ", name=" + name + ", course_id=" + course_id + '}';
    }
    
}
