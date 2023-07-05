package br.edu.ifpb;

import br.edu.ifpb.equipamentos.*;

import java.util.ArrayList;
import java.util.List;

public class BlocoAcademico implements Observer {
    private static BlocoAcademico instance = null;
    private List<Equipamento> equipamentos = new ArrayList<>();
    private int activeDocentes = 0;

    private BlocoAcademico() {
        // Adicione aqui os equipamentos que pertencem ao bloco academico
        equipamentos.add(new ArCondicionado());
        equipamentos.add(new Luz());        
    }

    public static BlocoAcademico getInstance() {
        if (instance == null) {
            instance = new BlocoAcademico();
        }
        return instance;
    }

    public void ligarEquipamentos() {
        if (!equipamentos.isEmpty()) {
            for (Equipamento equipamento : equipamentos) {
                equipamento.ligar();
            }
        }
    }

    public void desligarEquipamentos() {
        if (!equipamentos.isEmpty()) {
            for (Equipamento equipamento : equipamentos) {
                equipamento.desligar();
            }
        }
    }

    @Override
    public void update(boolean docenteEntrou) {
        if (docenteEntrou) {
            activeDocentes++;
            if (activeDocentes == 1) {
                ligarEquipamentos();
            }
        } else {
            activeDocentes--;
            if (activeDocentes == 0) {
                desligarEquipamentos();
            }
        }
    }
}

