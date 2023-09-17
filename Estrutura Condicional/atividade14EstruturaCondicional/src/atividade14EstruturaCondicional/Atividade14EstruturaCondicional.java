package atividade14EstruturaCondicional;

import javax.swing.JOptionPane;

public class Atividade14EstruturaCondicional {

	public static void main(String[] args) {
		
		String comando;
		
		comando = JOptionPane.showInputDialog("Insira o comando do git:");
		
		
		switch (comando) {
		
		case "git clone":
			JOptionPane.showMessageDialog(null, "/git clone:"
					+ "é um dos muitos comandos do Git. Ele tem como principal proposta clonar todos os arquivos de repositório remoto para um repositório local. Por padrão, todo o histórico de commits, branches e merges são copiados também."
					+ "Exempo:"
					+ "git clone ssh://fulano@exemplo.com/caminho/para/o/meu-projeto.git \r\n"
					+ " cd meu-projeto\r\n"
					+ " # Comece a trabalhar no projeto ");
			break;
		
			
			
		case "git fetch":
			JOptionPane.showMessageDialog(null, "/git fetch:"
					+ " é o comando que informa seu git local que ele deve obter as informações de metadados mais recentes do repositório original (embora ainda não faça a transferência dos dados – é como verificar para ver se há mudanças disponíveis)."
					+ "Exemplo:"
					+ "git fetch    \r\n"
					+ "git diff ...origin");
			break;
			
			
			
		case "git pull":
			JOptionPane.showMessageDialog(null, "/git pull:"
				+ " é usado para buscar e baixar conteúdo de repositórios remotos e fazer a atualização imediata ao repositório local para que os conteúdos sejam iguais."
				+ "Exemplo:"
				+ "git fetch ＜remote＞ seguido de git merge origin/＜current-branch＞");
			break;
			
		}
		

	}

}
