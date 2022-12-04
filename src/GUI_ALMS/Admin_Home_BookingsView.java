/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_ALMS;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author ahmed
 */
public class Admin_Home_BookingsView extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Home_AddFlights
     */
    public Admin_Home_BookingsView() {
        initComponents();
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.setBackground(new Color(0,0,0,0));
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    void setColoroptionPanel(JPanel jp) 
    {
         jp.setBackground(new java.awt.Color(255,102,102));
    }
     void resetColoroptionPanel(JPanel jp) 
    {
         jp.setBackground(new java.awt.Color(102,153,230));
    } 
    void resetLogtoutColor(JPanel r)
    {
        r.setBackground(new Color(255,255,255));
    }
      void setLogtoutColor(JPanel r)
    {
        r.setBackground(new Color(200,200,200));
    }
    
     void resetProeeedColor(JLabel r)
    {
        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/proceed_red.png")));
    }
      void setProceedColor(JLabel r)
    {
        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/proceed_lightred.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        Btn_Add = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_remove = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_update = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_view = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_addTicket = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_updateTicket = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_removeTicket = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(51, 130, 210));

        Btn_Add.setBackground(new java.awt.Color(102, 153, 230));
        Btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Btn_AddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Btn_AddMouseReleased(evt);
            }
        });
        Btn_Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/add.png"))); // NOI18N
        Btn_Add.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 13, 20, 22));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Flight");
        Btn_Add.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        btn_remove.setBackground(new java.awt.Color(102, 153, 230));
        btn_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_removeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_removeMouseReleased(evt);
            }
        });
        btn_remove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/remove.png"))); // NOI18N
        btn_remove.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 13, 20, 22));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Remove Flight");
        btn_remove.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        btn_update.setBackground(new java.awt.Color(102, 153, 230));
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_updateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_updateMouseReleased(evt);
            }
        });
        btn_update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/update.png"))); // NOI18N
        btn_update.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 13, 20, 22));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Update Flight");
        btn_update.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        btn_view.setBackground(new java.awt.Color(255, 102, 102));
        btn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_viewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_viewMouseReleased(evt);
            }
        });
        btn_view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/view.png"))); // NOI18N
        btn_view.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 13, -1, 22));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("View Bookings");
        btn_view.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO_ALMS1.png"))); // NOI18N

        btn_addTicket.setBackground(new java.awt.Color(102, 153, 230));
        btn_addTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addTicketMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_addTicketMouseReleased(evt);
            }
        });
        btn_addTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/addTicket.png"))); // NOI18N
        btn_addTicket.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        jLabel24.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Add Ticket");
        btn_addTicket.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        btn_updateTicket.setBackground(new java.awt.Color(102, 153, 230));
        btn_updateTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_updateTicketMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_updateTicketMouseReleased(evt);
            }
        });
        btn_updateTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/updateTicket.png"))); // NOI18N
        btn_updateTicket.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 5, 30, 30));

        jLabel26.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Update Ticket");
        btn_updateTicket.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        btn_removeTicket.setBackground(new java.awt.Color(102, 153, 230));
        btn_removeTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_removeTicketMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_removeTicketMouseReleased(evt);
            }
        });
        btn_removeTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/removeTicket.png"))); // NOI18N
        btn_removeTicket.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 5, 30, 30));

        jLabel28.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Remove Ticket");
        btn_removeTicket.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 13, -1, -1));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(Btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_addTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_updateTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_removeTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(Btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_addTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_removeTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_updateTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );

        background.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 680));

        jPanel1.setBackground(new java.awt.Color(51, 130, 210));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Display All Bookings :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 830, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("Admin Name");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 240, 32));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/admin_Symbol.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/logout.png"))); // NOI18N
        jLabel13.setText("Logout");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 100, -1));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 740, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Search");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 230), 2));
        jTextField2.setOpaque(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 340, 30));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_Admin/proceed_red.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel22MouseReleased(evt);
            }
        });
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 530, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ticket Number", "Price", "Seat Number", "Ticket Type", "Services", "Plane", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 100, 660, 400));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 130, 210));
        jLabel15.setText("Enter Ticket Number :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, -1));

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 690, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        this.setLogtoutColor(jPanel3);
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
         this.resetLogtoutColor(jPanel3);
         this.dispose();
         Admin_Login AL = new Admin_Login();
         AL.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        String te= jTextField2.getText();
        if(te.compareTo("Search")==0)
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        // TODO add your handling code here:
         this.setProceedColor(jLabel22);
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
        // TODO add your handling code here:
        this.resetProeeedColor(jLabel22);
    }//GEN-LAST:event_jLabel22MouseReleased

    private void Btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AddMousePressed
        // TODO add your handling code here:
        this.resetColoroptionPanel(Btn_Add);
    }//GEN-LAST:event_Btn_AddMousePressed

    private void Btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AddMouseReleased
        // TODO add your handling code here:
        this.setColoroptionPanel(Btn_Add);
        
         this.resetColoroptionPanel(btn_remove);
         this.resetColoroptionPanel(btn_update);
         this.resetColoroptionPanel(btn_view);
          this.resetColoroptionPanel(btn_addTicket);
          this.resetColoroptionPanel(btn_removeTicket);
          this.resetColoroptionPanel(btn_updateTicket);
          
          Admin_Home_AddFlights AHA = new Admin_Home_AddFlights();
          AHA.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_Btn_AddMouseReleased

    private void btn_removeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeMousePressed
        // TODO add your handling code here:
        this.resetColoroptionPanel(btn_remove);
    }//GEN-LAST:event_btn_removeMousePressed

    private void btn_removeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeMouseReleased
        // TODO add your handling code here:
        this.setColoroptionPanel(btn_remove);
    
        this.resetColoroptionPanel(Btn_Add);
        this.resetColoroptionPanel(btn_update);
        this.resetColoroptionPanel(btn_view);
        this.resetColoroptionPanel(btn_addTicket);
          this.resetColoroptionPanel(btn_removeTicket);
          this.resetColoroptionPanel(btn_updateTicket);
          
          Admin_Home_FlightRemove AHF = new Admin_Home_FlightRemove();
          AHF.setVisible(true);
          this.dispose();
          
    }//GEN-LAST:event_btn_removeMouseReleased

    private void btn_updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMousePressed
        // TODO add your handling code here:
        this.resetColoroptionPanel(btn_update);
    }//GEN-LAST:event_btn_updateMousePressed

    private void btn_updateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseReleased
        // TODO add your handling code here:
        this.setColoroptionPanel(btn_update);
       
        this.resetColoroptionPanel(Btn_Add);
        this.resetColoroptionPanel(btn_remove);
        this.resetColoroptionPanel(btn_view);
        this.resetColoroptionPanel(btn_addTicket);
          this.resetColoroptionPanel(btn_removeTicket);
          this.resetColoroptionPanel(btn_updateTicket);
          
          Admin_Home_FlightUpdate AHF = new Admin_Home_FlightUpdate();
          AHF.setVisible(true);
          this.dispose();
          
    }//GEN-LAST:event_btn_updateMouseReleased

    private void btn_viewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMousePressed
        // TODO add your handling code here:
        this.resetColoroptionPanel(btn_view);
    }//GEN-LAST:event_btn_viewMousePressed

    private void btn_viewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseReleased
        // TODO add your handling code here:
        this.setColoroptionPanel(btn_view);
      
        this.resetColoroptionPanel(Btn_Add);
        this.resetColoroptionPanel(btn_remove);
        this.resetColoroptionPanel(btn_update);
        this.resetColoroptionPanel(btn_addTicket);
          this.resetColoroptionPanel(btn_removeTicket);
          this.resetColoroptionPanel(btn_updateTicket);
          
         
    }//GEN-LAST:event_btn_viewMouseReleased

    private void btn_addTicketMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addTicketMousePressed
        // TODO add your handling code here:
         this.resetColoroptionPanel(btn_addTicket);
        
    }//GEN-LAST:event_btn_addTicketMousePressed

    private void btn_addTicketMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addTicketMouseReleased
        // TODO add your handling code here:
        this.setColoroptionPanel(btn_addTicket);
        this.resetColoroptionPanel(btn_view);
        this.resetColoroptionPanel(Btn_Add);
        this.resetColoroptionPanel(btn_remove);
        this.resetColoroptionPanel(btn_update);
        
          this.resetColoroptionPanel(btn_removeTicket);
          this.resetColoroptionPanel(btn_updateTicket);
          
          
          Admin_Home_TicketAdd AHT = new Admin_Home_TicketAdd();
          AHT.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btn_addTicketMouseReleased

    private void btn_updateTicketMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateTicketMousePressed
        // TODO add your handling code here:
        this.resetColoroptionPanel(btn_updateTicket);
    }//GEN-LAST:event_btn_updateTicketMousePressed

    private void btn_updateTicketMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateTicketMouseReleased
        // TODO add your handling code here:
         this.setColoroptionPanel(btn_updateTicket);
        this.resetColoroptionPanel(btn_view);
        this.resetColoroptionPanel(Btn_Add);
        this.resetColoroptionPanel(btn_remove);
        this.resetColoroptionPanel(btn_update);
     
          this.resetColoroptionPanel(btn_removeTicket);
          this.resetColoroptionPanel(btn_addTicket);
           Admin_Home_TicketUpdate AHT = new Admin_Home_TicketUpdate();
          AHT.setVisible(true);
          this.dispose();
          
    }//GEN-LAST:event_btn_updateTicketMouseReleased

    private void btn_removeTicketMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeTicketMousePressed
        // TODO add your handling code here:
         this.resetColoroptionPanel(btn_removeTicket);
    }//GEN-LAST:event_btn_removeTicketMousePressed

    private void btn_removeTicketMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeTicketMouseReleased
        // TODO add your handling code here:
          this.setColoroptionPanel(btn_removeTicket);
        this.resetColoroptionPanel(btn_view);
        this.resetColoroptionPanel(Btn_Add);
        this.resetColoroptionPanel(btn_remove);
        this.resetColoroptionPanel(btn_update);
       
          this.resetColoroptionPanel(btn_updateTicket);
          this.resetColoroptionPanel(btn_addTicket);
          
           Admin_Home_TicketRemove AHT = new Admin_Home_TicketRemove();
          AHT.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btn_removeTicketMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home_BookingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home_BookingsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_Add;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btn_addTicket;
    private javax.swing.JPanel btn_remove;
    private javax.swing.JPanel btn_removeTicket;
    private javax.swing.JPanel btn_update;
    private javax.swing.JPanel btn_updateTicket;
    private javax.swing.JPanel btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
