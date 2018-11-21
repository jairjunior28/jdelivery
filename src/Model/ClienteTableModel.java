/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jairjunior
 */
public class ClienteTableModel extends AbstractTableModel {
// Lista de Sócios a serem exibidos na tabela

    private List<Cliente> linhas;
    private String[] colunas = new String[]{"codcadastroclientes", "nome", "nascimento", "ativo", "endereco", "numero", "bairro", "cidade",
        "estado", "complemento", "cep", "email", "site", "pontoreferencia", "ativaconveniado", "telefone", "celular", "fax", "fisica", "juridica",
        "cpf", "rg", "cnpj", "inscricaoestadual", "observacoes", "datacadastro", "limitecredito", "totalfaturas", "juros", "multa", "diabompagamento",
        "enderecoentrega", "numeroentrega", "bairroentrega", "cidadeentrega", "estadoentrega", "complementoentrega", "cepentrega", "pontoreferenciaentrega",
        "usaentrega", "chequebloqueado", "limitecheque", "incluiipinabc", "conveniopormes", "nomefantasia", "permiteconveniovinculado", "placa", "modelo",
        "marca", "ano", "cor", "pais", "docestrangeiro", "estrangeiro", "creditoconvenio", "conveniopormescr", "juroscr", "multacr", "diabompagamentocr",
        "limitecreditocr", "limitecontasreceber", "limiteutilizadocontasreceber", "funcionario", "pispasep", "numerocarteira", "seriecarteira", "ufcarteira"};
    private static final int CODCADASTRCLIENTES = 0;
    private static final int NOME = 1;
    private static final int NASCIMENTO = 2;
    private static final int ATIVO = 3;
    private static final int ENDERECO = 4;
    private static final int NUMERO = 5;
    private static final int BAIRRO = 6;
    private static final int CIDADE = 7;
    private static final int ESTADO = 8;
    private static final int COMPLEMENTO = 9;
    private static final int CEP = 10;
    private static final int EMAIL = 11;
    private static final int SITE = 12;
    private static final int PONTOREFERENCIA = 13;
    private static final int ATIVACONVENIADO = 14;
    private static final int TELEFONE = 15;
    private static final int CELULAR = 16;
    private static final int FAX = 17;
    private static final int FISICA = 18;
    private static final int JURIDICA = 19;
    private static final int CPF = 20;
    private static final int RG = 21;
    private static final int CNPJ = 22;
    private static final int INCRICAOESTADUAL = 23;
    private static final int OBSERVACOES = 24;
    private static final int DATACADASTRO = 25;
    private static final int LIMITECREDITO = 26;
    private static final int TOTALFATURAS = 27;
    private static final int JUROS = 28;
    private static final int MULTA = 29;
    private static final int DIABOMPAGAMENTO = 30;
    private static final int ENDERECOENTREGA = 31;
    private static final int NUMEROENTREGA = 32;
    private static final int BAIRROENTREGA = 33;
    private static final int CIDADEENTREGA = 34;
    private static final int ESTADOENTREGA = 35;
    private static final int COMPLEMENTOENTREGA = 36;
    private static final int CEPENTREGA = 37;
    private static final int PONTOREFERENCIAENTREGA = 38;
    private static final int USAENTREGA = 39;
    private static final int CHEQUEBLOQUEADO = 40;
    private static final int LIMITECHEQUE = 41;
    private static final int INCLUIIPINABC = 42;
    private static final int CONVENIOPORMES = 43;
    private static final int NOMEFANTASIA = 44;
    private static final int PERMITECONVENIOVINCULADO = 45;
    private static final int PLACA = 46, MODELO = 47, MARCA = 48, ANO = 49, COR = 50, PAIS = 51, DOCESTRANGEIRO = 52;
    private static final int ESTRANGEIRO = 53;
    private static final int CREDITOCONVENIO = 54;
    private static final int CONVENIOPORMESCR = 55;
    private static final int JUROSCR = 56, MULTACR = 57;
    private static final int DIABOMPAGAMENTOCR = 58;
    private static final int LIMITECREDITOCR = 59, LIMITECONTASRECEBER = 60, LIMITEUTILIZADOCONTASRECEBER = 61;
    private static final int FUNCIONARIO = 62;
    private static final int PISPASEP = 63, NUMEROCARTEIRA = 64, SERIECARTEIRA = 65, UFCARTEIRA = 66;

    // Cria um SocioTableModel sem nenhuma linha
    public ClienteTableModel() {
        linhas = new ArrayList<Cliente>();
    }

    // Cria um SocioTableModel contendo a lista recebida por parâmetro
    public ClienteTableModel(List<Cliente> listaDeClientes) {
        linhas = new ArrayList<Cliente>(listaDeClientes);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case CODCADASTRCLIENTES:
                return String.class;
            case NOME:
                return String.class;
            case NASCIMENTO:
                return String.class;
            case ATIVO:
                return String.class;
            case ENDERECO:
                return String.class;
            case NUMERO:
                return String.class;
            case BAIRRO:
                return String.class;
            case CIDADE:
                return String.class;
            case ESTADO:
                return String.class;
            case COMPLEMENTO:
                return String.class;
            case CEP:
                return String.class;
            case EMAIL:
                return String.class;
            case SITE:
                return String.class;
            case PONTOREFERENCIA:
                return String.class;
            case ATIVACONVENIADO:
                return String.class;
            case TELEFONE:
                return String.class;
            case CELULAR:
                return String.class;
            case FAX:
                return String.class;
            case FISICA:
                return String.class;
            case JURIDICA:
                return String.class;
            case CPF:
                return String.class;
            case RG:
                return String.class;
            case CNPJ:
                return String.class;
            case INCRICAOESTADUAL:
                return String.class;
            case OBSERVACOES:
                return String.class;
            case DATACADASTRO:
                return String.class;
            case LIMITECREDITO:
                return String.class;
            case TOTALFATURAS:
                return String.class;
            case JUROS:
                return String.class;
            case MULTA:
                return String.class;
            case DIABOMPAGAMENTO:
                return String.class;
            case ENDERECOENTREGA:
                return String.class;
            case NUMEROENTREGA:
                return String.class;
            case BAIRROENTREGA:
                return String.class;
            case CIDADEENTREGA:
                return String.class;
            case ESTADOENTREGA:
                return String.class;
            case COMPLEMENTOENTREGA:
                return String.class;
            case CEPENTREGA:
                return String.class;
            case PONTOREFERENCIAENTREGA:
                return String.class;
            case USAENTREGA:
                return String.class;
            case CHEQUEBLOQUEADO:
                return String.class;
            case LIMITECHEQUE:
                return String.class;
            case INCLUIIPINABC:
                return String.class;
            case CONVENIOPORMES:
                return String.class;
            case NOMEFANTASIA:
                return String.class;
            case PERMITECONVENIOVINCULADO:
                return String.class;
            case PLACA:
                return String.class;
            case MODELO:
                return String.class;
            case MARCA:
                return String.class;
            case ANO:
                return String.class;
            case COR:
                return String.class;
            case PAIS:
                return String.class;
            case DOCESTRANGEIRO:
                return String.class;
            case ESTRANGEIRO:
                return String.class;
            case CREDITOCONVENIO:
                return String.class;
            case CONVENIOPORMESCR:
                return String.class;
            case JUROSCR:
                return String.class;
            case MULTACR:
                return String.class;
            case DIABOMPAGAMENTOCR:
                return String.class;
            case LIMITECREDITOCR:
                return String.class;
            case LIMITECONTASRECEBER:
                return String.class;
            case LIMITEUTILIZADOCONTASRECEBER:
                return String.class;
            case FUNCIONARIO:
                return String.class;
            case PISPASEP:
                return String.class;
            case NUMEROCARTEIRA:
                return String.class;
            case SERIECARTEIRA:
                return String.class;
            case UFCARTEIRA:
                return String.class;
            default:
                // 
                throw new IndexOutOfBoundsException("Indeice de coluna fora da faixa existente");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Cliente cliente = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODCADASTRCLIENTES:
                return cliente.getCodcadastroclientes();
            case NOME:
                return cliente.getNome();
            case NASCIMENTO:
                return cliente.getNascimento();
            case ATIVO:
                return cliente.isAtivo();
            case ENDERECO:
                return cliente.getEndereco();
            case NUMERO:
                return cliente.getNumero();
            case BAIRRO:
                return cliente.getBairro();
            case CIDADE:
                return cliente.getCidade();
            case ESTADO:
                return cliente.getEstado();
            case COMPLEMENTO:
                return cliente.getComplemento();
            case CEP:
                return cliente.getCep();
            case EMAIL:
                return cliente.getEmail();
            case SITE:
                return cliente.getSite();
            case PONTOREFERENCIA:
                return cliente.getPontoreferencia();
            case ATIVACONVENIADO:
                return cliente.isAtivaconveniado();
            case TELEFONE:
                return cliente.getTelefone();
            case CELULAR:
                return cliente.getCelular();
            case FAX:
                return cliente.getFax();
            case FISICA:
                return cliente.isFisica();
            case JURIDICA:
                return cliente.isJuridica();
            case CPF:
                return cliente.getCpf();
            case RG:
                return cliente.getRg();
            case CNPJ:
                return cliente.getCnpj();
            case INCRICAOESTADUAL:
                return cliente.getIncricaoestadual();
            case OBSERVACOES:
                return cliente.getObservacoes();
            case DATACADASTRO:
                return cliente.getDatacadastro();
            case LIMITECREDITO:
                return cliente.getLimitecredito();
            case TOTALFATURAS:
                return cliente.getTotalfaturas();
            case JUROS:
                return cliente.getJuros();
            case MULTA:
                return cliente.getMulta();
            case DIABOMPAGAMENTO:
                return cliente.getDiabompagamento();
            case ENDERECOENTREGA:
                return cliente.getEnderecoentrega();
            case NUMEROENTREGA:
                return cliente.getNumeroentrega();
            case BAIRROENTREGA:
                return cliente.getBairroentrega();
            case CIDADEENTREGA:
                return cliente.getCidadeentrega();
            case ESTADOENTREGA:
                return cliente.getEstadoentrega();
            case COMPLEMENTOENTREGA:
                return cliente.getComplementoentrega();
            case CEPENTREGA:
                return cliente.getCepentrega();
            case PONTOREFERENCIAENTREGA:
                return cliente.getPontoreferenciaentrega();
            case USAENTREGA:
                return cliente.isUsaentrega();
            case CHEQUEBLOQUEADO:
                return cliente.isChequebloqueado();
            case LIMITECHEQUE:
                return cliente.getLimitecheque();
            case INCLUIIPINABC:
                return cliente.isIncluiipinabc();
            case CONVENIOPORMES:
                return cliente.isConveniopormes();
            case NOMEFANTASIA:
                return cliente.getNomefantasia();
            case PERMITECONVENIOVINCULADO:
                return cliente.isPermiteconveniovinculado();
            case PLACA:
                return cliente.getPlaca();
            case MODELO:
                return cliente.getModelo();
            case MARCA:
                return cliente.getMarca();
            case ANO:
                return cliente.getAno();
            case COR:
                return cliente.getCor();
            case PAIS:
                return cliente.getPais();
            case DOCESTRANGEIRO:
                return cliente.getDocestrangeiro();
            case ESTRANGEIRO:
                return cliente.isEstrangeiro();
            case CREDITOCONVENIO:
                return cliente.getCreditoconvenio();
            case CONVENIOPORMESCR:
                return cliente.isConveniopormescr();
            case JUROSCR:
                return cliente.getJuroscr();
            case MULTACR:
                return cliente.getMultacr();
            case DIABOMPAGAMENTOCR:
                return cliente.getDiabompagamentocr();
            case LIMITECREDITOCR:
                return cliente.getLimitecreditocr();
            case LIMITECONTASRECEBER:
                return cliente.getLimitecontasreceber();
            case LIMITEUTILIZADOCONTASRECEBER:
                return cliente.getLimiteutilizadocontasreceber();
            case FUNCIONARIO:
                return cliente.isFuncionario();
            case PISPASEP:
                return cliente.getPispasep();
            case NUMEROCARTEIRA:
                return cliente.getNumerocarteira();
            case SERIECARTEIRA:
                return cliente.getSeriecarteira();
            case UFCARTEIRA:
                return cliente.getUfcarteira();
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("Indice de colunda fora da faixa existente");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        Cliente cliente = linhas.get(rowIndex);

        switch (columnIndex) {
            case CODCADASTRCLIENTES:
                cliente.setCodcadastroclientes((int) aValue);
                break;
            case NOME:
                cliente.setNome((String) aValue);
                break;
            case NASCIMENTO:
                cliente.setNascimento((Date) aValue);
                break;
            case ATIVO:
                cliente.setAtivo((boolean) aValue);
                break;
            case ENDERECO:
                cliente.setEndereco((String) aValue);
                break;
            case NUMERO:
                cliente.setNumero((int) aValue);
                break;
            case BAIRRO:
                cliente.setBairro((String) aValue);
                break;
            case CIDADE:
                cliente.setCidade((String) aValue);
                break;
            case ESTADO:
                cliente.setEstado((String) aValue);
                break;
            case COMPLEMENTO:
                cliente.setComplemento((String) aValue);
                break;
            case CEP:
                cliente.setCep((String) aValue);
                break;
            case EMAIL:
                cliente.setEmail((String) aValue);
                break;
            case SITE:
                cliente.setSite((String) aValue);
                break;
            case PONTOREFERENCIA:
                cliente.setPontoreferencia((String) aValue);
                break;
            case ATIVACONVENIADO:
                cliente.setAtivaconveniado((boolean) aValue);
                break;
            case TELEFONE:
                cliente.setTelefone((String) aValue);
                break;
            case CELULAR:
                cliente.setCelular((String) aValue);
                break;
            case FAX:
                cliente.setFax((String) aValue);
                break;
            case FISICA:
                cliente.setFisica((boolean) aValue);
                break;
            case JURIDICA:
                cliente.setJuridica((boolean) aValue);
                break;
            case CPF:
                cliente.setCpf((String) aValue);
                break;
            case RG:
                cliente.setRg((String) aValue);
                break;
            case CNPJ:
                cliente.setCnpj((String) aValue);
                break;
            case INCRICAOESTADUAL:
                cliente.setIncricaoestadual((String) aValue);
                break;
            case OBSERVACOES:
                cliente.setObservacoes((String) aValue);
                break;
            case DATACADASTRO:
                cliente.setDatacadastro((Date) aValue);
                break;
            case LIMITECREDITO:
                cliente.setLimitecredito((float) aValue);
                break;
            case TOTALFATURAS:
                cliente.setTotalfaturas((float) aValue);
                break;
            case JUROS:
                cliente.setJuros((float) aValue);
                break;
            case MULTA:
                cliente.setMulta((float) aValue);
                break;
            case DIABOMPAGAMENTO:
                cliente.setDiabompagamento((Date) aValue);
                break;
            case ENDERECOENTREGA:
                cliente.setEnderecoentrega((String) aValue);
                break;
            case NUMEROENTREGA:
                cliente.setNumeroentrega((int)aValue);
                 break;
            case BAIRROENTREGA:
                cliente.setBairroentrega((String)aValue);
                 break;
            case CIDADEENTREGA:
                cliente.setCidadeentrega((String)aValue);
                 break;
            case ESTADOENTREGA:
                cliente.setEstadoentrega((String)aValue);
                 break;
            case COMPLEMENTOENTREGA:
                cliente.setComplementoentrega((String)aValue);
                 break;
            case CEPENTREGA:
                cliente.setCepentrega((String)aValue);
                 break;
            case PONTOREFERENCIAENTREGA:
                cliente.setPontoreferenciaentrega((String)aValue);
                 break;
            case USAENTREGA:
                cliente.setUsaentrega((boolean)aValue);
                 break;
            case CHEQUEBLOQUEADO:
                cliente.setChequebloqueado((boolean)aValue);
                 break;
            case LIMITECHEQUE:
                cliente.setLimitecheque((float)aValue);
                 break;
            case INCLUIIPINABC:
                cliente.setIncluiipinabc((boolean)aValue);
                 break;
            case CONVENIOPORMES:
                cliente.setConveniopormes((boolean)aValue);
                 break;
            case NOMEFANTASIA:
                cliente.setNomefantasia((String)aValue);
                 break;
            case PERMITECONVENIOVINCULADO:
                cliente.setPermiteconveniovinculado((boolean)aValue);
                 break;
            case PLACA:
                cliente.setPlaca((String)aValue);
                 break;
            case MODELO:
                cliente.setModelo((String)aValue);
                 break;
            case MARCA:
                cliente.setMarca((String)aValue);
                 break;
            case ANO:
                cliente.setAno((String)aValue);
                 break;
            case COR:
                cliente.setCor((String)aValue);
                 break;
            case PAIS:
                cliente.setPais((String)aValue);
                 break;
            case DOCESTRANGEIRO:
                cliente.setDocestrangeiro((String)aValue);
                 break;
            case ESTRANGEIRO:
                cliente.setEstrangeiro((boolean)aValue);
                 break;
            case CREDITOCONVENIO:
                cliente.setCreditoconvenio((float)aValue);
                 break;
            case CONVENIOPORMESCR:
                cliente.setConveniopormescr((boolean)aValue);
                 break;
            case JUROSCR:
                cliente.setJuroscr((float)aValue);
                 break;
            case MULTACR:
                cliente.setMultacr((float)aValue);
                 break;
            case DIABOMPAGAMENTOCR:
                cliente.setDiabompagamentocr((String)aValue);
                 break;
            case LIMITECREDITOCR:
                cliente.setLimitecreditocr((float)aValue);
                 break;
            case LIMITECONTASRECEBER:
                cliente.setLimitecontasreceber((float)aValue);
                 break;
            case LIMITEUTILIZADOCONTASRECEBER:
                cliente.setLimiteutilizadocontasreceber((float)aValue);
                 break;
            case FUNCIONARIO:
                cliente.setFuncionario((boolean)aValue);
                 break;
            case PISPASEP:
                cliente.setPispasep((String)aValue);
                 break;
            case NUMEROCARTEIRA:
                cliente.setNumerocarteira((String)aValue);
                 break;
            case SERIECARTEIRA:
                cliente.setSeriecarteira((String)aValue);
                 break;
            case UFCARTEIRA:
               cliente.setUfcarteira((String)aValue);
                 break;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("Indice de coluna fora da faixa existente");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

}
