import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Guilda guilda = new Guilda();

        Guerreiro guerreiro1 = new Guerreiro("Guerreiro 1", "masculino", 1, 0);
        Guerreiro guerreiro2 = new Guerreiro("Guerreiro 2", "feminino", 1, 0);

        Ladino ladino1 = new Ladino("Ladino 1", "masculino", 20, 1000, 10, 0);
        Ladino ladino2 = new Ladino("Ladino 2", "masculino", 30, 1400, 50, 0);

        Mago mago1 = new Mago("Mago 1", "masculino", 1, 100, "fogo", 0);
        Mago mago2 = new Mago("Mago 2", "masculino", 15, 800, "gelo", 0);

        guilda.addMembro(guerreiro1);
        guilda.addMembro(ladino1);
        guilda.addMembro(mago1);

        guilda.listaMembros();

        System.out.println("________________________________________________________");
        for (PersonagemDeJogador personagemDeJogador: guilda.getMembros()) {
            if (personagemDeJogador != null) {
                if (personagemDeJogador instanceof Mago) {
                    Mago personagem = (Mago) personagemDeJogador;
                    do {
                        personagem.recuperaMana(20);
                    } while (personagem.getMana() <= (personagem.nivel * 20));
                    do {
                        personagem.ataqueMagico();
                    } while (personagem.getMana() > 0);
                    personagem.mostraInfo();
                }

                if (personagemDeJogador instanceof Ladino) {
                    Ladino personagem = (Ladino) personagemDeJogador;
                    do {
                        personagem.addMunicao(10);
                    } while (personagem.getNumFlechas() <= (personagem.nivel));
                    do {
                        personagem.ataqueFisico();
                    } while (personagem.getNumFlechas() > 0);
                    personagem.mostraInfo();
                }

                if (personagemDeJogador instanceof Guerreiro) {
                    Guerreiro personagem = (Guerreiro) personagemDeJogador;
                    personagem.ataqueFisico();
                    personagem.mostraInfo();
                }


            }
        }
        System.out.println("_______________________________________________________");
    }

}
