package model;

import java.io.*;
import java.util.ArrayList;

public class PessoaFisicaRepo {

    private ArrayList<PessoaFisica> pessoasFisicas;
    private Iterable<PessoaFisica> lista;

    public PessoaFisicaRepo() {
        this.pessoasFisicas = new ArrayList<>();
    }

    public void inserir(PessoaFisica pessoa) {
        this.pessoasFisicas.add(pessoa);
    }

    public void alterar(PessoaFisica pessoa) {
        int index = obterIndex(pessoa.getId());
        if (index >= 0) {
            this.pessoasFisicas.set(index, pessoa);
        }
    }

    public void excluir(int id) {
        int index = obterIndex(id);
        if (index >= 0) {
            this.pessoasFisicas.remove(index);
            System.out.println("Pessoa física excluída com sucesso.");
        } else {
            System.out.println("Pessoa física não encontrada.");
        }
    }

    public PessoaFisica obter(int id) {
        for (PessoaFisica pessoa : this.pessoasFisicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    public ArrayList<PessoaFisica> obterTodos() {
        return this.pessoasFisicas;
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(pessoasFisicas);
        }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoasFisicas = (ArrayList<PessoaFisica>) inputStream.readObject();
        }
    }

    private int obterIndex(int id) {
        for (int i = 0; i < this.pessoasFisicas.size(); i++) {
            PessoaFisica pessoa = this.pessoasFisicas.get(i);
            if (pessoa.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void setNome(int id, String nome) {
        PessoaFisica pessoa = obter(id);
        if (pessoa != null) {
            pessoa.setNome(nome);
        }
    }

    public void setCpf(int id, String cpf) {
        PessoaFisica pessoa = obter(id);
        if (pessoa != null) {
            pessoa.setCpf(cpf);
        }
    }

    public void setCnpj(int id, String cnpj) {
        // Implementação da função setCnpj
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNome(int id) {
        PessoaFisica pessoa = obter(id);
        if (pessoa != null) {
            return pessoa.getNome();
        }
        return null;
    }

    public String getCpf(int id) {
        PessoaFisica pessoa = obter(id);
        if (pessoa != null) {
            return pessoa.getCpf();
        }
        return null;
    }

    public String getCnpj() {
        // Implementação da função getCnpj
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void incluir(PessoaFisica fisica) {
        this.pessoasFisicas.add(fisica);
    }
     public void alterar(int id, PessoaFisica fisica) {
    PessoaFisica pessoaExistente = obter(id);
    if (pessoaExistente != null) {
        pessoaExistente.setNome(fisica.getNome());
        pessoaExistente.setCpf(fisica.getCpf());
    } else {
        System.out.println("Pessoa física não encontrada.");
    }
    
}
     public void salvarDados(BufferedWriter bufferedWriter) throws IOException {
    for (PessoaFisica fisica : lista) {
        bufferedWriter.write("F");
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(fisica.getId()));
        bufferedWriter.newLine();
        bufferedWriter.write(fisica.getNome());
        bufferedWriter.newLine();
        bufferedWriter.write(fisica.getCpf());
        bufferedWriter.newLine();
    }
}

    public ArrayList<PessoaFisica> getLista() {
        return pessoasFisicas;
    }

    public void setLista(ArrayList<PessoaFisica> pessoas) {
        this.pessoasFisicas.clear();
        this.pessoasFisicas.addAll(pessoas);
    }

    public PessoaFisica buscar(int id) {
        for (PessoaFisica pessoa : this.pessoasFisicas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }
}
