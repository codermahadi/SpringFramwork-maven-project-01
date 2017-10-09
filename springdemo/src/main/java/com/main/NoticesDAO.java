package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Mahadi on 10/10/2017.
 */
@Component("noticesDAO")
public class NoticesDAO {

    private JdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc){
            this.jdbc = new JdbcTemplate(jdbc);
    }

    public List<Notice> getNotices(){
        return jdbc.query("SELECT * FROM notices", new RowMapper<Notice>(){

            public Notice mapRow(ResultSet resultSet, int i) throws SQLException {

                Notice notice = new Notice();
                notice.setId(resultSet.getInt("id"));
                notice.setName(resultSet.getString("name"));
                notice.setEmail(resultSet.getString("email"));
                notice.setText(resultSet.getString("texts"));
                return notice;
            }
        });
    }
}
