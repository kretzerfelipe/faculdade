/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class LancamentoRepositoryCSV implements LancamentoRepository {

    final private String diretorio = "src/main/java/resources/data.csv";

    @Override
    public void saveLancamento(Lancamento lancamento) {
        File arquivo = new File(diretorio);

        if (!arquivo.exists()) {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
                }
            } catch (IOException e) {
                System.err.println("Erro ao criar o arquivo: " + e.getMessage());
                return;
            }
        }

        try (FileWriter writer = new FileWriter(new File(diretorio), true)) {
            StringBuilder sb = new StringBuilder();

            sb.append(lancamento.getClass().getSimpleName()).append(";");

            sb.append(lancamento.getValor()).append(";");
            sb.append(lancamento.getDataFormatada()).append(";");

            if (lancamento instanceof Receita) {
                sb.append(((Receita) lancamento).getCategoriaReceita());
            } else if (lancamento instanceof Despesa) {
                sb.append(((Despesa) lancamento).getCategoriaDespesa());
            }

            sb.append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            System.err.println("Erro ao salvar o lançamento: " + e.getMessage());
        }
    }

    ;
    
    @Override
    public List<Lancamento> getLancamentos() {
        List<Lancamento> lancamentos = new ArrayList<>();
        File arquivo = new File(diretorio);

        // Verifica se o arquivo existe
        if (!arquivo.exists()) {
            System.err.println("O arquivo de lançamentos não foi encontrado: " + arquivo.getAbsolutePath());
            return lancamentos; // Retorna lista vazia
        }

        // Define o formato da data usada no CSV
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(";");

                if (campos.length >= 3) {
                    String tipo = campos[0]; // Tipo: Receita ou Despesa
                    double valor = Double.parseDouble(campos[1]); // Valor
                    Date data = formatoData.parse(campos[2]); // Converte a data para o tipo Date

                    if ("Receita".equalsIgnoreCase(tipo)) {
                        String categoriaReceitaStr = campos.length > 3 ? campos[3] : "OUTROS";
                        CategoriaReceita categoriaReceita = CategoriaReceita.valueOf(categoriaReceitaStr.toUpperCase()); // Converte para enum
                        Receita receita = new Receita(valor, data, categoriaReceita);
                        lancamentos.add(receita);
                    } else if ("Despesa".equalsIgnoreCase(tipo)) {
                        String categoriaDespesaStr = campos.length > 3 ? campos[3] : "OUTROS";
                        CategoriaDespesa categoriaDespesa = CategoriaDespesa.valueOf(categoriaDespesaStr.toUpperCase()); // Converte para enum
                        Despesa despesa = new Despesa(valor, data, categoriaDespesa);
                        lancamentos.add(despesa);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de lançamentos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter valor numérico no arquivo CSV: " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("Erro ao converter a data no arquivo CSV: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao converter categoria para enum: " + e.getMessage());
        }

        return lancamentos;
    }
}
