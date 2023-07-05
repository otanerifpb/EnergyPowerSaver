package br.edu.ifpb;

public abstract class Equipamento {
    protected boolean ligado;

    public Equipamento() {
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(getNome() + " ligado(a).");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(getNome() + " desligado(a).");
        }
    }

    public abstract String getNome();
}