package br.edu.ifpb;

public interface Monitore {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(boolean docenteEntrou);
}