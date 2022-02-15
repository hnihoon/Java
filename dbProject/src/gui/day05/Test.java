package gui.day05;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

	public class Test extends JFrame implements ActionListener{
		JButton bt1,bt2;
		JPanel p1;
		
		public Test() {
			homeframe();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		}
		
		public void homeframe() {
			p1 = new JPanel();
			bt1 = new JButton();
			bt1.setBounds(20,40,350,220);
			bt2 = new JButton();
			bt2.setBounds(20,300,350,220);
			bt1.setText("매 장");
			bt2.setText("포 장");
			bt1.setFont(new Font("Aharoni",Font.ITALIC,125));
			bt2.setFont(new Font("Aharoni",Font.ITALIC,125));
			p1.add(bt1);
			p1.add(bt2);
			add(p1);
			
			Dimension frameSize = getSize();
			
			Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((windowSize.width - frameSize.width) /2,
					(windowSize.height - frameSize.height) /2);
			setVisible(true);
			
			bt1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Part1();
					setVisible(false);
				}
			});
			bt2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Part1();
					setVisible(false);
				}
			});
			
			bt1.addActionListener(this);
			bt2.addActionListener(this);
			
			
			
			setTitle("coffee");//타이틀
			setSize(400,600);//프레임의 크기
			setResizable(false);//창의 크기를 변경하지 못하게
			setLocationRelativeTo(null);//창이 가운데 나오게
			setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
			setVisible(true);//창이 보이게	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		}
		
		public class Part1 extends  JFrame{
		    Part1(){
		        super("coffee"); //타이틀
		        JPanel jPanel = new JPanel();

		        setSize(800, 900);

		        add(jPanel);

		        Dimension frameSize = getSize();
		        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		        setLocation((windowSize.width - frameSize.width) / 2,
		                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		        setVisible(true);
		    }
		}
		
		public static void main(String[] args){
			new Test();
		}
	}