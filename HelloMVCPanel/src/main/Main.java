/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;

/**
 *
 * @author PC17
 */
public class Main {

    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;

    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;

    private static ViewOperaciones view_Operaciones;
    private static ModelOperaciones model_Operaciones;
    private static ControllerOperaciones controller_Operaciones;

    private static ViewMayor view_Mayor;
    private static ModelMayor model_Mayor;
    private static ControllerMayor controller_Mayor;


    public static void main(String[] ngh) {
        viewMessage = new ViewMessage();
        modelMessage = new ModelMessage();
        controllerMessage = new ControllerMessage(viewMessage, modelMessage);

        view_Operaciones = new ViewOperaciones();
        model_Operaciones = new ModelOperaciones();
        controller_Operaciones = new ControllerOperaciones(model_Operaciones, view_Operaciones);

        view_Mayor = new ViewMayor();
        model_Mayor = new ModelMayor();
        controller_Mayor = new ControllerMayor(model_Mayor, view_Mayor);

        viewMain = new ViewMain();
        modelMain = new ModelMain();
        controllerMain = new ControllerMain(viewMain, viewMessage, modelMain, view_Operaciones, view_Mayor);

    }
}
