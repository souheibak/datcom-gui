/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FlightConditionsView.java
 *
 * Created on Oct 14, 2009, 12:03:47 AM
 */

package opendatcom;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author -B-
 */
public class FlightConditionsView extends javax.swing.JPanel implements AbstractView{
    String outputData;
    FlightConditionsController controller;
    /** Creates new form FlightConditionsView */
    public FlightConditionsView(FlightConditionsController controller) {
        initComponents();
        this.controller = controller;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel219 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jDefaultFlightConditions = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jMachText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAltText = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jAOAText = new javax.swing.JTextArea();
        jSetFlightConditions = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jWeightText = new javax.swing.JTextField();
        jSTMachText = new javax.swing.JTextField();
        jLabel226 = new javax.swing.JLabel();
        jTSMachText = new javax.swing.JTextField();
        jLabel227 = new javax.swing.JLabel();
        jGammaText = new javax.swing.JTextField();
        jLabel230 = new javax.swing.JLabel();
        jTRText = new javax.swing.JTextField();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jFlightHeaderText = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jFlightHeader = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jDrawPanel = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jTitle = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(opendatcom.OpenDatcomApp.class).getContext().getResourceMap(FlightConditionsView.class);
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel13.border.title"))); // NOI18N
        jPanel13.setName("jPanel13"); // NOI18N

        jLabel219.setText(resourceMap.getString("jLabel219.text")); // NOI18N
        jLabel219.setToolTipText(resourceMap.getString("jLabel219.toolTipText")); // NOI18N
        jLabel219.setName("jLabel219"); // NOI18N

        jLabel221.setText(resourceMap.getString("jLabel221.text")); // NOI18N
        jLabel221.setToolTipText(resourceMap.getString("jLabel221.toolTipText")); // NOI18N
        jLabel221.setName("jLabel221"); // NOI18N

        jLabel223.setText(resourceMap.getString("jLabel223.text")); // NOI18N
        jLabel223.setToolTipText(resourceMap.getString("jLabel223.toolTipText")); // NOI18N
        jLabel223.setName("jLabel223"); // NOI18N

        jDefaultFlightConditions.setName("jDefaultFlightConditions"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jMachText.setColumns(20);
        jMachText.setLineWrap(true);
        jMachText.setRows(5);
        jMachText.setName("jMachText"); // NOI18N
        jScrollPane3.setViewportView(jMachText);

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jAltText.setColumns(20);
        jAltText.setLineWrap(true);
        jAltText.setRows(5);
        jAltText.setName("jAltText"); // NOI18N
        jScrollPane4.setViewportView(jAltText);

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        jAOAText.setColumns(20);
        jAOAText.setLineWrap(true);
        jAOAText.setRows(5);
        jAOAText.setName("jAOAText"); // NOI18N
        jScrollPane5.setViewportView(jAOAText);

        jSetFlightConditions.setText(resourceMap.getString("jSetFlightConditions.text")); // NOI18N
        jSetFlightConditions.setName("jSetFlightConditions"); // NOI18N
        jSetFlightConditions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSetFlightConditionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel221)
                    .addComponent(jLabel219)
                    .addComponent(jLabel223)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jDefaultFlightConditions, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSetFlightConditions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel221)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel219)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel223))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDefaultFlightConditions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jSetFlightConditions))))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel17.border.title"))); // NOI18N
        jPanel17.setName("jPanel17"); // NOI18N

        jWeightText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jWeightText.setText(resourceMap.getString("jWeightText.text")); // NOI18N
        jWeightText.setName("jWeightText"); // NOI18N
        jWeightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWeightTextActionPerformed(evt);
            }
        });

        jSTMachText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jSTMachText.setName("jSTMachText"); // NOI18N

        jLabel226.setText(resourceMap.getString("jLabel226.text")); // NOI18N
        jLabel226.setToolTipText(resourceMap.getString("jLabel226.toolTipText")); // NOI18N
        jLabel226.setName("jLabel226"); // NOI18N

        jTSMachText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTSMachText.setName("jTSMachText"); // NOI18N

        jLabel227.setText(resourceMap.getString("jLabel227.text")); // NOI18N
        jLabel227.setToolTipText(resourceMap.getString("jLabel227.toolTipText")); // NOI18N
        jLabel227.setName("jLabel227"); // NOI18N

        jGammaText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jGammaText.setName("jGammaText"); // NOI18N

        jLabel230.setText(resourceMap.getString("jLabel230.text")); // NOI18N
        jLabel230.setToolTipText(resourceMap.getString("jLabel230.toolTipText")); // NOI18N
        jLabel230.setName("jLabel230"); // NOI18N

        jTRText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTRText.setName("jTRText"); // NOI18N

        jLabel236.setName("jLabel236"); // NOI18N

        jLabel237.setText(resourceMap.getString("jLabel237.text")); // NOI18N
        jLabel237.setToolTipText(resourceMap.getString("jLabel237.toolTipText")); // NOI18N
        jLabel237.setName("jLabel237"); // NOI18N

        jLabel238.setText(resourceMap.getString("jLabel238.text")); // NOI18N
        jLabel238.setToolTipText(resourceMap.getString("jLabel238.toolTipText")); // NOI18N
        jLabel238.setName("jLabel238"); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel226)
                    .addComponent(jLabel227)
                    .addComponent(jLabel230)
                    .addComponent(jLabel236)
                    .addComponent(jLabel237)
                    .addComponent(jLabel238))
                .addGap(50, 50, 50)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTRText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jGammaText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jTSMachText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jSTMachText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jWeightText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWeightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel236)
                    .addComponent(jLabel237))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSTMachText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel238))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel226)
                    .addComponent(jTSMachText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel227)
                    .addComponent(jGammaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel230)
                    .addComponent(jTRText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jFlightHeaderText.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jFlightHeaderText.border.title"))); // NOI18N
        jFlightHeaderText.setName("jFlightHeaderText"); // NOI18N

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        jFlightHeader.setColumns(20);
        jFlightHeader.setLineWrap(true);
        jFlightHeader.setRows(5);
        jFlightHeader.setName("jFlightHeader"); // NOI18N
        jScrollPane6.setViewportView(jFlightHeader);

        javax.swing.GroupLayout jFlightHeaderTextLayout = new javax.swing.GroupLayout(jFlightHeaderText);
        jFlightHeaderText.setLayout(jFlightHeaderTextLayout);
        jFlightHeaderTextLayout.setHorizontalGroup(
            jFlightHeaderTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFlightHeaderTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFlightHeaderTextLayout.setVerticalGroup(
            jFlightHeaderTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFlightHeaderTextLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setName("jPanel4"); // NOI18N

        jDrawPanel.setBackground(resourceMap.getColor("jDrawPanel.background")); // NOI18N
        jDrawPanel.setName("jDrawPanel"); // NOI18N

        javax.swing.GroupLayout jDrawPanelLayout = new javax.swing.GroupLayout(jDrawPanel);
        jDrawPanel.setLayout(jDrawPanelLayout);
        jDrawPanelLayout.setHorizontalGroup(
            jDrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jDrawPanelLayout.setVerticalGroup(
            jDrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDrawPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDrawPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel55.setName("jPanel55"); // NOI18N

        jTitle.setFont(resourceMap.getFont("jTitle.font")); // NOI18N
        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText(resourceMap.getString("jTitle.text")); // NOI18N
        jTitle.setName("jTitle"); // NOI18N

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFlightHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFlightHeaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSetFlightConditionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSetFlightConditionsActionPerformed
        controller.refresh();
        System.out.println("Button Fires\n" + outputData);
}//GEN-LAST:event_jSetFlightConditionsActionPerformed

    private void jWeightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWeightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jWeightTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAOAText;
    private javax.swing.JTextArea jAltText;
    private static javax.swing.JComboBox jDefaultFlightConditions;
    private javax.swing.JPanel jDrawPanel;
    private javax.swing.JTextArea jFlightHeader;
    private javax.swing.JPanel jFlightHeaderText;
    private javax.swing.JTextField jGammaText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JTextArea jMachText;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JTextField jSTMachText;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jSetFlightConditions;
    private javax.swing.JTextField jTRText;
    private javax.swing.JTextField jTSMachText;
    private javax.swing.JLabel jTitle;
    private javax.swing.JTextField jWeightText;
    // End of variables declaration//GEN-END:variables

    public JTextArea getjAOAText() {
        return jAOAText;
    }

    public JTextArea getjAltText() {
        return jAltText;
    }

    public static JComboBox getjDefaultFlightConditions() {
        return jDefaultFlightConditions;
    }

    public JTextArea getjFlightHeader() {
        return jFlightHeader;
    }

    public JTextField getjGammaText() {
        return jGammaText;
    }

    public JTextField getjWeightText() {
        return jWeightText;
    }

    public JTextArea getjMachText() {
        return jMachText;
    }

    public JTextField getjSTMachText() {
        return jSTMachText;
    }

    public JTextField getjTRText() {
        return jTRText;
    }

    public JTextField getjTSMachText() {
        return jTSMachText;
    }

    public String getOutputData() {
        return outputData;
    }

    public void setOutputData(String outputData) {
        this.outputData = outputData;
    }


}
