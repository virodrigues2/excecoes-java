public class ConversorTemperatura {

    public static double converterCelsiusParaFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Erro: Temperatura abaixo do zero absoluto não é possível.");
        }
        return celsius * 9/5 + 32;
    }

    public static void main(String[] args) {
        try {
            double f = converterCelsiusParaFahrenheit(-300);
            System.out.println("Temperatura em Fahrenheit: " + f);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
