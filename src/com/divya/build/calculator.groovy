package com.divya.builds;

class Calculator {
    def jenkins
    Calculator (jenkins) {
        this.jenkins = jenkins

    }
    def add(firstNumber, secondNumber) {
        return firstNumber+secondNumber
    }
    def multiply(firstNumber, secondNumber) {
        return firstNumber*secondNumber
    }
}