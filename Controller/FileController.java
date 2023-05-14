package Controller;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author auxlu
 */
public abstract class FileController {
     protected File archive = null;
     protected boolean modified;

    public abstract boolean read();

    public abstract boolean write(boolean append);

    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return archive;
    }

    /**
     * @param TextoBotao o texto para o botão de escolha do usuário
     */
    public void setArchive(String text) {
        archive = null;
        String initialFolder = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(initialFolder);
        if (chooser.showDialog(null, text) == JFileChooser.APPROVE_OPTION) {
            archive = chooser.getSelectedFile();
        }
    }
}
