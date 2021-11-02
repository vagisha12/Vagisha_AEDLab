/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Town;
import model.Community;
import model.Address;
import model.Patient;
import model.Person;
import model.Vitals;

/**
 *
 * @author ashis
 */
public class CommunityStatus extends javax.swing.JPanel {

    /**
     * Creates new form CommunityStatus
     */
    
    private Town town;
    
    public CommunityStatus(Town town) {
        initComponents();
        this.town = town;
        town.getcommunityArray().forEach(community -> {
            Dropdown.addItem(community.getcommunityInfo());
        });
        
        populateOverviewTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        popupMenu1 = new java.awt.PopupMenu();
        Dropdown = new javax.swing.JComboBox<>();
        CommunityLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StatusTable = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        setBackground(new java.awt.Color(255, 204, 204));

        Dropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DropdownItemStateChanged(evt);
            }
        });
        Dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropdownActionPerformed(evt);
            }
        });

        CommunityLabel.setText("Select Community");

        StatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Blood Pressure Measure", "Patient Count"
            }
        ));
        jScrollPane1.setViewportView(StatusTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(CommunityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(Dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommunityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropdownActionPerformed

    private void DropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DropdownItemStateChanged
        populateOverviewTable();
    }//GEN-LAST:event_DropdownItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommunityLabel;
    private javax.swing.JComboBox<String> Dropdown;
    private javax.swing.JTable StatusTable;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

    private void populateOverviewTable()
    {
        DefaultTableModel model = (DefaultTableModel) StatusTable.getModel();
        model.setRowCount(0);
        String[] countRow = {"Abnormal blood pressure", 
                "Normal blood pressure",
                "Abnormal pulse rate",
                "Normal pulse rate",
                "Abnormal temperature",
                "Normal temperature",
                "Abnormal respiration",
                "Normal respiration"
        
        };
        int[] count = new int[8]; // 1.blood pressure, pulse rate, temperature, respiration
        String seletectedCommunity = Dropdown.getSelectedItem().toString();
        for(Community community : town.getcommunityArray())
        {
            if(!community.getcommunityInfo().equals(seletectedCommunity))
                continue;
            for(Address address : community.getaddressList())
            {
                for(Person person : address.getpersonArray())
                {
                    Patient patient = person.getPatient();
                    if(patient.getencounterBackground().getencounterArray().isEmpty())
                    {
                        count[0]++;
                        count[2]++;
                        count[4]++;
                        count[6]++;
                        continue;
                    }
                    Vitals vitals = patient.getencounterBackground().getencounterArray().get(0).getVitals();
                    int pulse = Integer.parseInt(vitals.getPulse());
                    int temp = Integer.parseInt(vitals.getTemp());
                    int breathRate = Integer.parseInt(vitals.getbreathRate());
                    int BloodP = Integer.parseInt(vitals.getBloodP());
                    
                    if(BloodP < 120)
                        count[0]++;
                    else
                        count[1]++;
                    
                    if(pulse <= 100)
                        count[2]++;
                    else
                        count[3]++;
                    
                    if(temp <= 99)
                        count[4]++;
                    else
                        count[5]++;
                    
                    if(breathRate <= 16)
                        count[6]++;
                    else
                        count[7]++;
                }
            }
        }
        for(int i = 0; i<countRow.length; i++)
        {
            Object[] row = new Object[2];
            row[0] = countRow[i];
            row[1] = count[i];
            model.addRow(row);
        }
    }
}