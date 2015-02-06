/*
 * F1ConstructorInfo.java
 * This file is part of F1ChampionshipQueries
 * Copyright (C) 2015 - LlamaTech Team 
 *
 * F1ChampionshipQueries is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * F1ChampionshipQueries is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with F1ChampionshipQueries. If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.llama.tech.f1.gui;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.llama.tech.f1.backbone.Escuderia;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JButton;

public class F1ConstructorInfo extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblPas;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblPuntos;
	private JTextField textField_3;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JTable table_1;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public F1ConstructorInfo() 
	{
		setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informaci\u00F3n Escuder\u00EDa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new TitledBorder(null, "Logo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setBounds(23, 36, 181, 100);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(216, 40, 70, 15);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(341, 36, 265, 19);
		add(textField);
		textField.setColumns(10);
		
		lblPas = new JLabel("País:");
		lblPas.setBounds(216, 67, 70, 15);
		add(lblPas);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(341, 63, 265, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Posición final:");
		lblNewLabel_2.setBounds(216, 94, 107, 15);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(341, 90, 265, 19);
		add(textField_2);
		
		lblPuntos = new JLabel("Puntos:");
		lblPuntos.setBounds(216, 121, 107, 15);
		add(lblPuntos);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(341, 117, 265, 19);
		add(textField_3);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Pilotos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		scrollPane.setBounds(23, 155, 232, 73);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new TitledBorder(null, "Carreras", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		scrollPane_1.setBounds(274, 155, 332, 73);
		add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(269, 234, 332, 30);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("←");
		btnNewButton.setBounds(81, 0, 117, 25);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("→");
		btnNewButton_1.setBounds(210, 0, 117, 25);
		panel.add(btnNewButton_1);

	}
	
	public void cambiarInfo(Escuderia escuderia)
	{
		textField.setText(escuderia.getNombre());
		textField_1.setText(escuderia.getPais());
		textField_2.setText(escuderia.getPosFinal()+"");
		textField_3.setText(escuderia.getPuntos()+"");
	}
}
