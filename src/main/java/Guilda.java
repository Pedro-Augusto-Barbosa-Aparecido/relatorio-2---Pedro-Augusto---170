public class Guilda {
    private PersonagemDeJogador[] membros;

    public PersonagemDeJogador[] getMembros() {
        return membros;
    }

    public void addMembro(PersonagemDeJogador personagem) {
        if (this.membros == null)
            this.membros = new PersonagemDeJogador[5];

        boolean playerAdded = false;
        boolean maxMembersExceeded = false;
        for (int i = 0; i < this.membros.length; i++) {
            if (((i + 1) == this.membros.length) && (this.membros[i] != null))
                maxMembersExceeded = true;

            if ((this.membros[i] == null)) {
                this.membros[i] = personagem;
                playerAdded = true;
                System.out.printf("\nPlayer %s adicionado com sucesso\n", personagem.nome);
                break;
            }
        }

        if (!playerAdded)
            System.out.printf("\nNao foi possivel adicionar o player %s\n", personagem.nome);

        if (maxMembersExceeded)
            System.out.print("\nNumero maximo de membros atingido\n");


    }

    public void listaMembros() {
        if (this.membros != null)
            for (PersonagemDeJogador personagem: this.membros)
                if (personagem != null)
                    personagem.mostraInfo();

    }

}
