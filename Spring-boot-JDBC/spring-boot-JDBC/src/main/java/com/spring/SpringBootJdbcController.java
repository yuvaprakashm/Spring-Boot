package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/createTable")
	public String createTable() {
		jdbc.execute(
				"CREATE TABLE IF NOT EXISTS user (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255))");
		return "Table created successfully";
	}

	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("INSERT INTO user(name, email) VALUES ('javatpoint', 'java@javatpoint.com')");
		return "Data inserted successfully";
	}
}
