package test;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

public class MailUtilsTest {
	/**
	 * ���Է�����ͨ�ʼ�
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	@Test
	public void fun() throws MessagingException, IOException {
		Session session = MailUtils.createSession("smtp.qq.com", "1724342055", "tmtraebsysrkcbca");//����session
		Mail mail = new Mail("1724342055@qq.com", "1724342055@qq.com", "����MailUtils", "�������ģ�");//����������󣬲����ֱ�Ϊ�������ˡ��ռ��ˡ����⡢����
		MailUtils.send(session, mail);// �����ʼ�
	}

}
