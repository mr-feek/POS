/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.transaction;

import controller.Controller;
import model.Transaction;
import view.View;
import view.gui.Frame;

class TransactionController extends Controller {
    protected final Transaction transaction;
    protected int id;

    public TransactionController(Transaction transaction) {
        this.transaction = transaction;
        this.id = Frame.requestTransactionID();
    }

    @Override
    protected void displayView() {
        view.print();
    }
    
    protected void init(View view) {
        init(transaction, view);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
