/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Aluno
 */
public class Controle extends absPropriedades
{
    public Controle(String lado1, String lado2, String lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.Executar();
    }
    private void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(lado1,lado2,lado3);
        if (validacao.mensagem.equals(""))
        {
        Triangulos triangulos = new Triangulos(validacao.l1, validacao.l2, validacao.l3);
        }
        else
        {
         this.mensagem = validacao.mensagem;   
        }         
    }
    
}
