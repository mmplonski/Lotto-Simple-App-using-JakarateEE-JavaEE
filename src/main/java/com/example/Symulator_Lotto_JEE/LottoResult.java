package com.example.Symulator_Lotto_JEE;


import java.util.List;

//this is DTO (przekazuje informacje z kontrolera do jsp pod postacią pojedynczego widoku)
public class LottoResult {
    private List<Integer> userNumbers;
    private List<Integer> drawnNumbers;
    private List<Integer> winnigNumbers;

    public LottoResult(List<Integer> userNumbers, List<Integer> drawnNumbers, List<Integer> winnigNumbers) {
        this.userNumbers = userNumbers;
        this.drawnNumbers = drawnNumbers;
        this.winnigNumbers = winnigNumbers;
    }


    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public List<Integer> getDrawnNumbers() {
        return drawnNumbers;
    }

    public void setDrawnNumbers(List<Integer> drawnNumbers) {
        this.drawnNumbers = drawnNumbers;
    }

    public List<Integer> getWinnigNumbers() {
        return winnigNumbers;
    }

    public void setWinnigNumbers(List<Integer> winnigNumbers) {
        this.winnigNumbers = winnigNumbers;
    }
}
