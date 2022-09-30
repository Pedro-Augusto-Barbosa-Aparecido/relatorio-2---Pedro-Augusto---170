public class Ladino extends PersonagemDeJogador implements AtacanteFisico {
    private int alcanceArco;
    private int numFlechas;

    public Ladino(String nome, String genero, int nivel, int vida, int alcanceArco, int numFlechas) {
        super(nome, genero, nivel, vida);
        this.alcanceArco = alcanceArco;
        this.numFlechas = numFlechas;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    @Override
    public void ataqueFisico() {
        if (this.numFlechas > 0) {
            System.out.println("Executando ataque fisico");
            this.numFlechas -= (int) (Math.random() * this.nivel * alcanceArco);

            if (this.numFlechas < 0)
                this.numFlechas = 0;
        }

        else
            System.out.println("Sem flechas");

    }

    @Override
    public void mostraInfo() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("Info Personagem da classe 'Ladino': \n");
        System.out.printf("Nome do personagem: %s\n", this.nome);
        System.out.printf("Genero do personagem: %s\n", this.genero);
        System.out.printf("Nivel do personagem: %d\n", this.nivel);
        System.out.printf("Vida do personagem: %d\n", this.vida);
        System.out.printf("Numero de Flechas: %d\n", this.numFlechas);
        System.out.printf("Alcance do arco: %d\n", this.alcanceArco);
        System.out.println("\n------------------------------------------\n");

    }

    public void addMunicao(int qtd) {
        if ((qtd > 0))
            this.numFlechas += qtd;
        else
            System.out.println("nao eh possivel adicionar flechas");

    }
}
