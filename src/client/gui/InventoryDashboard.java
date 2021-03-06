
package client.gui;

import java.awt.event.ActionEvent;

public class InventoryDashboard extends Parent {
    private final Button viewAll, OutofStock, newShip;

    public InventoryDashboard(Frame f) {
        super(f, true);
        int width = 300, height = 200, left = 100, right = 800, top = 150, bottom = 400, center = 450;
        
        viewAll = new Button(this, "View All", left, top, width, height);
        OutofStock = new Button(this, "Out of Stock", right, top, width, height);
        newShip = new Button(this, "new Shipment", center, top, width, height);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object obj = e.getSource();
        
        if (obj == viewAll){
            swap(new ViewAllItemsPanel(frame));
        }
        else if (obj == OutofStock){
            swap(new OutOfStockPanel(frame));
        }
        else if (obj == newShip){
            swap(new NewShipmentPanel(frame));
        }
        
    }

}
