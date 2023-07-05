package br.edu.ifpb;

import java.util.ArrayList;
import java.util.List;

public class Docente implements Monitore {

    private String nome;
    private List<Observer> observers = new ArrayList<>();

    public Docente(String nome) {
        this.nome = nome;
    }

    public void entrar() {
        System.out.println("O " + this.nome + " entrou no bloco.");
        notifyObservers(true);
    }

    public void sair() {
        System.out.println("O " + this.nome + " saiu do bloco.");
        notifyObservers(false);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(boolean docenteEntrou) {
        for (Observer observer : observers) {
            observer.update(docenteEntrou);
        }
    }
}