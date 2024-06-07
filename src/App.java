import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;

import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class App implements ActionListener {

	private JFrame frmCalculadoraDeAngulos;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		FlatDarkLaf.setup();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmCalculadoraDeAngulos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {

		frmCalculadoraDeAngulos = new JFrame();
		frmCalculadoraDeAngulos.setResizable(false);
		frmCalculadoraDeAngulos.setTitle("Calculadora de Angulos");
		frmCalculadoraDeAngulos.setBounds(100, 100, 350, 400);
		frmCalculadoraDeAngulos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmCalculadoraDeAngulos.getContentPane().add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setColumns(20);
		panel.add(textField);
		textField.setFont(new Font("DejaVu Sans", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panelBotones = new JPanel();
		frmCalculadoraDeAngulos.getContentPane().add(panelBotones, BorderLayout.CENTER);
		panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panelBotones.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton btnUno = new JButton("1");
//		btnUno.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				textField.setText(textField.getText() + " " + btnUno.getText() + " ");
//			}
//		});
		btnUno.addActionListener(e -> {
			accionesBotones(btnUno.getText());
		});
		btnUno.setFont(new Font("Loma", Font.BOLD, 18));
		btnUno.setFocusable(false);
		panelBotones.add(btnUno);
		
		JButton btnDos = new JButton("2");
		btnDos.addActionListener(e -> {
			accionesBotones(btnDos.getText());
		});
		btnDos.setFont(new Font("Loma", Font.BOLD, 18));
		btnDos.setFocusable(false);
		panelBotones.add(btnDos);
		
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(e -> {
			accionesBotones(btnTres.getText());
		});
		btnTres.setFocusable(false);
		btnTres.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnTres);
		
		JButton btnMas = new JButton("+");
		btnMas.addActionListener(e -> {
			accionesBotones(btnMas.getText());
		});
		btnMas.setFocusable(false);
		btnMas.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnMas);
		
		JButton btnCuatro = new JButton("4");
		btnCuatro.addActionListener(e -> {
			accionesBotones(btnCuatro.getText());
		});
		btnCuatro.setFocusable(false);
		btnCuatro.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnCuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(e -> {
			accionesBotones(btnCinco.getText());
		});
		btnCinco.setFocusable(false);
		btnCinco.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(e -> {
			accionesBotones(btnSeis.getText());
		});
		btnSeis.setFocusable(false);
		btnSeis.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnSeis);
		
		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(e -> {
			accionesBotones(btnMenos.getText());
		});
		btnMenos.setFocusable(false);
		btnMenos.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnMenos);
		
		JButton btnSiete = new JButton("7");
		btnSiete.addActionListener(e -> {
			accionesBotones(btnSiete.getText());
		});
		btnSiete.setFocusable(false);
		btnSiete.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnSiete);
		
		JButton btnOcho = new JButton("8");
		btnOcho.addActionListener(e -> {
			accionesBotones(btnOcho.getText());
		});
		btnOcho.setFocusable(false);
		btnOcho.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnOcho);
		
		JButton btnNueve = new JButton("9");
		btnNueve.addActionListener(e -> {
			accionesBotones(btnNueve.getText());
		});
		btnNueve.setFocusable(false);
		btnNueve.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnNueve);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(e -> {
            try {
                accionesBotones(btnResultado.getText());
            } catch (Exception ex) {
            	JOptionPane.showMessageDialog(null, ex.getMessage(), "Calculo Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        });
		btnResultado.setFocusable(false);
		btnResultado.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnResultado);
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(e -> {
			accionesBotones(btnCero.getText());
		});
		btnCero.setFocusable(false);
		btnCero.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnCero);
		
		JButton btnSimbolo = new JButton(":");
		btnSimbolo.addActionListener(e -> {
			accionesBotones(btnSimbolo.getText());
		});
		btnSimbolo.setFocusable(false);
		btnSimbolo.setFont(new Font("Loma", Font.BOLD, 18));
		panelBotones.add(btnSimbolo);
		
		JButton btnEliminar = new JButton();
		btnEliminar.setName("suprimir");
		btnEliminar.addActionListener(e -> {
			accionesBotones(btnEliminar.getName());
		});
		btnEliminar.setFont(new Font("Loma", Font.BOLD, 18));
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBackground(new Color(255, 51, 51));
		panelBotones.add(btnEliminar);
		btnEliminar.setFocusable(false);
		btnEliminar.setIcon(new ImageIcon("borrar.png"));
		
		JButton btnEliminarTodo = new JButton("C");
		btnEliminarTodo.addActionListener(e -> {
			accionesBotones(btnEliminarTodo.getText());
		});
		btnEliminarTodo.setFocusable(false);
		btnEliminarTodo.setFont(new Font("Loma", Font.BOLD, 18));
		btnEliminarTodo.setForeground(new Color(255, 255, 255));
		btnEliminarTodo.setBackground(new Color(255, 51, 51));
		panelBotones.add(btnEliminarTodo);
		
        JMenuBar menuBar = new JMenuBar();
        menuBar.setFont(new Font("Loma", Font.BOLD, 18));
        JMenu menu = new JMenu("Archivo");

        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem nuevaVentana = new JMenuItem("Nueva Ventana");
        JMenuItem guardar = new JMenuItem("Guardar"); 
        JMenuItem guardarComo = new JMenuItem("Guardar como...");
        
        JMenuItem salir = new JMenuItem("Salir");
        salir.addActionListener(e -> {
            try {
                System.exit(0);
            } catch (Exception ex) {
            	JOptionPane.showMessageDialog(null, ex.getMessage(), "Salida Fallida", JOptionPane.ERROR_MESSAGE);
            }
        });

        menu.add(abrir);
        menu.add(nuevaVentana);
        menu.add(guardar);
        menu.add(guardarComo);
        
        menu.addSeparator();

        menu.add(salir);
        menuBar.add(menu);

        frmCalculadoraDeAngulos.setJMenuBar(menuBar);

        frmCalculadoraDeAngulos.setVisible(true);
        
        KeyStroke ctrlM = KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK);
        frmCalculadoraDeAngulos.getRootPane().registerKeyboardAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.doClick();
            }
        }, ctrlM, JComponent.WHEN_IN_FOCUSED_WINDOW);
        
	}
	
	public void accionesBotones(String texto) {
		String cadena = textField.getText();
		char ultimoCarcater = 0;
		String resultado = "";
		
		if (cadena.length() != 0) {
			ultimoCarcater = cadena.charAt(cadena.length() - 1);
		}
		
		if (texto.equals("C")) {
			textField.setText("");
		}
		else if (texto.equals("=")) {
			resultado = calcularAngulos(textField.getText());
			textField.setText(resultado);
		}
		else if (texto.equals("suprimir")) {
			String eliminar = textField.getText();
			if (eliminar.length() > 0) {
				if (ultimoCarcater == ' ') {
					eliminar = eliminar.substring(0, eliminar.length() - 3);
				} else {
					eliminar = eliminar.substring(0, eliminar.length() - 1);
				}
			}
			textField.setText(eliminar);;
		}
		else {
			if (texto.equals("+") || texto.equals("-")) {
				if (Character.isDigit(ultimoCarcater)) {
					textField.setText(cadena + " " + texto + " ");				
				} else {
					textField.setText(cadena + texto);
				}
			}
			else {
				textField.setText(cadena + texto);
			}
			
		}
	}
	
	// Pruebas
	// 30:-5:0 - 50:30:-1
	// 29:55:0 - 50:29:59
	// 339:25:01
	
	public String calcularAngulos(String cadena) {
        Angulo angulo1 = new Angulo(0, 0, 0);
        Angulo angulo2 = new Angulo(0, 0, 0);
        String[] partes = cadena.split(" ");

        try {
            for (int i = 0; i < partes.length; i += 2) {
                Angulo anguloSave = null;
                String[] partesAngulo = partes[i].split(":");
                anguloSave = parsearElemento(partesAngulo);
                anguloSave.corregirResultado();

                if (i == 0) {
                    angulo1 = anguloSave;
                } else if (i == 2) {
                    angulo2 = anguloSave;
                }
            }

            Angulo resultado = new Angulo(0, 0, 0);

            if (partes[1].equals("+")) {
                resultado = Angulo.sumarAngulos(angulo1, angulo2);
            } else if (partes[1].equals("-")) {
                resultado = Angulo.restarAngulos(angulo1, angulo2);
            } else {
                throw new IllegalArgumentException("El operador " + partes[1] + " no es válido.");
            }

            return resultado.toString();

        } catch (Exception ex) {
        	JOptionPane.showMessageDialog(null, ex.getMessage(), "Salida Fallida", JOptionPane.ERROR_MESSAGE);
        	return "";
        }
    }
	
	public Angulo parsearElemento(String[] partesAngulo) {
		int grados = 0;
		int minutos = 0;
		int segundos = 0;
		
		try {
			if (partesAngulo.length == 1) {
				segundos = Integer.parseInt(partesAngulo[0]);
				return new Angulo(00, 00, segundos);
			} else if (partesAngulo.length == 2) {
				segundos = Integer.parseInt(partesAngulo[0]);
				minutos = Integer.parseInt(partesAngulo[1]);
				return new Angulo(00, minutos, segundos);
			} else {
				grados = Integer.parseInt(partesAngulo[0]);
				minutos = Integer.parseInt(partesAngulo[1]);
				segundos = Integer.parseInt(partesAngulo[2]);
				return new Angulo(grados, minutos, segundos);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Parseador Incorrecto", JOptionPane.ERROR_MESSAGE);
		}
		
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}