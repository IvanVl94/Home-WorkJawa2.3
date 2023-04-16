package pro.sky.JawaSkyPro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService = new CalculatorService();
    @GetMapping(path = "/calculator")
    public String helloCalculautor() {
        return calculatorService.helloCalculautor();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusCalculautor(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.plusCalculautor(num1, num2);

    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculautor(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minusCalculautor(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplicationCalculautor(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        return calculatorService.multiplicationCalculautor(num1,num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalculautor(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {

            return calculatorService.divideCalculautor(num1,num2);

    }
}