package cn.itcast.mail;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

public class MailUtilsTest {
	/**
	 * ���Է�����ͨ�ʼ�
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	@Test
	public void fun() throws MessagingException, IOException {
		Session session = MailUtils.createSession("smtp.163.com", "itcast_cxf", "itcastitcast");//����session
		Mail mail = new Mail("1724342055@qq.com", "itcast_cxf@126.com", "����MailUtils", "�������ģ�");//����������󣬲����ֱ�Ϊ�������ˡ��ռ��ˡ����⡢����
		MailUtils.send(session, mail);// �����ʼ�
	}

}
