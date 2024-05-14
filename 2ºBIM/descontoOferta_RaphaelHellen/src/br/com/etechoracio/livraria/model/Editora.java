package br.com.etechoracio.livraria.model;

public class Editora {
    private String nome;
    private String site;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void exibirEditora(){
        System.out.println("Nome: " + getNome());
        System.out.println("Site: " + getSite());
    }
}
