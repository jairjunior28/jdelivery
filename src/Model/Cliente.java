/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author jairjunior
 */
public class Cliente {
    
    private int codcadastroclientes;
    private String nome;
    private Date nascimento;
    private boolean ativo;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;
    private String email;
    private String site;
    private String pontoreferencia;
    private boolean ativaconveniado;
    private String telefone;
    private String celular;
    private String fax;
    private boolean fisica;
    private boolean juridica;
    private String cpf;
    private String rg;
    private String cnpj;
    private String incricaoestadual;
    private String observacoes;
    private Date datacadastro;
    private float limitecredito;
    private float totalfaturas;
    private float juros;
    private float multa;
    private Date diabompagamento;
    private String enderecoentrega;
    private int numeroentrega;
    private String bairroentrega;
    private String cidadeentrega;
    private String estadoentrega;
    private String complementoentrega;
    private String cepentrega;
    private String pontoreferenciaentrega;
    private boolean usaentrega;
    private boolean chequebloqueado;
    private float limitecheque;
    private boolean incluiipinabc;
    private boolean conveniopormes;
    private String nomefantasia;
    private boolean permiteconveniovinculado;
    private String placa, modelo, marca, ano, cor, pais, docestrangeiro;
    private boolean estrangeiro;
    private float creditoconvenio;
    private boolean conveniopormescr;
    private float juroscr, multacr;
    private String diabompagamentocr;
    private float limitecreditocr, limitecontasreceber, limiteutilizadocontasreceber;
    private boolean funcionario;
    private String pispasep, numerocarteira, seriecarteira, ufcarteira;

    public int getCodcadastroclientes() {
        return codcadastroclientes;
    }

    public void setCodcadastroclientes(int codcadastroclientes) {
        this.codcadastroclientes = codcadastroclientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPontoreferencia() {
        return pontoreferencia;
    }

    public void setPontoreferencia(String pontoreferencia) {
        this.pontoreferencia = pontoreferencia;
    }

    public boolean isAtivaconveniado() {
        return ativaconveniado;
    }

    public void setAtivaconveniado(boolean ativaconveniado) {
        this.ativaconveniado = ativaconveniado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public boolean isFisica() {
        return fisica;
    }

    public void setFisica(boolean fisica) {
        this.fisica = fisica;
    }

    public boolean isJuridica() {
        return juridica;
    }

    public void setJuridica(boolean juridica) {
        this.juridica = juridica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoestadual() {
        return incricaoestadual;
    }

    public void setIncricaoestadual(String incricaoestadual) {
        this.incricaoestadual = incricaoestadual;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public float getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(float limitecredito) {
        this.limitecredito = limitecredito;
    }

    public float getTotalfaturas() {
        return totalfaturas;
    }

    public void setTotalfaturas(float totalfaturas) {
        this.totalfaturas = totalfaturas;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public Date getDiabompagamento() {
        return diabompagamento;
    }

    public void setDiabompagamento(Date diabompagamento) {
        this.diabompagamento = diabompagamento;
    }

    public String getEnderecoentrega() {
        return enderecoentrega;
    }

    public void setEnderecoentrega(String enderecoentrega) {
        this.enderecoentrega = enderecoentrega;
    }

    public int getNumeroentrega() {
        return numeroentrega;
    }

    public void setNumeroentrega(int numeroentrega) {
        this.numeroentrega = numeroentrega;
    }

    public String getBairroentrega() {
        return bairroentrega;
    }

    public void setBairroentrega(String bairroentrega) {
        this.bairroentrega = bairroentrega;
    }

    public String getCidadeentrega() {
        return cidadeentrega;
    }

    public void setCidadeentrega(String cidadeentrega) {
        this.cidadeentrega = cidadeentrega;
    }

    public String getEstadoentrega() {
        return estadoentrega;
    }

    public void setEstadoentrega(String estadoentrega) {
        this.estadoentrega = estadoentrega;
    }

    public String getComplementoentrega() {
        return complementoentrega;
    }

    public void setComplementoentrega(String complementoentrega) {
        this.complementoentrega = complementoentrega;
    }

    public String getCepentrega() {
        return cepentrega;
    }

    public void setCepentrega(String cepentrega) {
        this.cepentrega = cepentrega;
    }

    public String getPontoreferenciaentrega() {
        return pontoreferenciaentrega;
    }

    public void setPontoreferenciaentrega(String pontoreferenciaentrega) {
        this.pontoreferenciaentrega = pontoreferenciaentrega;
    }

    public boolean isUsaentrega() {
        return usaentrega;
    }

    public void setUsaentrega(boolean usaentrega) {
        this.usaentrega = usaentrega;
    }

    public boolean isChequebloqueado() {
        return chequebloqueado;
    }

    public void setChequebloqueado(boolean chequebloqueado) {
        this.chequebloqueado = chequebloqueado;
    }

    public float getLimitecheque() {
        return limitecheque;
    }

    public void setLimitecheque(float limitecheque) {
        this.limitecheque = limitecheque;
    }

    public boolean isIncluiipinabc() {
        return incluiipinabc;
    }

    public void setIncluiipinabc(boolean incluiipinabc) {
        this.incluiipinabc = incluiipinabc;
    }

    public boolean isConveniopormes() {
        return conveniopormes;
    }

    public void setConveniopormes(boolean conveniopormes) {
        this.conveniopormes = conveniopormes;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public boolean isPermiteconveniovinculado() {
        return permiteconveniovinculado;
    }

    public void setPermiteconveniovinculado(boolean permiteconveniovinculado) {
        this.permiteconveniovinculado = permiteconveniovinculado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDocestrangeiro() {
        return docestrangeiro;
    }

    public void setDocestrangeiro(String docestrangeiro) {
        this.docestrangeiro = docestrangeiro;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public float getCreditoconvenio() {
        return creditoconvenio;
    }

    public void setCreditoconvenio(float creditoconvenio) {
        this.creditoconvenio = creditoconvenio;
    }

    public boolean isConveniopormescr() {
        return conveniopormescr;
    }

    public void setConveniopormescr(boolean conveniopormescr) {
        this.conveniopormescr = conveniopormescr;
    }

    public float getJuroscr() {
        return juroscr;
    }

    public void setJuroscr(float juroscr) {
        this.juroscr = juroscr;
    }

    public float getMultacr() {
        return multacr;
    }

    public void setMultacr(float multacr) {
        this.multacr = multacr;
    }

    public String getDiabompagamentocr() {
        return diabompagamentocr;
    }

    public void setDiabompagamentocr(String diabompagamentocr) {
        this.diabompagamentocr = diabompagamentocr;
    }

    public float getLimitecreditocr() {
        return limitecreditocr;
    }

    public void setLimitecreditocr(float limitecreditocr) {
        this.limitecreditocr = limitecreditocr;
    }

    public float getLimitecontasreceber() {
        return limitecontasreceber;
    }

    public void setLimitecontasreceber(float limitecontasreceber) {
        this.limitecontasreceber = limitecontasreceber;
    }

    public float getLimiteutilizadocontasreceber() {
        return limiteutilizadocontasreceber;
    }

    public void setLimiteutilizadocontasreceber(float limiteutilizadocontasreceber) {
        this.limiteutilizadocontasreceber = limiteutilizadocontasreceber;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }

    public String getPispasep() {
        return pispasep;
    }

    public void setPispasep(String pispasep) {
        this.pispasep = pispasep;
    }

    public String getNumerocarteira() {
        return numerocarteira;
    }

    public void setNumerocarteira(String numerocarteira) {
        this.numerocarteira = numerocarteira;
    }

    public String getSeriecarteira() {
        return seriecarteira;
    }

    public void setSeriecarteira(String seriecarteira) {
        this.seriecarteira = seriecarteira;
    }

    public String getUfcarteira() {
        return ufcarteira;
    }

    public void setUfcarteira(String ufcarteira) {
        this.ufcarteira = ufcarteira;
    }
    public Cliente(String nome,String Endereco,String Telefone,String Celular){
    
        this.nome=nome;
        this.endereco=Endereco;
        this.telefone=Telefone;
        this.celular=Celular;
        
    }
    
}
