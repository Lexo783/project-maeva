package com.strange_tape.project_maeva.utils;

public class Vector2D {
    private double x; // Coordonnée X
    private double y; // Coordonnée Y

    // Constructeur
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters et Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Méthodes supplémentaires si nécessaire
    public double magnitude() {
        return Math.sqrt(x * x + y * y); // Calcul de la magnitude
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y); // Addition de vecteurs
    }

    public Vector2D subtract(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y); // Soustraction de vecteurs
    }
}
