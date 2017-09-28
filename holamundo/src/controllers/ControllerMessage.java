/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMessage;
import views.ViewMessage;

public class ControllerMessage implements ActionListener  {
    private final ModelMessage modelMessage;
    private final ViewMessage viewMessage;

    public ControllerMessage(ViewMessage viewMessage, ModelMessage modelMessage){
        this.viewMessage = viewMessage;
        this.modelMessage = modelMessage;
        viewMessage.jbtnHello.addActionListener(this);
        viewMessage.jbtnBye.addActionListener(this);
        initView();
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jbtnHello)
            btnHelloActionPerformed();
        else if(e.getSource()==viewMessage.jbtnBye)
            btnByeActionPerformed();
    }

    private void btnHelloActionPerformed(){
        modelMessage.setMessage("Hello from MVC");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }

    private void btnByeActionPerformed(){
        modelMessage.setMessage("Bye from MVC");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }

    public final void initView(){
        viewMessage.setTitle("Hello MVC");
        viewMessage.setLocationRelativeTo(null);
        viewMessage.jlMessage.setText(modelMessage.getMessage());
        viewMessage.setVisible(true);
    }
}
