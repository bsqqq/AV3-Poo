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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Window;
import java.awt.Label;
import java.awt.Font;
import java.awt.Checkbox;

public class TelaCadastrarCliente extends JFrame {

	/**
	 * 
	 */
	ClienteSerial cs;
	
	private JPanel contentPane;
	private TelaPrincipal telaIni;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarCliente frame = new TelaCadastrarCliente();
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
	public TelaCadastrarCliente() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600,400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textFieldNomeCliente = new TextField();
		textFieldNomeCliente.setBounds(33, 62, 219, 22);
		contentPane.add(textFieldNomeCliente);
		
		Label label = new Label("Nome do cliente:");
		label.setBounds(33, 39, 95, 22);
		contentPane.add(label);
		
		TextField textFieldCPF = new TextField();
		textFieldCPF.setBounds(33, 125, 219, 22);
		contentPane.add(textFieldCPF);
		
		Label label_1 = new Label("CPF:");
		label_1.setBounds(33, 102, 62, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Cadastro Do Cliente");
		label_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_2.setBounds(205, 10, 178, 22);
		contentPane.add(label_2);
		
		Checkbox checkbox_Sedan = new Checkbox("Sedan");
		checkbox_Sedan.setBounds(330, 120, 95, 22);
		contentPane.add(checkbox_Sedan);
		
		Checkbox checkbox_conversivel = new Checkbox("Conversivel");
		checkbox_conversivel.setBounds(330, 80, 95, 22);
		contentPane.add(checkbox_conversivel);
		
		Checkbox checkbox_Automatico = new Checkbox("Automatico");
		checkbox_Automatico.setBounds(330, 200, 95, 22);
		contentPane.add(checkbox_Automatico);
		
		Checkbox checkbox_BancoDeCouro = new Checkbox("Banco de couro");
		checkbox_BancoDeCouro.setBounds(330, 160, 111, 22);
		contentPane.add(checkbox_BancoDeCouro);
		
		Label label_3 = new Label("o que o cliente deseja no carro ?");
		label_3.setFont(new Font("Arial", Font.BOLD, 14));
		label_3.setBounds(309, 51, 246, 22);
		contentPane.add(label_3);
		
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
		
		Button buttonCadastrar = new Button("Cadastrar");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cs = new ClienteSerial(textFieldCPF.getText(), 
						textFieldNomeCliente.getText(), 
						checkbox_BancoDeCouro.getState(), 
						checkbox_conversivel.getState(), 
						checkbox_Sedan.getState(), 
						checkbox_Automatico.getState());
				FileOutputStream fluxo;
				try {
					fluxo = new FileOutputStream(cs.getNome() + ".cliente");
					ObjectOutputStream objarq = new ObjectOutputStream(fluxo);
					objarq.writeObject(cs);
					objarq.close();
					System.out.println("Cliente cadastrado");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
			}
		});
		buttonCadastrar.setBounds(484, 321, 90, 30);
		contentPane.add(buttonCadastrar);
	}
}
