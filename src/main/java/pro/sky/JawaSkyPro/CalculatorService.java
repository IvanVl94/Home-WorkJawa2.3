package pro.sky.JawaSkyPro;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String plusCalculautor(int num1,int num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;

    }

    public String minusCalculautor(int num1, int num2) {
        int dif = num1 - num2;
        return num1 + "-" + num2 + "=" + dif;
    }

    public String multiplicationCalculautor(int num1,int num2) {
        int multi = num1 * num2;
        return num1 + "*" + num2 + "=" + multi;
    }

    public String divideCalculautor(double num1, double num2) {

        double div = num1 / num2;

            return num1 + "/" + num2 + "=" + div;

    }
}
