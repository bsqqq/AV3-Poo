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

public class TelaVisualizarCarro extends JFrame {

	/**
	 * 
	 */
	
	VeiculoSerial vs;
	FileInputStream fluxo;
	private JPanel contentPane;
	private TelaPrincipal telaIni;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizarCarro frame = new TelaVisualizarCarro();
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
	public TelaVisualizarCarro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(600,400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textFieldModeloCarro = new TextField();
		textFieldModeloCarro.setBounds(33, 62, 219, 22);
		contentPane.add(textFieldModeloCarro);
		
		Label label = new Label("Insira o Modelo do Carro Para Abri-l\u00F3");
		label.setBounds(33, 39, 219, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Marca do Carro:");
		label_1.setBounds(33, 140, 90, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Visualiza\u00E7\u00E3o Do Carro");
		label_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_2.setBounds(197, 10, 205, 22);
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
		
		
		Label labelAnoDoCarroEdit = new Label("");
		labelAnoDoCarroEdit.setBackground(Color.LIGHT_GRAY);
		labelAnoDoCarroEdit.setBounds(129, 180, 123, 22);
		contentPane.add(labelAnoDoCarroEdit);
		
		Label label_1_1_1 = new Label("Ano do Carro:");
		label_1_1_1.setBounds(33, 180, 90, 22);
		contentPane.add(label_1_1_1);
		
		Label labelMarcaEdit = new Label("");
		labelMarcaEdit.setBackground(Color.LIGHT_GRAY);
		labelMarcaEdit.setBounds(129, 140, 123, 22);
		contentPane.add(labelMarcaEdit);
		
		Label label_1_1 = new Label("Modelo do Carro:");
		label_1_1.setBounds(33, 100, 90, 22);
		contentPane.add(label_1_1);
		
		Label labelModeloEdit = new Label("");
		labelModeloEdit.setBackground(Color.LIGHT_GRAY);
		labelModeloEdit.setBounds(129, 100, 123, 22);
		contentPane.add(labelModeloEdit);
		labelModeloEdit.setVisible(true);
		
		Label labelConversivelEdit = new Label("");
		labelConversivelEdit.setBackground(Color.LIGHT_GRAY);
		labelConversivelEdit.setBounds(425, 60, 123, 22);
		contentPane.add(labelConversivelEdit);
		
		Label label_1_1_2 = new Label("Conversivel:");
		label_1_1_2.setBounds(329, 60, 90, 22);
		contentPane.add(label_1_1_2);
		
		Label label_1_2 = new Label("Sedan:");
		label_1_2.setBounds(329, 100, 90, 22);
		contentPane.add(label_1_2);
		
		Label labelSedanEdit = new Label("");
		labelSedanEdit.setBackground(Color.LIGHT_GRAY);
		labelSedanEdit.setBounds(425, 100, 123, 22);
		contentPane.add(labelSedanEdit);
		
		Label labelBancoDeCouroEdit = new Label("");
		labelBancoDeCouroEdit.setBackground(Color.LIGHT_GRAY);
		labelBancoDeCouroEdit.setBounds(425, 140, 123, 22);
		contentPane.add(labelBancoDeCouroEdit);
		
		Label label_1_1_1_1 = new Label("Banco de Couro: ");
		label_1_1_1_1.setBounds(329, 140, 90, 22);
		contentPane.add(label_1_1_1_1);
		
		Label label_1_1_1_1_1 = new Label("Automatico:");
		label_1_1_1_1_1.setBounds(329, 180, 90, 22);
		contentPane.add(label_1_1_1_1_1);
		
		Label labelAutomaticoEdit = new Label("");
		labelAutomaticoEdit.setBackground(Color.LIGHT_GRAY);
		labelAutomaticoEdit.setBounds(425, 180, 123, 22);
		contentPane.add(labelAutomaticoEdit);
		
		Button buttonBuscar = new Button("Buscar");
		buttonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					fluxo = new FileInputStream(textFieldModeloCarro.getText() + ".txt");
					ObjectInputStream abjarq = new ObjectInputStream(fluxo);
					vs = (VeiculoSerial) abjarq.readObject();
					labelAnoDoCarroEdit.setText(vs.getAnoDoCarro());
					labelMarcaEdit.setText(vs.getMarcaDoCarro());
					labelModeloEdit.setText(vs.getModeloDoCarro());
					labelSedanEdit.setText(vs.isSedan());
					labelAutomaticoEdit.setText(vs.isAuto());
					labelConversivelEdit.setText(vs.isConversivel());
					labelBancoDeCouroEdit.setText(vs.isBancoDeCouro());
					System.out.println(vs.getMarcaDoCarro() + " " + vs.getModeloDoCarro());
					abjarq.close();
					System.out.println("Objeto lido \n" + vs);
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
