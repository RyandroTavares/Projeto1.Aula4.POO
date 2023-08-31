package com.capturando.dadosJsom;

public class Pessoa {
	
	private long id;
    private String firstNome;
    private String lastNome;
    private int age;
    private String nationality;
    private String cpf;

    public Pessoa() {

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstNome() {
        return firstNome;
    }
    public void setFirstNome(String firstNome) {
        this.firstNome = firstNome;
    }
    public String getLastNome() {
        return lastNome;
    }
    public void setLastNome(String lastNome) {
        this.lastNome = lastNome;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa id=" + id + ", firstNome=" + firstNome + ", lastNome=" + lastNome + ", age=" + age
                + ", nationality=" + nationality + ", cpf=" + cpf ;
    }

    
   

}