/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Aluno
 */
public class Triangulos extends absPropriedades 
{
    public Triangulos(Double l1, Double l2, Double l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.Executar();
    }
    private void Executar() 
    {
        if (l1==l2 && l2==l3)
            this.resposta = "Triangulo Equilatero";
        else
             if (l1!=l2 && l2!=l3 && l1!=l3)
                this.resposta = "Triangulo Escaleno";
            else
                this.resposta = "Triangulo Isóceles";    
    }
}
