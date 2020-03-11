package com.jdialog;
import javax.swing.JDialog;
public class DialogDemo 
{
private static final boolean True = false;
JDialog obj;
public DialogDemo()
{
obj = new JDialog();
obj.setTitle("JDialog Demo");
obj.setVisible(True);
obj.setSize(300,150);
}
public static void main(String args[])
{
}
}
