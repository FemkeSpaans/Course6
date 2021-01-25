package Afvink5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class GeneFinder extends JFrame implements ActionListener {

    static JTextField gene1, gene2, gene3;
    private JButton add_gene1, add_gene2, add_gene3, find_overlap;
    static JTextArea genes1, genes2, genes3, overlapping_genes;
    HashSet <String> genes_list1 = new HashSet<>();
    HashSet <String> genes_list2 = new HashSet<>();
    HashSet<String> genes_list3 = new HashSet<>();
    static JComboBox dropdown;
    //static JScrollPane scroll_genes1, scroll_genes2, scroll_genes3;

    public static void main(String[] args) {
        GeneFinder frame = new GeneFinder();
        frame.setTitle("Gene Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.gui();
        frame.setVisible(true);

    }

    public void gui(){
        Container window = getContentPane();

        // create a jtextfield in which to enter a gene which will go in the first text area
        gene1 = new JTextField();
        gene1.setBounds(20,20, 150, 20);
        window.add(gene1);

        // create a jbutton to add a gene with from textfield gene1
        add_gene1 = new JButton();
        add_gene1.setBounds(20, 50, 150, 20);
        add_gene1.setText("Add");
        window.add(add_gene1);
        add_gene1.addActionListener(this);

        // create a jtextarea in which the entered genes will be displayed
        genes1 = new JTextArea();
        //JScrollPane scroll_genes1 = new JScrollPane(genes1);
        genes1.setBounds(20, 80, 150, 300);
        window.add(genes1);
        //window.add(scroll_genes1);

        // create a jtextfield in which to enter a gene which will go in the second text area
        gene2 = new JTextField();
        gene2.setBounds(220, 20, 150, 20);
        window.add(gene2);

        // create a jbutton to add a gene with from textfield gene2
        add_gene2 = new JButton();
        add_gene2.setBounds(220, 50, 150, 20);
        add_gene2.setText("Add");
        window.add(add_gene2);
        add_gene2.addActionListener(this);

        // create a jtextarea in which the entered genes will be displayed
        genes2 = new JTextArea();
        genes2.setBounds(220, 80, 150, 300);
        window.add(genes2);

        // create a jtextfield in which to enter a gene which will go in the third text area
        gene3 = new JTextField();
        gene3.setBounds(420, 20, 150, 20);
        window.add(gene3);

        // create a jbutton to add a gene with from textfield gene3
        add_gene3 = new JButton();
        add_gene3.setBounds(420, 50, 150, 20);
        add_gene3.setText("Add");
        window.add(add_gene3);
        add_gene3.addActionListener(this);

        // create a jtextarea in which the entered genes will be displayed
        genes3 = new JTextArea();
        genes3.setBounds(420, 80, 150, 300);
        window.add(genes3);

        //
        find_overlap = new JButton();
        find_overlap.setBounds(20, 410, 150, 20);
        find_overlap.setText("Calculate overlap");
        window.add(find_overlap);
        find_overlap.addActionListener(this);

        //
        String[] options = {"All Identical", "1&2 Identical", "1&3 Identical", "2&3 Identical"};
        dropdown = new JComboBox(options);
        dropdown.setBounds(200, 410, 150, 20);
        dropdown.setSelectedIndex(0);
        window.add(dropdown);

        // create a jtextarea in which the overlapping genes will be displayed
        overlapping_genes = new JTextArea();
        overlapping_genes.setBounds(20, 440, 550, 100);
        window.add(overlapping_genes);

    }

    public void adding1(){
        String get_gene = gene1.getText();
        genes_list1.add(get_gene);
        genes1.setText(String.valueOf(genes_list1));
    }

    public void adding2(){
        String get_gene = gene2.getText();
        genes_list2.add(get_gene);
        genes2.setText(String.valueOf(genes_list2));
    }

    public void adding3(){
        String get_gene = gene3.getText();
        genes_list3.add(get_gene);
        genes3.setText(String.valueOf(genes_list3));
    }

    public void find_overlapping_genes(){
        if (dropdown.getSelectedIndex() == 0){
            genes_list1.retainAll(genes_list2);
            genes_list1.retainAll(genes_list3);
            overlapping_genes.setText(genes_list1.toString());
            }

        if (dropdown.getSelectedIndex()== 1){
            genes_list1.retainAll(genes_list2);
            overlapping_genes.setText(genes_list1.toString());

        }
        if (dropdown.getSelectedIndex()== 2){
            genes_list1.retainAll(genes_list3);
            overlapping_genes.setText(genes_list1.toString());
        }
        if (dropdown.getSelectedIndex()== 3){
            genes_list2.retainAll(genes_list3);
            overlapping_genes.setText(genes_list2.toString());
        }

    }



    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == add_gene1) {
            adding1();
        }
        if (event.getSource() == add_gene2){
            adding2();
        }

        if (event.getSource() == add_gene3){
            adding3();
        }

        if (event.getSource() == find_overlap){
            find_overlapping_genes();
        }

    }

}
