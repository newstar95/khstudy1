package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.GoodsDto;
import jdbc.util.JdbcUtils;

public class GoodsDao {

public void insert(GoodsDto dto) {

String sql = "insert into goods(no, name, type, price, made, expire) values(goods_seq.nextval, ?, ?, ?, sysdate, sysdate+30)";
Object[] data = {dto.getNo(), dto.getName(), dto.getType(), dto.getPrice(), dto.getMade(), dto.getExpire() };
JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
jdbcTemplate.update(sql,data);

	}

}

 