package menus.component;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

public class HelloSwing {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;

	JPopupMenu jPopMenu;
	JFrame jFrame;
	JPanel jPanel;
	JToolBar jToolBar;

	public HelloSwing() {
		jFrame = new JFrame("主窗口");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar1 = new JMenuBar();
		jPanel = new JPanel();
		jFrame.setContentPane(jPanel);
		jFrame.setJMenuBar(menubar1);
		JMenu menu1 = new JMenu("系统管理");
		JMenu menu2 = new JMenu("成绩管理");
		JMenu menu3 = new JMenu("奖学金管理");
		menubar1.add(menu1);
		menubar1.add(menu2);
		menubar1.add(menu3);

		JMenuItem item1 = new JMenuItem("权限管理");
		JMenuItem item2 = new JMenuItem("密码管理");
		JMenuItem item3 = new JMenuItem("用户注册");
		JMenuItem item4 = new JMenuItem("用户注销");

		menu1.add(item1);
		menu1.addSeparator();
		menu1.add(item2);
		menu1.addSeparator();
		menu1.add(item3);
		menu1.addSeparator();
		menu1.add(item4);

		jToolBar = new JToolBar();

		BorderLayout bord = new BorderLayout();
		jPanel.setLayout(bord);
		jPanel.add("North", jToolBar);
		jFrame.setVisible(true);
		jFrame.setSize(WIDTH, HEIGHT);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jFrame.setLocation(x, y);

	}

	public static void main(String[] args) {
		new HelloSwing();
	}

}
