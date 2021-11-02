/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Town;
import model.Community;
import model.Encounter;
import model.Address;
import model.Person;
import model.Vitals;

/**
 *
 * @author vagishadeo
 */
public class PatientBackgroundJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientBackgroundJPanel
     */
    Town town;
    public PatientBackgroundJPanel(Town town) {
        this.town = town;
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();
        Label = new javax.swing.JLabel();
        HistoryButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointmenttable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

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

        Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label.setText("Appointment Background for registered patients");

        HistoryButton.setText("Select patient to view history");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        appointmenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor's Name", "Date of Appoinment", "Blood Pressure", "Pluse Rate", "Temperature", "Respiration Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(appointmenttable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HistoryButton)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        int selectedRow = PersonTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view patient appoinment history", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        Person person = (Person) model.getValueAt(selectedRow, 0);
        Address address = (Address) model.getValueAt(selectedRow, 2);
        Community community = (Community) model.getValueAt(selectedRow, 5);
        Town Town = (Town) model.getValueAt(selectedRow, 6);

        populateAppoinmentHistoyTable(person);
    }//GEN-LAST:event_HistoryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HistoryButton;
    private javax.swing.JLabel Label;
    private javax.swing.JTable PersonTable;
    private javax.swing.JTable appointmenttable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
//        tblPersonDetail.setDefaultRenderer(Object.class, new DefaultTableCellRenderer()
//        {
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
//            {
//                
//                Car car = (Car)table.getModel().getValueAt(row, 0);
//                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//                c.setBackground(car.isAvailable()? Color.LIGHT_GRAY: Color.RED);
//                return c;
//            }
//        });
    }

    private void populateAppoinmentHistoyTable(Person person) {
        DefaultTableModel model = (DefaultTableModel) appointmenttable.getModel();
        model.setRowCount(0);
        
        for(Encounter encounter : person.getPatient().getencounterBackground().getencounterArray())
        {
            Object[] row = new Object[6];
            Vitals vitalSigns = encounter.getVitals();
            row[0] = encounter.getDoctor();
            row[1] = encounter.geDate();
            row[2] = vitalSigns.getBloodP();
            row[3] = vitalSigns.getPulse();
            row[4] = vitalSigns.getTemp();
            row[5] = vitalSigns.getbreathRate();
            
            model.addRow(row);
        }
    }
}
