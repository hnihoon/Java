package gui.day05;

import java.awt.*;
import java.awt.event.*;
public class MyTest extends Frame{
 Button but1;
 Button but2;
 Button but3;
 int i=0;
 TextField tf;
 public MyTest(){
  super("Lable and Button");
  but1 = new Button("1번");
  but2 = new Button("2번");
  but3 = new Button("3번");
  tf = new TextField(20);
  Panel pn1 = new Panel();
  Panel pn2 = new Panel();
  pn1.add(tf);
  pn2.add(but1);
  pn2.add(but2);
  pn2.add(but3);
  pn2.setLayout(new FlowLayout());
  this.add(pn1,"North");
  this.add(pn2,"South");
  pack();
  setVisible(true);
  this.but1.addActionListener(new ButListener(1));
  this.but2.addActionListener(new ButListener(2));
  this.but3.addActionListener(new ButListener(3));
 }
 public static void main(String[] args){
  MyTest bct = new MyTest();
 }
 class ButListener implements ActionListener{
  private int num = 0;
  public ButListener(int a){
   num = a;
  }
  public void actionPerformed(ActionEvent e){
   tf.setText(num+"번 눌렀써요!!");
  }
  
 }
}