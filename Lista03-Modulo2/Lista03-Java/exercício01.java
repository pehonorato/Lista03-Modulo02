import java.util.ArrayList;

public class Inimigo {
    private int ataque;
    private int defesa;
    private int pontos;

    public Inimigo(int ataque, int defesa, int pontos) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

public class Heroi {
    private int ataque;
    private int defesa;
    private int pontos;

    public Heroi(int ataque, int defesa, int pontos) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos;
    private ArrayList<Heroi> herois;

    public Mapa(String nome, int altura, int largura, ArrayList<Inimigo> inimigos, ArrayList<Heroi> herois) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.inimigos = inimigos;
        this.herois = herois;
    }

    public Inimigo getInimigoMaiorAtaque() {
        Inimigo maiorAtaque = null;

        for (Inimigo inimigo : inimigos) {
            if (maiorAtaque == null || inimigo.getAtaque() > maiorAtaque.getAtaque()) {
                maiorAtaque = inimigo;
            }
        }

        return maiorAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi
