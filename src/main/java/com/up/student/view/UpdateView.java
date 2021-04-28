/**
 * 项目名：student
 * 修改历史：
 * 作者： MZ
 * 创建时间： 2016年1月7日-上午11:07:57
 */
package com.up.student.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.up.student.AppConstants;
import com.up.student.DAO;
import com.up.student.base.BaseDAO;
import com.up.student.dao.StudentDAO;
import com.up.student.model.Student;
import com.up.student.view.MainView;

/**
 * 模块说明： 更新学生信息
 * 
 */
public class UpdateView extends JFrame {

	private static final long serialVersionUID = 5292738820127102731L;

	private JPanel jPanelCenter, jPanelSouth;
	private JButton searchButton, exitButton;
	private JTextField name, sno, department, hometown, mark, email, tel, sex;

	public UpdateView() {
		init();
	}

	private void init() {
		setTitle(AppConstants.SEARCHVIEW_TITLE);
		// center panel
		jPanelCenter = new JPanel();
		jPanelCenter.setLayout(new GridLayout(9, 1));
		jPanelCenter.add(new JLabel("----------------------------사용설명서----------------------------"));
		//name = new JTextField();
		//jPanelCenter.add(name);
		jPanelCenter.add(new JLabel("1. 메인 화면의 좌상단 빈칸을 통해 학생의 이름을 입력시 관련 학생의 정보가 제공됩니다."));
		//sno = new JTextField();
		//jPanelCenter.add(sno);
		jPanelCenter.add(new JLabel("검색 관련 예시 : 민 검색 -> 민 이라는 글자를 포함한 학생의 이름 모두 표시"));
		//sex = new JTextField();
		//jPanelCenter.add(sex);
		jPanelCenter.add(new JLabel("하지만 빈칸, null, 데이터에 저장되지 않은 이름의 글자가 입력 될 경우 경고창이 표출됩니다."));
		//department = new JTextField();
		//jPanelCenter.add(department);
		jPanelCenter.add(new JLabel("2. 학색 추가 : 학생의 이름, 학번, 성별, 전공, 주소, 학점, 이메일, 전화번호를 기입합니다."));
		//hometown = new JTextField();
		//jPanelCenter.add(hometown);
		jPanelCenter.add(new JLabel("3. 학생 삭제 : 학생의 이름과 학번 입력시, 그에 해당하는 학생의 정보가 삭제 됩니다."));
		//mark = new JTextField();
		//jPanelCenter.add(mark);
		jPanelCenter.add(new JLabel("4. 하단의 페이지 넘김 버튼을 통해 한 페이지 혹 맨 끝으로 이동하기의 기능이 제공됩니다."));
		//email = new JTextField();
		//jPanelCenter.add(email);
		jPanelCenter.add(new JLabel("---------------------------------------------------------------"));
		//tel = new JTextField();
		//jPanelCenter.add(tel);
		/*jPanelCenter.add(new JLabel("-------------------------------------------------"));
		jPanelCenter.add(new JLabel("-------------------------------------------------"));*/

		// south panel
		jPanelSouth = new JPanel();
		/*jPanelSouth.setLayout(new GridLayout(1, 2));
		searchButton = new JButton(AppConstants.SEARCHVIEW_SEARCHBUTTON);
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (check()) {
					Student stu = new Student();
					buildStudent(stu);
					boolean isSuccess = ((StudentDAO) BaseDAO.getAbilityDAO(DAO.StudentDAO)).update(stu);
					if (isSuccess) {
						setEmpty();
						if (MainView.currPageNum < 0 || MainView.currPageNum > 99) {
							MainView.currPageNum = 1;
						}
						String[][] result = ((StudentDAO) BaseDAO.getAbilityDAO(DAO.StudentDAO))
								.list(MainView.currPageNum);
						MainView.initJTable(MainView.jTable, result);
					}
				}
			}
		});
		jPanelSouth.add(searchButton);*/
		exitButton = new JButton(AppConstants.EXITBUTTON);
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		jPanelSouth.add(exitButton);

		this.add(jPanelCenter, BorderLayout.CENTER);
		this.add(jPanelSouth, BorderLayout.SOUTH);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(470, 200, 510, 270);
		setResizable(false);
		setVisible(true);
	}

	/*private boolean check() {
		boolean result = false;
		if ("".equals(name.getText()) || "".equals(sno.getText()) || "".equals(department.getText())
				|| "".equals(sex.getText()) || "".equals(mark.getText()) || "".equals(tel.getText())
				|| "".equals(email.getText()) || "".equals(hometown.getText())) {
			return result;
		} else {
			result = true;
		}
		return result;
	}

	private void buildStudent(Student stu) {
		stu.setDepartment(department.getText());
		stu.setEmail(email.getText());
		stu.setHomeTown(hometown.getText());
		stu.setMark(mark.getText());
		stu.setName(name.getText());
		stu.setSno(sno.getText());
		stu.setTel(tel.getText());
		stu.setSex(sex.getText());
	}

	private void setEmpty() {
		name.setText("");
		sno.setText("");
		department.setText("");
		sex.setText("");
		email.setText("");
		hometown.setText("");
		tel.setText("");
		mark.setText("");
	}*/
	
}
