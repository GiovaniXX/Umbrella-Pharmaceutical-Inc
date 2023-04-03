import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample extends JFrame {

    public MenuExample() {
        super("Exemplo de Menu");

        // Criar barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Criar menu "Arquivo"
        JMenu menuArquivo = new JMenu("Arquivo");

        // Criar item de menu "Abrir"
        JMenuItem itemAbrir = new JMenuItem("Abrir");

        // Adicionar ação ao item de menu "Abrir"
        itemAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirUrl("https://www.google.com");
            }
        });

        // Adicionar item de menu "Abrir" ao menu "Arquivo"
        menuArquivo.add(itemAbrir);

        // Adicionar menu "Arquivo" à barra de menu
        menuBar.add(menuArquivo);

        // Adicionar barra de menu ao frame
        setJMenuBar(menuBar);

        // Configurações do frame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método para abrir URL
    private void abrirUrl(String url) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(url));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}

/*
Para abrir uma URL através de um JMenuItem em Java, 
você pode usar a classe Desktop para abrir o navegador 
padrão do sistema com a URL desejada.
Neste exemplo, criamos um JMenuItem "Abrir" e adicionamos 
uma ação que chama o método abrirUrl quando o item é clicado. 
O método abrirUrl usa a classe Desktop para abrir o navegador 
padrão com a URL desejada.

Note que, dependendo do sistema operacional, pode ser necessário 
configurar o sistema para permitir que o programa abra um navegador padrão.
*/