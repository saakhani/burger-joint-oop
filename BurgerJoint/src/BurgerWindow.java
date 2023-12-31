public class BurgerWindow extends javax.swing.JFrame {

    /**
     * Creates new form burger
     */
    public BurgerWindow() {
        initComponents();
        switch (CurrentBurger.burger.getBun()) {
            case "Plain":
                bread.setSelectedIndex(0);
                break;
            case "Sesame Seed":
                bread.setSelectedIndex(1);
                break;
            case "Whole Wheat":
                bread.setSelectedIndex(2);
                break;
            case "Croissant":
                bread.setSelectedIndex(3);
                break;
            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        fries = new javax.swing.JButton();
        beverages = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        bread = new javax.swing.JComboBox<>();
        onion = new javax.swing.JButton();
        tomato = new javax.swing.JButton();
        olive = new javax.swing.JButton();
        jalapeno = new javax.swing.JButton();
        iceberg = new javax.swing.JButton();
        ketchup = new javax.swing.JButton();
        garlicmayo = new javax.swing.JButton();
        hotsauce = new javax.swing.JButton();
        mustard = new javax.swing.JButton();
        bacon = new javax.swing.JButton();
        grilledchicken = new javax.swing.JButton();
        crispychicken = new javax.swing.JButton();
        grilledbeef = new javax.swing.JButton();
        cheese = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAKE YOUR BURGER");

        home.setBackground(new java.awt.Color(153, 153, 153));
        home.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        fries.setBackground(new java.awt.Color(153, 153, 153));
        fries.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fries.setForeground(new java.awt.Color(255, 255, 255));
        fries.setText("Fries");
        fries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friesActionPerformed(evt);
            }
        });

        beverages.setBackground(new java.awt.Color(153, 153, 153));
        beverages.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        beverages.setForeground(new java.awt.Color(255, 255, 255));
        beverages.setText("Beverages");
        beverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beveragesActionPerformed(evt);
            }
        });

        cart.setBackground(new java.awt.Color(153, 153, 153));
        cart.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.setText("Cart");
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choose your Bread");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Meat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Vegetables");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Sauces");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("View Burger");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bread.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Plain Bun "+ "(Rs. " + Prices.plainBun + ")", "Sesame Seed "+ "(Rs. " + Prices.sesameBun + ")", "Whole Wheat "+ "(Rs. " + Prices.wheatBun + ")", "Croissant "+ "(Rs. " + Prices.croissantBun + ")" }));
        bread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breadActionPerformed(evt);
            }
        });

        onion.setText("Onion "+ "(Rs. " + Prices.onionVegetable + ")" );
        onion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionActionPerformed(evt);
            }
        });

        tomato.setText("Tomato "+ "(Rs. " + Prices.tomatoVegetable + ")");
        tomato.setAlignmentY(0.0F);
        tomato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatoActionPerformed(evt);
            }
        });

        olive.setText("Olives " +"(Rs. " + Prices.oliveVegetable + ")");
        olive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oliveActionPerformed(evt);
            }
        });

        jalapeno.setText("Jalapeno "+ "(Rs. " + Prices.jalapenoVegetable + ")");
        jalapeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalapenoActionPerformed(evt);
            }
        });

        iceberg.setText("Iceberg "+ "(Rs. " + Prices.icebergVegetable + ")" );
        iceberg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icebergActionPerformed(evt);
            }
        });

        ketchup.setText("Ketchup "+ "(Rs. " + Prices.ketchupSauce + ")");
        ketchup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketchupActionPerformed(evt);
            }
        });

        garlicmayo.setText("Garlic Mayo "+ "(Rs. " + Prices.garlicMayoSauce + ")");
        garlicmayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garlicmayoActionPerformed(evt);
            }
        });

        hotsauce.setText("Hot Sauce "+ "(Rs. " + Prices.hotSauceSauce + ")");
        hotsauce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotsauceActionPerformed(evt);
            }
        });

        mustard.setText("Mustard "+ "(Rs. " + Prices.mustardSauce + ")");
        mustard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mustardActionPerformed(evt);
            }
        });

        bacon.setText("Turkey Bacon "+ "(Rs. " + Prices.baconPatty + ")");
        bacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconActionPerformed(evt);
            }
        });

        grilledchicken.setText("Grilled Chicken " + "(Rs. " + Prices.gChickenPatty + ")");
        grilledchicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grilledchickenActionPerformed(evt);
            }
        });

        crispychicken.setText("Crispy Chicken "+ "(Rs. " + Prices.cChickenPatty + ")");
        crispychicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crispychickenActionPerformed(evt);
            }
        });

        grilledbeef.setText("Grilled Beef "+ "(Rs. " + Prices.gBeefPatty + ")");
        grilledbeef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grilledbeefActionPerformed(evt);
            }
        });

        cheese.setText("Cheese "+ "(Rs. " + Prices.cheeseSauce + ")");
        cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheeseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bread, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bacon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(grilledbeef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crispychicken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grilledchicken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iceberg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(olive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tomato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jalapeno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ketchup, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(garlicmayo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(hotsauce, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(mustard, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cheese, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(fries, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(beverages)
                        .addGap(86, 86, 86)
                        .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fries)
                    .addComponent(home)
                    .addComponent(beverages, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ketchup, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(grilledchicken)
                                .addComponent(olive)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crispychicken)
                            .addComponent(tomato)
                            .addComponent(garlicmayo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grilledbeef)
                            .addComponent(jalapeno)
                            .addComponent(hotsauce))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bacon)
                            .addComponent(iceberg)
                            .addComponent(mustard))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onion)
                    .addComponent(cheese))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewBurgerWindow().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void beveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beveragesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BeveragesWindow().setVisible(true);
    }//GEN-LAST:event_beveragesActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeWindow().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void friesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FriesWindow().setVisible(true);
    }//GEN-LAST:event_friesActionPerformed

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CartWindow().setVisible(true);
    }//GEN-LAST:event_cartActionPerformed

    private void breadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breadActionPerformed
        switch (bread.getSelectedIndex()) {
            case 0:
                CurrentBurger.burger.setBun(new Plain());
                break;
            case 1:
                CurrentBurger.burger.setBun(new Sesame());
                break;
            case 2:
                CurrentBurger.burger.setBun(new Wheat());
                break;
            case 3:
                CurrentBurger.burger.setBun(new Croissant());
                break;
            default:
                break;
        }
    }//GEN-LAST:event_breadActionPerformed

    private void tomatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatoActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addVegetable(new Tomato());
        
    }//GEN-LAST:event_tomatoActionPerformed

    private void crispychickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crispychickenActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addPatty(new CChicken());
    }//GEN-LAST:event_crispychickenActionPerformed

    private void grilledchickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grilledchickenActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addPatty(new GChicken());
    }//GEN-LAST:event_grilledchickenActionPerformed

    private void jalapenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalapenoActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addVegetable(new Jalapeno());
        
    }//GEN-LAST:event_jalapenoActionPerformed

    private void oliveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oliveActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addVegetable(new Olive());

    }//GEN-LAST:event_oliveActionPerformed

    private void icebergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icebergActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addVegetable(new Iceberg());
        
    }//GEN-LAST:event_icebergActionPerformed

    private void onionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addVegetable(new Onion());
        
    }//GEN-LAST:event_onionActionPerformed

    private void grilledbeefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grilledbeefActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addPatty(new GBeef());
    }//GEN-LAST:event_grilledbeefActionPerformed

    private void baconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addPatty(new TBacon());
    }//GEN-LAST:event_baconActionPerformed

    private void ketchupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketchupActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addSauce(new Ketchup());
    }//GEN-LAST:event_ketchupActionPerformed

    private void garlicmayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garlicmayoActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addSauce(new GarlicMayo());
    }//GEN-LAST:event_garlicmayoActionPerformed

    private void hotsauceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotsauceActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addSauce(new HotSauce());
    }//GEN-LAST:event_hotsauceActionPerformed

    private void mustardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mustardActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addSauce(new Mustard());
    }//GEN-LAST:event_mustardActionPerformed

    private void cheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheeseActionPerformed
        // TODO add your handling code here:
        CurrentBurger.burger.addSauce(new Cheese());
    }//GEN-LAST:event_cheeseActionPerformed

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
            java.util.logging.Logger.getLogger(BurgerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BurgerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BurgerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BurgerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BurgerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bacon;
    private javax.swing.JButton beverages;
    private javax.swing.JComboBox<String> bread;
    private javax.swing.JButton cart;
    private javax.swing.JButton cheese;
    private javax.swing.JButton crispychicken;
    private javax.swing.JButton fries;
    private javax.swing.JButton garlicmayo;
    private javax.swing.JButton grilledbeef;
    private javax.swing.JButton grilledchicken;
    private javax.swing.JButton home;
    private javax.swing.JButton hotsauce;
    private javax.swing.JButton iceberg;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jalapeno;
    private javax.swing.JButton ketchup;
    private javax.swing.JButton mustard;
    private javax.swing.JButton olive;
    private javax.swing.JButton onion;
    private javax.swing.JButton tomato;
    // End of variables declaration//GEN-END:variables
}
