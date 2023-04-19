package pro.sky.JawaSkyPro;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusCalculautor(int num1, int num2) {

        return num1 + num2;

    }

    public int minusCalculautor(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicationCalculautor(int num1, int num2) {

        return num1 * num2 ;
    }

    public double divideCalculautor(double num1, double num2) {


            return num1 / num2;

    }
}
