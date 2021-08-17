package agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import agenda.Evento;
import agenda.io.AgendaIO;
import agenda.utils.AgendaUtils;
import agenda.utils.PeriodicidadeEnum;

import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CadastroEventoPanel extends JPanel {
	private JTextField campoEvento;
	private JTextField campoData;
	private JTextField campoEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();

   	private JCheckBox checkBoxAlarme;
   	private JRadioButton radioButton1,radioButton2,radioButton3; 
   	private JButton botaoSalvar, botaoLimpar;
 

	/**
	 * Create the panel.
	 */
	private ListarEventosPanel listaEventos;
   	
   	/**
   	 * Create the panel.
   	 */
   	public CadastroEventoPanel(ListarEventosPanel listaEventos) {
   		this.listaEventos = listaEventos;
		setLayout(null);
		
		JLabel rotuloEvento = new JLabel("Evento");
		rotuloEvento.setBounds(20, 44, 49, 14);
		add(rotuloEvento);
		
		campoEvento = new JTextField();
		campoEvento.setBounds(82, 41, 96, 20);
		add(campoEvento);
		campoEvento.setColumns(10);
		
		JLabel rotuloData = new JLabel("Data");
		rotuloData.setBounds(20, 92, 49, 14);
		add(rotuloData);
		
		campoData = new JTextField();
		campoData.setBounds(82, 89, 96, 20);
		add(campoData);
		campoData.setColumns(10);
		
		JLabel rotuloEmail = new JLabel("Email");
		rotuloEmail.setBounds(20, 150, 49, 14);
		add(rotuloEmail);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(82, 147, 96, 20);
		add(campoEmail);
		campoEmail.setColumns(10);
		
		JLabel rotuloPeriodicidade = new JLabel("Periodicidade");
		rotuloPeriodicidade.setBounds(20, 203, 87, 14);
		add(rotuloPeriodicidade);
		
		radioButton1 = new JRadioButton("Uma vez");
		buttonGroup.add(radioButton1);
		radioButton1.setBounds(106, 199, 111, 23);
		add(radioButton1);
		
		radioButton2 = new JRadioButton("Semanal");
		buttonGroup.add(radioButton2);
		radioButton2.setBounds(219, 199, 111, 23);
		add(radioButton2);
		
		radioButton3 = new JRadioButton("Mensal");
		buttonGroup.add(radioButton3);
		radioButton3.setBounds(333, 199, 111, 23);
		add(radioButton3);
		
		checkBoxAlarme = new JCheckBox("Alarme");
		checkBoxAlarme.setBounds(82, 250, 99, 23);
		add(checkBoxAlarme);
		
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(219, 250, 89, 23);
		add(botaoSalvar);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setBounds(336, 250, 89, 23);
		add(botaoLimpar);
		
		botaoSalvar.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent arg0) {
               	chamaCadastroEvento();
        	}

		});

		botaoLimpar.addActionListener(new ActionListener() {
			@Override
        	public void actionPerformed(ActionEvent arg0) {
               	limparCampos();
        	}
		});


	}
   	

   	private void chamaCadastroEvento(){
         	  AgendaIO io = new AgendaIO();
         	  Evento evento = new Evento();
 
         	  Object[] novaLinha = new Object[5];
 
         	  evento.setDataEvento(AgendaUtils.getDateFromString(campoData.getText()));
         	  evento.setDescEvento(campoEvento.getText());
         	  evento.setAlarme(checkBoxAlarme.isSelected() ? 1 : 0);
         	  evento.setEmailEncaminhar(campoEmail.getText());
 
         	  novaLinha[0] = campoData.getText();
         	  novaLinha[1] = campoEvento.getText();
         	  novaLinha[4] = checkBoxAlarme.isSelected() ? "LIGADO" : "DESLIGADO";
         	  novaLinha[3] = campoEmail.getText();
 
         	  if(radioButton1.isSelected()){
         	   evento.setPeriodicidade(PeriodicidadeEnum.UNICO);
         	   novaLinha[2] = PeriodicidadeEnum.UNICO;
         	  }
         	  else if(radioButton2.isSelected()){
         	   evento.setPeriodicidade(PeriodicidadeEnum.SEMANAL);
         	   novaLinha[2] = PeriodicidadeEnum.SEMANAL;
         	  }
         	  else {
         	   evento.setPeriodicidade(PeriodicidadeEnum.MENSAL);
         	   novaLinha[2] = PeriodicidadeEnum.MENSAL;
         	  }
 
         	  try {
         	   io.gravarEvento(evento);
         	  }catch(Exception ex){
         	   JOptionPane.showMessageDialog(null, "ERRO", ex.getMessage(),
         	   JOptionPane.ERROR_MESSAGE);
         	  }
         	  listaEventos.addNewRow(novaLinha);
         	  limparCampos();
         	}
   	
   	private void limparCampos() {
     	campoData.setText("");
     	campoEvento.setText("");
     	checkBoxAlarme.setSelected(false);
     	campoEmail.setText("");
     	radioButton1.setSelected(true);
	}
   	
   	
}
