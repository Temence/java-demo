package test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import cn.itcast.jdbc.JdbcUtils;

/**
 * ����JdbcUtils��
 * @author qdmmy6
 *
 */
public class JdbcUtilsTest {
	/**
	 * ͨ��C3P0���ӳػ�ȡ���Ӷ���
	 * @throws SQLException
	 */
	@Test
	public void testGetConnection() throws SQLException {
		Connection con = JdbcUtils.getConnection();//��ȡ����
		System.out.println(con);
		JdbcUtils.releaseConnection(con);//�������con���ǵ�ǰ�̵߳����Ӷ�����ô�ر�֮
	}
	
	/**
	 * ����ʼ����󣬵���getConnection()��Ϊ��ǰ�̴߳���Connection�����Ҷ�ε���getConnection()���ص���ͬһ������
	 * @throws SQLException 
	 */
	@Test
	public void testTansaction() throws SQLException {
		JdbcUtils.beginTransaction();//��������
		Connection c1 = JdbcUtils.getConnection();//��һ�λ�ȡ��ǰ�̵߳��������Ӷ���
		Connection c2 = JdbcUtils.getConnection();//�ڶ��λ�ȡ��ǰ�̵߳��������Ӷ���
		Assert.assertEquals(true, c1 == c2);//�Ƚ������Ƿ���ͬ
		JdbcUtils.commitTransaction();//�ύ����
	}
}
