package introd.exercicio;

public class ConversaoTemperatura {
    public String nome;
    // init
    public ConversaoTemperatura(String nome) {
        this.nome = nome;
    }
    // methods
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}