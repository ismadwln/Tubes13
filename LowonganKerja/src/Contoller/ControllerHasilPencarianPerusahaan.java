/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

import Model.Aplikasi;
import Model.Lowongan;
import View.menuHasilPencarianPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Pelamar;
import Model.Perusahaan;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 *
 * @author adhis
 */
public class ControllerHasilPencarianPerusahaan extends MouseAdapter implements ActionListener{
    private Aplikasi model;
    private menuHasilPencarianPerusahaan view;
    private Pelamar p;
    private List<Lowongan> lowongan;
    private int selected;
    public ControllerHasilPencarianPerusahaan(Aplikasi model,List<Lowongan> lowongan,Pelamar p,String namaPerusahaan){
        this.model=model;
        this.p=p;
        this.lowongan=lowongan;
        view=new menuHasilPencarianPerusahaan();
        view.setVisible(true);
        view.addListener(this);
        view.addAdapter(this);
        view.viewAll(lowongan);
        view.setNamaPerusahaan(namaPerusahaan);
    }
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source.equals(view.getBtnDaftar())){
            model.daftarKerja(p,lowongan.get(selected).getIdLowongan());
        }
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource().equals(view.getTblDaftarLowongan())){
            selected=view.getSelected();
        }
    }
    
}
