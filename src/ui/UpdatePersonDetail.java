/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import model.Town;
import model.Community;
import model.Address;
import model.Person;

/**
 *
 * @author vagishadeo
 */
public class UpdatePersonDetail extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePersonDetail
     */
    Town town;
    public UpdatePersonDetail(Town town) {
        initComponents();
        this.town = town;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();
        btnEditDetail = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        agelabel = new javax.swing.JLabel();
        agetext = new javax.swing.JTextField();
        citylabel = new javax.swing.JLabel();
        citydrop = new javax.swing.JComboBox<>();
        communitylabel = new javax.swing.JLabel();
        communitydrop = new javax.swing.JComboBox<>();
        addresslabel = new javax.swing.JLabel();
        addressdrop = new javax.swing.JComboBox<>();
        savebutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        UpdateLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateLabel.setText("Update Person Information");

        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Address Line 1", "Address Line 1", "Pincode", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PersonTable);

        btnEditDetail.setText("Edit");
        btnEditDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDetailActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit person detail");

        namelabel.setText("Person Name");

        agelabel.setText("Person Age");

        citylabel.setText("City:");

        communitylabel.setText("Community:");

        communitydrop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                communitydropItemStateChanged(evt);
            }
        });
        communitydrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communitydropActionPerformed(evt);
            }
        });

        addresslabel.setText("Address:");

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnEditDetail)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namelabel)
                                    .addComponent(agelabel)
                                    .addComponent(citylabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(communitylabel)
                                    .addComponent(addresslabel))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressdrop, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(communitydrop, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(citydrop, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agetext, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(UpdateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditDetail)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citydrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communitydrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDetailActionPerformed
        int selectedRow = PersonTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete person detail", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        Person person = (Person) model.getValueAt(selectedRow, 0);
        Address address = (Address) model.getValueAt(selectedRow, 2);
        Community community = (Community) model.getValueAt(selectedRow, 5);
        Town town = (Town) model.getValueAt(selectedRow, 6);
        citydrop.addItem(town);
        town.getcommunityArray().forEach(communityElement ->communitydrop.addItem(communityElement));
        community.getaddressList().forEach(addressElement -> addressdrop.addItem(addressElement));
        communitydrop.setSelectedItem(community);
        addressdrop.setSelectedItem(address);
        nametext.setText(person.getperson_name());
        agetext.setText(person.getperson_age());

    }//GEN-LAST:event_btnEditDetailActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = PersonTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete person detail", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        Person deletePerson = (Person) model.getValueAt(selectedRow, 0);
        Address address = (Address) model.getValueAt(selectedRow, 2);
        for(Person person : address.getpersonArray())
        {
            if(person == deletePerson)
            {
                address.getpersonArray().remove(person);
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Person detail deleted successfully");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void communitydropItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_communitydropItemStateChanged
        addressdrop.removeAllItems();
        Community community = (Community) communitydrop.getSelectedItem();
        community.getaddressList().forEach(address -> addressdrop.addItem(address));
    }//GEN-LAST:event_communitydropItemStateChanged

    private void communitydropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communitydropActionPerformed
        addressdrop.removeAllItems();
        Community community = (Community) communitydrop.getSelectedItem();
        community.getaddressList().forEach(address -> addressdrop.addItem(address));
    }//GEN-LAST:event_communitydropActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed

        if(nametext == null || "".equals(nametext.getText().trim())
                || !Pattern.matches("^(?![\\s.]+$)[a-zA-Z\\s.]*$", nametext.getText())) {
            showMessageDialog(this, "Please enter a valid name", "Error", ERROR_MESSAGE);
            return;
        }
        else if(agetext == null || "".equals(agetext.getText().trim()) 
                || !Pattern.matches("^[0-9]{1,2}$", agetext.getText().trim())) {
            showMessageDialog(this, "Please enter a valid age", "Error", ERROR_MESSAGE);
            return;
        }
        int selectedRow = PersonTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        Person personEditDetail = (Person) model.getValueAt(selectedRow, 0);
        Address newHouse = (Address) addressdrop.getSelectedItem();
        Community newCommunity = (Community) communitydrop.getSelectedItem();
        Town town = (Town) citydrop.getSelectedItem();
        
        Address address = (Address) model.getValueAt(selectedRow, 2);
        for(Person person : address.getpersonArray())
        {
            if(person == personEditDetail)
            {
                address.getpersonArray().remove(person);
                break;
            }
        }
        newHouse.getpersonArray().add(personEditDetail);
        personEditDetail.setperson_name(nametext.getText());
        personEditDetail.setperson_age(agetext.getText());
        
        nametext.setText("");
        agetext.setText("");
        JOptionPane.showMessageDialog(this, "Patient Detail edited successfully");
        populateTable();
    }//GEN-LAST:event_savebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PersonTable;
    private javax.swing.JLabel UpdateLabel;
    private javax.swing.JComboBox<model.Address> addressdrop;
    private javax.swing.JLabel addresslabel;
    private javax.swing.JLabel agelabel;
    private javax.swing.JTextField agetext;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditDetail;
    private javax.swing.JComboBox<Town> citydrop;
    private javax.swing.JLabel citylabel;
    private javax.swing.JComboBox<Community> communitydrop;
    private javax.swing.JLabel communitylabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametext;
    private javax.swing.JButton savebutton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        model.setRowCount(0);
        
        for(Community community : town.getcommunityArray())
        {
            Object[] row = new Object[7];
            row[6] = town;
            row[5] = community;
            for(Address address : community.getaddressList())
            {
                row[2] = address;
                row[3] = address.getAddressLine2();
                row[4] = address.getzipcode();
                for(Person person : address.getpersonArray())
                {
                    row[0] = person;
                    row[1] = person.getperson_age();
                    model.addRow(row);
                }
            }
        }
    }
}
