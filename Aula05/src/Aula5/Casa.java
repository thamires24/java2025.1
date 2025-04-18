package Aula5;

public class Casa extends Imovel{
    private Boolean garagem;


    public Casa(String local, Double valor, Proprietario proprietario, Boolean garagem) {
		super(local, valor, proprietario);
		this.garagem = garagem;
	}

	@Override
    public String toString() {
        return  super.toString() +
                " Tem garagem: " + (garagem ? "Possui garagem" : "Não possui");
    }

    public Boolean getGaragem() {
        return garagem;
    }
}
