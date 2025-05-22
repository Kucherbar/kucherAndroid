package com.example.kucherandroid;

public class Story {
    Character character;
    Situation start;
    Situation current;

    public Story(Character character, Situation start) {
        this.character = character;
        this.start = start;
        this.current = start;
    }
    public void setStartSituation() {
        this.current = Situation.getWindow();
    }
    public void go(int intputedAnswer) {
        if (current.getAnswers().length >= intputedAnswer) {
            current =current.getAnswers()[intputedAnswer - 1];
            character.setK(character.getK() + current.getDk());
            character.setA(character.getA() + current.getDa());
            character.setR(character.getR() + current.getDr());

        } else {
            System.out.println("Введите правильный ответ");
        }
    }
    public boolean isEnd() {
        return current.getAnswers().length == 0;
    }
}
