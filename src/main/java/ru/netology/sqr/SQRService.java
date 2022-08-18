package ru.netology.sqr;

public class SQRService {
    public int summSquareRoot(int lowerBound, int upperBound) {
        int numberOfSquares = 0;
        for (int i = 10; i <100; i++) {
            if (i * i <= upperBound && i * i >= lowerBound) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }
}
