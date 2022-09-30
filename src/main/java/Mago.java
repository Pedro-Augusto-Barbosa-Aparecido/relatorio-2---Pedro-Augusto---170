public class Mago extends PersonagemDeJogador implements AtacanteMagico {
    private String especialidadeElemental;
    private int mana;

    public Mago(String nome, String genero, int nivel, int vida, String especialidadeElemental, int mana) {
        super(nome, genero, nivel, vida);
        this.especialidadeElemental = especialidadeElemental;
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void ataqueMagico() {
        if (this.mana > 0) {
            System.out.println("Executando ataque magico, de longo alcance");
            this.mana -= (int) (Math.random() * this.nivel * 2);

            if (this.mana < 0)
                this.mana = 0;

        }
        else
            System.out.println("Mana Esgotada");

    }

    @Override
    public void mostraInfo() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("Info Personagem da classe 'Mago': \n");
        System.out.printf("Nome do personagem: %s\n", this.nome);
        System.out.printf("Genero do personagem: %s\n", this.genero);
        System.out.printf("Nivel do personagem: %d\n", this.nivel);
        System.out.printf("Vida do personagem: %d\n", this.vida);
        System.out.printf("Especialidade Elemental: %s\n", this.especialidadeElemental);
        System.out.printf("Quantidade de Mana: %s\n", this.mana);
        System.out.println("\n------------------------------------------\n");

    }

    public void recuperaMana(int qtd) {
        if ((qtd > 0))
            this.mana += qtd;
        else
            System.out.println("nao eh possivel restaurar a mana");

    }
}
