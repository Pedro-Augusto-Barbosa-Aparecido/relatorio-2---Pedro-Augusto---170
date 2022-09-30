public class Guerreiro extends PersonagemDeJogador implements AtacanteFisico {
    public Guerreiro(String nome, String genero, int nivel, int vida) {
        super(nome, genero, nivel, vida);
    }

    @Override
    public void ataqueFisico() {
        System.out.println("Executando ataque fisico");
    }

    @Override
    public void mostraInfo() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("Info Personagem da classe 'Guerreiro': \n");
        System.out.printf("Nome do personagem: %s\n", this.nome);
        System.out.printf("Genero do personagem: %s\n", this.genero);
        System.out.printf("Nivel do personagem: %d\n", this.nivel);
        System.out.printf("Vida do personagem: %d\n", this.vida);
        System.out.println("\n------------------------------------------\n");

    }
}
