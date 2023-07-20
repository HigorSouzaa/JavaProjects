package classes;
import javax.swing.JOptionPane;


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;





public class ListaNomesList{
	private Usuario[] usuarios;
	private int indice;
	List<String> nomes = new ArrayList<>(); //criando uma matriz dinâmica
	public static void main(String[] args) {
	String[] menu={"Cadastrar","Pesquisar","Alterar","Deletar","Mostrar","Ordenar","Limpar", "Sair"}; 
	String opcao;
	ListaNomesList lista = new ListaNomesList();
	do {// laço de repetição
	opcao = (String) JOptionPane.showInputDialog(null,"Escolha uma opção", "Cadastro"
	, JOptionPane.INFORMATION_MESSAGE,null, menu, "Cadastrar"); //menu
	switch (opcao) {//testar as minhas opções
	case "Cadastrar":  lista.cadastrarDados();;break;
	case "Pesquisar":lista.pesquisarNomes(); break;
	case "Alterar": lista.alterar(); break;
	case "Deletar":lista.deletarDados();break;
	case "Mostrar": lista.mostrarDados(); break;
	case "Ordenar": lista.mostrarDadosOrdenado();; break;
	case "Limpar": lista.limparDados(); break;
	}
	} while (!opcao.equals("Sair"));
	}
	private void cadastrarDados() {
		// TODO Auto-generated method stub
		nomes.add(JOptionPane.showInputDialog("Entre com um nome a ser Cadastrado : "));
		
			
			TelaCadastro cadastro= new TelaCadastro("Cadastro",usuarios,indice);
			cadastro.setVisible(true);
			indice ++;
		
		
		
		
	}
	private void pesquisarNomes() {
		if (!nomes.isEmpty()) {
			String nomePesqu = JOptionPane.showInputDialog( "Entre com um nome a ser pesquisado: ");
			if (nomes.contains(nomePesqu)) {
				JOptionPane.showMessageDialog(null, (nomes.indexOf(nomePesqu)+1) + "º  - "+ nomePesqu);
			} else {
				JOptionPane.showMessageDialog(null, "Nâo existe este nome na lista ");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Nâo existe nomes na lista ");
		}
		
		
	}
	private void alterar() {
		// TODO Auto-generated method stub
		int indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o indice do nome a ser alterado : "));
		
		if (indice <=nomes.size()&& indice>=1) {
			String nomeAlt = JOptionPane.showInputDialog("Entre com o nome a ser alterado: ");
			nomes.set(indice -1, nomeAlt);
			JOptionPane.showMessageDialog(null,nomes.get( indice-1)+"Foi Alterado para :"+ nomeAlt);
			nomes.set(indice -1, nomeAlt);
		} else {
			JOptionPane.showMessageDialog(null, "Nâo existe este indice na lista : ");
		}
	}
	private void deletarDados() {
		// TODO Auto-generated method stub
		String nomeDel = JOptionPane.showInputDialog("Entre com o nome a ser deletado: ");
		if (nomes.remove(nomeDel)) {
			JOptionPane.showMessageDialog(null, "Removido com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Nâo existe esse nome na lista ");
		}
		
		
	}
	private void mostrarDados() {
		System.out.println("Nomes");
		/*for (int i = 0; i < nomes.size(); i++) {
			//JOptionPane.showMessageDialog(null, nomes);
			System.out.println(nomes.get(i));	
		}*/
		for (String nome : nomes) {
			System.out.println((nomes.indexOf(nome)+1)+"º"+" - "+nome);//index pega o indice do objeto.
		}
		
		
	}
	private void mostrarDadosOrdenado() {
		// TODO Auto-generated method stub
		nomes.sort(null);
		System.out.println("Nomes");
		for (String nome : nomes) {
			System.out.println((nomes.indexOf(nome)+1)+"º"+" - "+nome);//index pega o indice do objeto.
		}
		
		
	}
	private void limparDados() {
		nomes.clear();
		//nomes.removeAll(nomes);
		
	}

}
