import java.io.File;

import cn.itcast.txz.ui.MainFrame;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

//ִ�г����õ������
public class App {
	public static void main(String[] args){
		File f1 = new File("D:\\MyDownloads\\Desktop\\11\\���°�--��С�׻ؼ�\\music\\background.mp3");//��������
		File f2 = new File("D:\\MyDownloads\\Desktop\\11\\���°�--��С�׻ؼ�\\music\\begin.mp3");//�������
		File f3 = new File("D:\\MyDownloads\\Desktop\\11\\���°�--��С�׻ؼ�\\music\\merge.mp3");//��ײ����
		File f4 = new File("D:\\MyDownloads\\Desktop\\11\\���°�--��С�׻ؼ�\\music\\finish.mp3");//��Ϸ��ʼ����
		
		Media _media1 = new Media(f1.toURI().toString());
		Media _media2 = new Media(f2.toURI().toString());
		Media _media3 = new Media(f3.toURI().toString());
		Media _media4 = new Media(f4.toURI().toString());

		// ��������һ�У�����Ҫ��MediaPlayer����֮ǰw
		final JFXPanel fxPanel = new JFXPanel();
		MediaPlayer _mediaPlayer1 = new MediaPlayer(_media1);
		MediaPlayer _mediaPlayer2 = new MediaPlayer(_media2);
		MediaPlayer _mediaPlayer3 = new MediaPlayer(_media3);
		MediaPlayer _mediaPlayer4 = new MediaPlayer(_media4);

		
		_mediaPlayer1.play();
		//alt+/
		new MainFrame();
	}

}
