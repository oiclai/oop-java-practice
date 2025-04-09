package introd.basico;

public class Classes {
    public class Pessoa {
        private String nome;
                
        public Pessoa(String nome) {
            this.nome = nome;
        }
                
        public String getNome() {
            return nome;
        }
                
        public void setNome(String nome) {
            this.nome = nome;
        }
                
        public void cumprimentar() {
            System.out.println("Olá, " + nome);
        }
    }
}
