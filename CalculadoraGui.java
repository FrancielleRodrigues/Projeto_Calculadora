package br.faesa.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class CalculadoraGui implements ActionListener{
	CalculadoraOp cal = new CalculadoraOp();
	String mostraE;
	private JFrame frmCalculadora;
	private JTextField textField;
	private JPanel panel_Excluir;
	private JButton btn_Excluir;
	private JPanel panel_Teclado;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_div;
	private JButton btn_4;
	private JButton btn5;
	private JButton btn_6;
	private JButton btn_X;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_menos;
	private JButton btn_ponto;
	private JButton btn_0;
	private JButton btn_igual;
	private JButton btn_mais;
	private JButton btn_raiz;
	private JButton btn_logaritimo;
	private JButton btn_potenciacao;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGui window = new CalculadoraGui();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setSize(new Dimension(468, 383));
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		frmCalculadora.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(11, 5, 375, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		panel_Excluir = new JPanel();
		panel_Excluir.setBackground(new Color(176, 196, 222));
		panel_Excluir.setBounds(11, 50, 431, 34);
		panel.add(panel_Excluir);
		panel_Excluir.setLayout(null);
		
		btn_Excluir = new JButton("Excluir");
		btn_Excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_Excluir.setBounds(236, 0, 129, 34);
		panel_Excluir.add(btn_Excluir);
		
		panel_Teclado = new JPanel();
		panel_Teclado.setBackground(new Color(176, 196, 222));
		panel_Teclado.setBounds(10, 90, 436, 242);
		panel.add(panel_Teclado);
		panel_Teclado.setLayout(new GridLayout(4, 4, 2, 2));
		
		btn_7 = new JButton("7");
		panel_Teclado.add(btn_7);
		
		btn_8 = new JButton("8");
		panel_Teclado.add(btn_8);
		
		btn_9 = new JButton("9");
		panel_Teclado.add(btn_9);
		
		btn_div = new JButton("/");
		panel_Teclado.add(btn_div);
		
		JButton button = new JButton("(");
		panel_Teclado.add(button);
		
		JButton button_1 = new JButton(")");
		panel_Teclado.add(button_1);
		
		btn_4 = new JButton("4");
		panel_Teclado.add(btn_4);
		
		btn_6 = new JButton("6");
		panel_Teclado.add(btn_6);
		
		btn5 = new JButton("5");
		panel_Teclado.add(btn5);
		
		btn_X = new JButton("*");
		panel_Teclado.add(btn_X);
		
		JButton btn_negacao = new JButton("~");
		panel_Teclado.add(btn_negacao);
		
		btn_1 = new JButton("1");
		panel_Teclado.add(btn_1);
		
		btn_2 = new JButton("2");
		panel_Teclado.add(btn_2);
		
		btn_3 = new JButton("3");
		panel_Teclado.add(btn_3);
		
		btn_mais = new JButton("+");
		panel_Teclado.add(btn_mais);
		
		btn_ponto = new JButton(".");
		panel_Teclado.add(btn_ponto);
		
		btn_igual = new JButton("=");
		panel_Teclado.add(btn_igual);
		
		btn_menos = new JButton("-");
		panel_Teclado.add(btn_menos);
		
		btn_menos = new JButton("-");
		panel_Teclado.add(btn_menos);
		
		
		
		btn_logaritimo = new JButton("log");
		panel_Teclado.add(btn_logaritimo);
		
		btn_0 = new JButton("0");
		panel_Teclado.add(btn_0);
		
		
		btn_potenciacao = new JButton("^");
		panel_Teclado.add(btn_potenciacao);
		
		
		
		btn_raiz = new JButton("V");
		btn_raiz.setIcon(new ImageIcon(CalculadoraGui.class.getResource("/br/faesa/gui/Imagem2.png")));
		panel_Teclado.add(btn_raiz);
		
		
		
		for (Component c : this.panel_Teclado.getComponents()) {
			((JButton)c).addActionListener(this);
			//((JButton)c).setBackground(Color.lightGray);
			((JButton)c).setFont(new Font("Calibri", Font.PLAIN, 24));
		}
		for (Component c : this.panel_Excluir.getComponents()) {
			((JButton)c).addActionListener(this);
			//((JButton)c).setBackground(Color.lightGray);
			((JButton)c).setFont(new Font("Calibri", Font.PLAIN, 24));
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String key = ((JButton)e.getSource()).getText().toString();
		double result;
		switch (key) {
		
		case "Excluir":
			textField.setText(" ");
			System.out.println("Botao excluir");
			StringBuffer oper = new StringBuffer(" ");
			CalculadoraOp.setResultado(null);
			
			CalculadoraOp.setExpressao(oper);
			
			break;
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			System.out.println("-------------------------");
				CalculadoraOp.setDigito(key);
			
			
			CalculadoraOp.coletaOperando();
			System.out.println("Digito: "+CalculadoraOp.getDigito());
			System.out.println("Operando: "+CalculadoraOp.getOperando());
			System.out.println("Expressao: "+CalculadoraOp.getExpressao());
			System.out.println("-------------------------");
			textField.setText(CalculadoraOp.getOperando().toString());
			
			textField.setText(CalculadoraOp.getExpressao().toString());
			

			break;
		case "+":
		case "-":
		case "*":
		case "/":
		case ".":
		case "^":
		case "V":
			System.out.println("-------------------------");
			CalculadoraOp.setOperacao(key);
			CalculadoraOp.montaExpressao();
			System.out.println("Expressao: "+CalculadoraOp.getExpressao());
			System.out.println("-------------------------");
			
			textField.setText(CalculadoraOp.getExpressao().toString());
			CalculadoraOp.efetuaCalculo();
			textField.setText(CalculadoraOp.getOperando().toString());
			textField.setText(CalculadoraOp.getResultado().toString());
		
			
			break;
		/*case "log":
			System.out.println("------------------------");
			CalculadoraOp.setOperacao(key);
			CalculadoraOp.montaExpressao();
			System.out.println("Expressao: "+CalculadoraOp.getExpressao());
			System.out.println("-------------------------");
			textField.setText(CalculadoraOp.getExpressao().toString());
		
			
			break;*/
		case "=":
			System.out.println("-------------------------");
			CalculadoraOp.efetuaCalculo();
			System.out.println(CalculadoraOp.getExpressao());
			System.out.println("Digito: "+CalculadoraOp.getDigito());
			System.out.println("Operando: "+CalculadoraOp.getOperando());
			System.out.println("-------------------------");
			textField.setText(CalculadoraOp.getResultado().toString());
			
			break;
		
		default:
			break;
		}
			
		}
		public String montaExpressao(String p){
			
			
			
			
			
			return mostraE;
			
		}
		
	}


