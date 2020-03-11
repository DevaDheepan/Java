package com.checkbox;
import javax.swing.JCheckBox;
import javax.swing,JFrame;
import javax.swing.JPanel;
public class CheckBoxDemo extends JFrame
{
JPanel jp;
JCheckBox h1,h2,h3;
public checkBoxDemo()
{
jp = new JPanel();
h1 = new JCheckBox("Music");
h2 = new JCheckBox("Sports");
h3 = new JCheckBox("Painting");
jp.add(h1);
jp.add(h2);
jp.add(h3);
setTitle("JCheckBox Demo");
setVisible(True);
setSize(300,200);
add(jp);
}
public static void main(String[] args)
{
CheckBoxDemo cobj = new CheckBoxDemo();
}
}
