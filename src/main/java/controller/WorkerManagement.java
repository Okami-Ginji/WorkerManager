/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import view.Menu;
import repository.WorkerRepository;
import model.Worker;
import model.History;
        

/**
 *
 * @author Administrator
 */
public class WorkerManagement extends Menu<String>{
    
    static String[] mc = {"Add Worker", "Up salary","Down salary","Display Information salary","Exit"};
    WorkerRepository program;
    ArrayList<Worker> lw;
    ArrayList<History> lh;
    
    public WorkerManagement() {
        super("         Worker Management", mc);
        program = new WorkerRepository();
        lw = new ArrayList<>();
        lh = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                program.addWorker(lw);
                break;
            case 2:
                program.changeSalary(lw, lh, "UP");
                break;
            case 3:
                program.changeSalary(lw, lh, "DOWN");
                break;
            case 4:
                program.printListHistory(lh);
                break;
            case 5:
                System.exit(0);
        }
    }
    
}
