package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Window;
import java.awt.Label;
import java.awt.Font;
import java.awt.Checkbox;
import javax.swing.JLabel;
import java.awt.Color;

public class TelaVisualizarCliente extends JFrame {

	/**
	 * 
	 */
	
	ClienteSerial cs;
	FileInputStream fluxo;
	String NomeDoClient, CPFdoClient;
	private JPanel contentPane;
	private TelaPrincipal telaIni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ClienteSerial cs;
		FileInputStream fluxo;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizarCliente frame = new TelaVisualizarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVisualizarCliente() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600,400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textFieldNomeDoCliente = new TextField();
		textFieldNomeDoCliente.setBounds(33, 62, 219, 22);
		contentPane.add(textFieldNomeDoCliente);
		
		
		
		Label label = new Label("Insira o Nome do cliente Para Abri-l\u00F3");
		label.setBounds(33, 39, 219, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("CPF do Cliente:");
		label_1.setBounds(33, 180, 90, 22);
		
		contentPane.add(label_1);
		
		
		Label label_2 = new Label("Visualiza\u00E7\u00E3o Do Cliente");
		label_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_2.setBounds(197, 10, 222, 22);
		contentPane.add(label_2);
		
		Button buttonVoltar = new Button("Voltar");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaIni = new TelaPrincipal();
				telaIni.setLocationRelativeTo(null);
				setVisible(false);
				telaIni.setVisible(true);
				
				
			}
		});
		buttonVoltar.setBounds(10, 321, 90, 30);
		contentPane.add(buttonVoltar);
		
		Label labelCpfEdit = new Label("");
		labelCpfEdit.setBackground(Color.LIGHT_GRAY);
		labelCpfEdit.setBounds(33, 210, 123, 22);
		contentPane.add(labelCpfEdit);
		labelCpfEdit.setText(CPFdoClient);
		
		Label label_1_1 = new Label("Nome do Cliente:");
		label_1_1.setBounds(33, 100, 100, 22);
		contentPane.add(label_1_1);
		
		Label labelNomeDoCliEdit = new Label("");
		labelNomeDoCliEdit.setBackground(Color.LIGHT_GRAY);
		labelNomeDoCliEdit.setBounds(33, 130, 123, 22);
		contentPane.add(labelNomeDoCliEdit);
		labelNomeDoCliEdit.setText(NomeDoClient);
		
		Label labelConversivelEdit = new Label("");
		labelConversivelEdit.setBackground(Color.LIGHT_GRAY);
		labelConversivelEdit.setBounds(425, 100, 123, 22);
		contentPane.add(labelConversivelEdit);
		
		Label label_1_1_2 = new Label("Conversivel:");
		label_1_1_2.setBounds(329, 100, 90, 22);
		contentPane.add(label_1_1_2);
		
		Label label_1_2 = new Label("Sedan:");
		label_1_2.setBounds(329, 140, 90, 22);
		contentPane.add(label_1_2);
		
		Label labelSedanEdit = new Label("");
		labelSedanEdit.setBackground(Color.LIGHT_GRAY);
		labelSedanEdit.setBounds(425, 140, 123, 22);
		contentPane.add(labelSedanEdit);
		
		Label labelBancoDeCouroEdit = new Label("");
		labelBancoDeCouroEdit.setBackground(Color.LIGHT_GRAY);
		labelBancoDeCouroEdit.setBounds(425, 180, 123, 22);
		contentPane.add(labelBancoDeCouroEdit);
		
		Label label_1_1_1_1 = new Label("Banco de Couro: ");
		label_1_1_1_1.setBounds(329, 180, 90, 22);
		contentPane.add(label_1_1_1_1);
		
		Label label_1_1_1_1_1 = new Label("Automatico:");
		label_1_1_1_1_1.setBounds(329, 220, 90, 22);
		contentPane.add(label_1_1_1_1_1);
		
		Label labelAutomaticoEdit = new Label("");
		labelAutomaticoEdit.setBackground(Color.LIGHT_GRAY);
		labelAutomaticoEdit.setBounds(425, 220, 123, 22);
		contentPane.add(labelAutomaticoEdit);
		
		JLabel lblNewLabel = new JLabel("Que tipo de carro o cliente deseja:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(296, 62, 251, 22);
		contentPane.add(lblNewLabel);
		
		Button buttonBuscar = new Button("Buscar");
		buttonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					fluxo = new FileInputStream(textFieldNomeDoCliente.getText() + ".txt");
					ObjectInputStream abjarq = new ObjectInputStream(fluxo);
					cs = (ClienteSerial) abjarq.readObject();
					NomeDoClient = cs.getNome();
					CPFdoClient = cs.getCpf();
					labelCpfEdit.setText(CPFdoClient);
					labelNomeDoCliEdit.setText(NomeDoClient);
					labelSedanEdit.setText(cs.isSedan());
					labelAutomaticoEdit.setText(cs.isAuto());
					labelConversivelEdit.setText(cs.isConversivel());
					labelBancoDeCouroEdit.setText(cs.isBancoDeCouro());
					abjarq.close();
					System.out.println("Objeto lido \n " + cs);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		});
		buttonBuscar.setBounds(484, 321, 90, 30);
		contentPane.add(buttonBuscar);
		
	}
}
