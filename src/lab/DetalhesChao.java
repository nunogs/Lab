package lab;

import javax.swing.*;

public class DetalhesChao{
    private int tamDetalhesX;
    private int tamDetalhesY;
    private int posDetalhesX;
    private int posDetalhesY;
    private ImageIcon iDetalhes;
    private JLabel lDetalhes;


    public DetalhesChao() {
        this.tamDetalhesX = 300;
        this.tamDetalhesY = 80;
        this.posDetalhesX = 0;
        this.posDetalhesY = 370;
        this.iDetalhes = new ImageIcon(getClass().getResource("res\\detalhechao.png"));
        this.lDetalhes = new JLabel(this.iDetalhes);
        this.lDetalhes.setBounds(this.posDetalhesX, this.posDetalhesY, this.tamDetalhesX, this.tamDetalhesY);
        this.lDetalhes.setVisible(true);

    }



    public int getTamDetalhesX() {
        return tamDetalhesX;
    }

    public int getTamDetalhesY() {
        return tamDetalhesY;
    }

    public int getPosDetalhesX() {
        return posDetalhesX;
    }


    public int getPosDetalhesY() {
        return posDetalhesY;
    }

    public ImageIcon getiDetalhes() {
        return iDetalhes;
    }

    public JLabel getlDetalhes() {
        return lDetalhes;
    }

}
