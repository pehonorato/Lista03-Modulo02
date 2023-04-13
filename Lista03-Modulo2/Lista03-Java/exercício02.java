public class Musica {
    private String nome;
    private int duracaoEmSegundos;
    private int popularidade;
    private String genero;

    public Musica(String nome, int duracaoEmSegundos, int popularidade, String genero) {
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.popularidade = popularidade;
        this.genero = genero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


import java.util.ArrayList;

public class Album {
    private String nome;
    private String nomeArtista;
    private ArrayList<Musica> musicas;

    public Album(String nome, String nomeArtista) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.musicas = new ArrayList<Musica>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }


    public Musica getMusicaMaiorPopularidade() {
        Musica maior = null;
        for (Musica m : musicas) {
            if (maior == null || m.getPopularidade() > maior.getPopularidade()) {
                maior = m;
            }
        }
        return maior;
    }


    public Musica getMusicaMenorDuracao() {
        Musica menor = null;
        for (Musica m : musicas) {
            if (menor == null || m.getDuracaoEmSegundos() < menor.getDuracaoEmSegundos()) {
                menor = m;
            }
        }
        return menor;
    }
}
