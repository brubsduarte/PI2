package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;
import java.util.Date;

public class ClienteController {

    public static boolean Salvar(int pId, String pNome, String pCPF, String sexo, String rg, String orgaoEmissor, String uf, String estadoCivil, String email, String telefone, String celular, String endereco, String numeroCasa, String complemento, String cep, String estado, String cidade, String bairro, Date dataDeNascimento) {
        //Salvo na memória
        Cliente p = new Cliente(pId, pNome, pCPF, sexo, rg, orgaoEmissor, uf, estadoCivil, email, telefone, celular, endereco, numeroCasa, complemento, cep, estado, cidade, bairro, dataDeNascimento);

        return ClienteDAO.Salvar(p);
    }

    public static boolean Excluir(int indice) {
        return ClienteDAO.Excluir(indice);
    }

    public static boolean Atualizar(int pId, String pNome, String pCPF, String sexo, String rg, String orgaoEmissor, String uf, String estadoCivil, String email, String telefone, String celular, String endereco, String numeroCasa, String complemento, String cep, String estado, String cidade, String bairro, Date dataDeNascimento) {
        Cliente p = new Cliente(pId, pNome, pCPF, sexo, rg, orgaoEmissor, uf, estadoCivil, email, telefone, celular, endereco, numeroCasa, complemento, cep, estado, cidade, bairro, dataDeNascimento);
        return ClienteDAO.Atualizar(p);

    }

    public static ArrayList<String[]> getClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),
                 clientes.get(i).getNome(),
                 String.valueOf(clientes.get(i).getCPF()),
                 clientes.get(i).getSexo(),
                 clientes.get(i).getRg(),
                 clientes.get(i).getOrgaoEmissor(),
                 clientes.get(i).getUf(),
                 clientes.get(i).getEstadoCivil(),
                 clientes.get(i).getEmail(),
                 clientes.get(i).getTelefone(),
                 clientes.get(i).getCelular(),
                 clientes.get(i).getEndereco(),
                 clientes.get(i).getNumeroCasa(),
                 clientes.get(i).getComplemento(),
                 clientes.get(i).getCep(),
                 clientes.get(i).getEstado(),
                 clientes.get(i).getCidade(),
                 clientes.get(i).getBairro(),
                 String.valueOf(clientes.get(i).getDataDeNascimento())});

        }

        return listaClientes;

    }
    public static ArrayList<String[]> getClientesFiltro(int id, String nome, String cpf, String rg) {
        ArrayList<Cliente> clientes = ClienteDAO.filtroCliente(id, nome, cpf, rg);
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),
                 clientes.get(i).getNome(),
                 String.valueOf(clientes.get(i).getCPF()),
                 clientes.get(i).getSexo(),
                 clientes.get(i).getRg(),
                 clientes.get(i).getOrgaoEmissor(),
                 clientes.get(i).getUf(),
                 clientes.get(i).getEstadoCivil(),
                 clientes.get(i).getEmail(),
                 clientes.get(i).getTelefone(),
                 clientes.get(i).getCelular(),
                 clientes.get(i).getEndereco(),
                 clientes.get(i).getNumeroCasa(),
                 clientes.get(i).getComplemento(),
                 clientes.get(i).getCep(),
                 clientes.get(i).getEstado(),
                 clientes.get(i).getCidade(),
                 clientes.get(i).getBairro(),
                 String.valueOf(clientes.get(i).getDataDeNascimento())});

        }

        return listaClientes;

    }

    public static ArrayList<String[]> getClientesPronto() {

        Cliente cliente1 = new Cliente(1, "Gustavo", "213434235", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Cliente cliente2 = new Cliente(2, "Felipe", "131232113", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        Cliente cliente3 = new Cliente(3, "Caio", "213434235", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),
                clientes.get(i).getNome(),
                String.valueOf(clientes.get(i).getCPF()),
                clientes.get(i).getSexo(),
                clientes.get(i).getRg(),
                clientes.get(i).getOrgaoEmissor(),
                clientes.get(i).getUf(),
                clientes.get(i).getEstadoCivil(),
                clientes.get(i).getEmail(),
                clientes.get(i).getTelefone(),
                clientes.get(i).getCelular(),
                clientes.get(i).getEndereco(),
                clientes.get(i).getNumeroCasa(),
                clientes.get(i).getComplemento(),
                clientes.get(i).getCep(),
                clientes.get(i).getEstado(),
                clientes.get(i).getCidade(),
                clientes.get(i).getBairro(),
                String.valueOf(clientes.get(i).getDataDeNascimento())});
        }

        return listaClientes;

    }

    public static ArrayList<Cliente> getAll() {
        return ClienteDAO.getClientes();
    }

}
