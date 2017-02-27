package menus.component;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyWindow {
	public static void main(String[] args) {
		
		System.out.println("hello");
	}
	
	public void createWindow(){
		JMenu jm = new JMenu("系统管理");
		JMenuItem item1=new JMenuItem("权限管理");
		JMenuItem item2=new JMenuItem("密码管理");
		JMenuItem item3=new JMenuItem("用户注册");
		JMenuItem item4=new JMenuItem("用户注销");
		jm.add(item1);
		jm.add(item2);
		jm.add(item3);
		jm.add(item4);
		JMenuBar jmb = new JMenuBar();
		
		jmb.add(jm);
		
	}
}
