
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class test1 {
	public static void main(String args[]) {
		MainFramesss mf2 = new MainFramesss();
		mf2.setVisible(true);
	}
}

class MainFramesss extends JFrame {
	private JButton buttons[] = new JButton[56];// �إ�JButton
	private static TextArea ta = new TextArea();

	private String numbers[] = new String[56];// ��ܦr
	FlowLayout flow = new FlowLayout();// �ƪ�
	GridLayout grid12 = new GridLayout(2, 2);// �ƪ�
	GridLayout grid33 = new GridLayout(8, 2, 5, 5);// �ƪ�

	public MainFramesss() {
		initComp();
	}

	private void initComp() {
		this.setLayout(grid12);
		this.setSize(1100, 900);// �����j�p
		ta.setSize(800, 400);// TextArea�j�p
		JPanel p1 = new JPanel(grid33); // ��@ panel 1
		int j = 35;
		while (j < 90) {
			for (int i = 0; i < 56; i++) {
				String a = new Character((char) j).toString();
				numbers[i] = String.valueOf(a);
				j++;
			}
		} // ��ACSII�X�ഫ��Char
		for (int i = 0; i < 56; i++) {
			buttons[i] = new JButton(numbers[i]); // create buttons
			p1.add(buttons[i], grid33); // �b panel 1���[�J���s�}�C
		}
		this.add(p1); // �b����myfrm ���[�J panel 1
		JPanel p2 = new JPanel(flow); // ��@ panel 2
		JButton btn1 = new JButton("Random");
		JButton btn2 = new JButton("clear");// �إ߫��s���� btn1
		for (int i = 0; i < 56; i++) {

		}

		btn1.setFont(new Font("�з���", Font.BOLD, 32));// �]�w���s�r��
		btn2.setFont(new Font("�з���", Font.BOLD, 32));// �]�w���s�r��
		p2.setFont(new Font("�з���", Font.BOLD, 25));// �]�w���s�r��
		btn1.setBackground(new Color(255, 225, 0));// �]�w���s�C��
		btn2.setBackground(new Color(255, 225, 0));// �]�w���s�C��
		p1.setBackground(new Color(0, 0, 0));
		p2.setBackground(new Color(0, 0, 0));
		ta.setBackground(new Color(176, 196, 222));
		p2.add(btn1); // �b panel 2���[�J���s
		p2.add(btn2);
		p2.add(ta);
		this.add(p2); // �b����myfrm ���[�J panel 2
		for (int i = 0; i < 56; i++) {
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					int i = 0;
					if (i < 56) {
						String w = ((AbstractButton) ae.getSource()).getText();
						switch (w) {
						case "#":
							ta.append(" # ");
							break;
						case "$":
							ta.append(" $ ");
							break;
						case "%":
							ta.append(" % ");
							break;
						case "&":
							ta.append(" & ");
							break;
						case "'":
							ta.append(" ' ");
							break;
						case "(":
							ta.append(" ( ");
							break;
						case ")":
							ta.append(" ) ");
							break;
						case "*":
							ta.append(" * ");
							break;
						case "+":
							ta.append(" + ");
							break;
						case ",":
							ta.append(" , ");
							break;
						case "-":
							ta.append(" - ");
							break;
						case ".":
							ta.append(" . ");
							break;
						case "/":
							ta.append(" / ");
							break;
						case "0":
							ta.append(" 0 ");
							break;
						case "1":
							ta.append(" 1 ");
							break;
						case "2":
							ta.append(" 2 ");
							break;
						case "3":
							ta.append(" 3 ");
							break;
						case "4":
							ta.append(" 4 ");
							break;
						case "5":
							ta.append(" 5 ");
							break;
						case "6":
							ta.append(" 6 ");
							break;
						case "7":
							ta.append(" 7 ");
							break;
						case "8":
							ta.append(" 8 ");
							break;
						case "9":
							ta.append(" 9 ");
							break;
						case ":":
							ta.append(" : ");
							break;
						case ";":
							ta.append(" ; ");
							break;
						case "<":
							ta.append(" < ");
							break;
						case "=":
							ta.append(" = ");
							break;
						case ">":
							ta.append(" > ");
							break;
						case "?":
							ta.append(" ? ");
							break;
						case "@":
							ta.append(" @ ");
							break;
						case "A":
							ta.append(" A ");
							break;
						case "B":
							ta.append(" B ");
							break;
						case "C":
							ta.append(" C ");
							break;
						case "D":
							ta.append(" D ");
							break;
						case "E":
							ta.append(" E ");
							break;
						case "F":
							ta.append(" F ");
							break;
						case "G":
							ta.append(" G ");
							break;
						case "H":
							ta.append(" H ");
							break;
						case "I":
							ta.append(" I ");
							break;
						case "J":
							ta.append(" J ");
							break;
						case "K":
							ta.append(" K ");
							break;
						case "L":
							ta.append(" L ");
							break;
						case "M":
							ta.append(" M ");
							break;
						case "N":
							ta.append(" N ");
							break;
						case "O":
							ta.append(" O ");
							break;
						case "P":
							ta.append(" P ");
							break;
						case "Q":
							ta.append(" Q ");
							break;
						case "R":
							ta.append(" R ");
							break;
						case "S":
							ta.append(" S ");
							break;
						case "T":
							ta.append(" T ");
							break;
						case "U":
							ta.append(" U ");
							break;
						case "V":
							ta.append(" V ");
							break;
						case "W":
							ta.append(" W ");
							break;
						case "X":
							ta.append(" X ");
							break;
						case "Y":
							ta.append(" Y ");
							break;
						case "Z":
							ta.append(" Z ");
							break;
						}// �[�J���s��ť��
						btn2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								ta.setText("");
							}
						});// �[�JClear��ť��

					}
				}
			});
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					String stringValue;
					int i;
					int ran;
					String numbers[] = new String[56];
					String j;
					int b = 35;
					while (b < 90) {
						for (i = 0; i < 56; i++) {

							numbers[i] = String.valueOf(b);
							b++;
						}
					}
					// �W���j��O���F�bnumbers[ ] �̭���i0~56���Ʀr
					for (i = 0; i < 56; i++) {
						ran = (int) (Math.random() * (56 - i)); // ���Ͷü�
						buttons[i].setLabel(numbers[ran]); // �ھڶüơA��buttons[
															// ]��Label
						j = numbers[ran];
						numbers[ran] = numbers[56 - i - 1];
						numbers[56 - i - 1] = j;
						String la = buttons[i].getLabel();
						int s = Integer.parseInt(la);
						String c = new Character((char) s).toString();
						buttons[i].setLabel(c);
					}
				}
			});
		}
	}
}