package interfaceGrafica;

import java.awt.EventQueue;
import java.awt.GridLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.FlowLayout;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		TelaCadastrarCliente telaCadCli = new TelaCadastrarCliente();
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaCadCli.setLocationRelativeTo(null);
				frame.setVisible(false);
				telaCadCli.setVisible(true);
				
			}
		});
		btnCadastrarCliente.setBounds(200, 60, 200, 40);
		frame.getContentPane().add(btnCadastrarCliente);
		
		TelaCadastrarCarro telaCadCar = new TelaCadastrarCarro();
		JButton btnCadastrarCarro = new JButton("Cadastrar Carro");
		btnCadastrarCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaCadCar.setLocationRelativeTo(null);
				frame.setVisible(false);
				telaCadCar.setVisible(true);
				
			}
		});
		btnCadastrarCarro.setBounds(200, 120, 200, 40);
		frame.getContentPane().add(btnCadastrarCarro);
		
		TelaVisualizarCarro telaVizCar = new TelaVisualizarCarro();
		JButton btnVisualizarCarros = new JButton("Visualizar Carros");
		btnVisualizarCarros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaVizCar.setLocationRelativeTo(null);
				frame.setVisible(false);
				telaVizCar.setVisible(true);
			}
		});
		btnVisualizarCarros.setBounds(200, 180, 200, 40);
		frame.getContentPane().add(btnVisualizarCarros);
		
		TelaVisualizarCliente telaVizCli = new TelaVisualizarCliente();
		JButton btnVisualizarClientes = new JButton("Visualizar Clientes");
		btnVisualizarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaVizCli.setLocationRelativeTo(null);
				frame.setVisible(false);
				telaVizCli.setVisible(true);
			}
		});
		btnVisualizarClientes.setBounds(200, 240, 200, 40);
		frame.getContentPane().add(btnVisualizarClientes);
		
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}

	public void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		frame.setLocationRelativeTo(null);
		
	}

	
}

