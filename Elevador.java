/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elevador;

import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class Elevador extends Elevadores {
    int andar;
    int total;
    int capacidade;
    int pessoas;
    
    public void Incializa(int c, int t)
    {
        this.capacidade = c;
        this.total = t;
        this.andar = 0;
        JOptionPane.showMessageDialog(null, "Elevador Criado!");
        
        
    }
    public void Entra()
    {
        
        this.pessoas = this.pessoas+1;
        
        
    }
    public void Sai()
    {
        
        this.pessoas = this.pessoas-1;
        
    }
    public void Sobe()
    {
        
         this.andar = this.andar+1;
        
        
    }
    public void Desce()
    {
        
        this.andar = this.andar-1;
        
    }
    
 
    
    
}
