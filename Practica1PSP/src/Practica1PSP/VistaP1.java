package Practica1PSP;

import java.awt.Color;
import java.awt.TextArea;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class VistaP1 extends JFrame {

	private static final long serialVersionUID = 1L;
	JFrame frame;
	private JButton btNotepad;
	private JButton btPaint;
	private JButton btnReloj;
	private JTextField txtCmd;
	private TextArea txtAreaCmd;
	private JLabel lblCmd;
	private JButton btFinalizar;
	private JLabel lblExeProc;
	DefaultListModel<String> modeloLista = new DefaultListModel<String>();

	private JButton btExeCmd;
	private JList<String> listProc = new JList<String>();

	public VistaP1() {
		setBounds(100, 100, 429, 688);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(75, 172, 214));
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Práctica1PSP");

		btNotepad = new JButton("Bloc de Notas");
		btNotepad.setBounds(9, 11, 145, 48);
		btNotepad.setFont(new Font("Tahoma", Font.BOLD, 12));
		btNotepad.setBackground(Color.white);
		btNotepad.setForeground(new Color(0, 103, 147));
		getContentPane().add(btNotepad);

		btPaint = new JButton("Paint");
		btPaint.setBounds(9, 70, 145, 48);
		btPaint.setFont(new Font("Tahoma", Font.BOLD, 12));
		btPaint.setBackground(Color.white);
		btPaint.setForeground(new Color(0, 103, 147));
		getContentPane().add(btPaint);
		
		btnReloj = new JButton("Reloj");
		btnReloj.setBounds(9, 133, 145, 48);
		btnReloj.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReloj.setBackground(Color.white);
		btnReloj.setForeground(new Color(0, 103, 147));
		getContentPane().add(btnReloj);

		

		

		btFinalizar = new JButton("Finalizar Proceso");
		btFinalizar.setBounds(212, 245, 150, 25);
		btFinalizar.setEnabled(true);
		btFinalizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btFinalizar.setBackground(Color.white);
		btFinalizar.setForeground(Color.red);

		getContentPane().add(btFinalizar);

		lblExeProc = new JLabel("Procesos Activos");
		lblExeProc.setBounds(224, 0, 189, 31);
		lblExeProc.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblExeProc);

		txtCmd = new JTextField();
		txtCmd.setBounds(10, 318, 245, 20);
		getContentPane().add(txtCmd);
		txtCmd.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		txtCmd.setToolTipText("Introduzca un comando");
		txtCmd.setColumns(10);

		lblCmd = new JLabel("Línea de Comandos");
		lblCmd.setBounds(20, 290, 364, 31);
		lblCmd.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblCmd);

		txtAreaCmd = new TextArea();
		txtAreaCmd.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		txtAreaCmd.setForeground(Color.WHITE);
		txtAreaCmd.setBackground(Color.BLACK);
		txtAreaCmd.setBounds(0, 349, 414, 298);
		txtAreaCmd.setEditable(false);
		getContentPane().add(txtAreaCmd);

		listProc.setBounds(171, 26, 230, 213);
		listProc.setBorder(new LineBorder(Color.black));
		listProc.setModel(modeloLista);
		listProc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getContentPane().add(listProc);

		btExeCmd = new JButton("Ejecutar");
		btExeCmd.setBounds(265, 317, 149, 23);
		btExeCmd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btExeCmd.setBackground(Color.white);
		btExeCmd.setForeground(Color.red);
		getContentPane().add(btExeCmd);
	}

	public JButton getBtNotepad() {
		return btNotepad;
	}

	public JButton getBtPaint() {
		return btPaint;
	}


	public JButton getBtGestion() {
		return btnReloj;
	}

	public TextArea getTxtAreaCmd() {
		return txtAreaCmd;
	}

	public JLabel getLblCmd() {
		return lblCmd;
	}

	public JTextField getTxtCmd() {
		return txtCmd;
	}

	public JButton getBtFinalizar() {
		return btFinalizar;
	}

	public JLabel getLblExeProc() {
		return lblExeProc;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JList<String> getListProc() {
		return listProc;
	}

	public JButton getBtExeCmd() {
		return btExeCmd;
	}

	public DefaultListModel<String> getModeloLista() {
		return modeloLista;
	}
}