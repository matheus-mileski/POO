package agenda.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class AgendaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaFrame frame = new AgendaFrame();
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
	public AgendaFrame() {
     	setTitle("Agenda"); //
     	setResizable(false); //
     	
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	setBounds(100, 100, 450, 500);
     	contentPane = new JPanel();
     	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
     	contentPane.setLayout(new BorderLayout(0, 0));
     	setContentPane(contentPane);
     	
     	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
     	
     	ListarEventosPanel listarEventos = new ListarEventosPanel();//
     	tabbedPane.add("Agenda de Eventos", new CadastroEventoPanel(listarEventos));//
     	tabbedPane.add("Lista de Eventos", listarEventos);//
     	
     	contentPane.add(tabbedPane, BorderLayout.CENTER);
	}

}
