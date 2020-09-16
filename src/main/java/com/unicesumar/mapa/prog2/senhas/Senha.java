/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicesumar.mapa.prog2.senhas;

/**
 *
 * @author Diego
 */
public class Senha {

   private String tipo;

   private int numero;
   

   
   public Senha (String tipo, int numero){
       this.tipo = tipo;
       this.numero = numero;
   }

   public String retornaTipo() {

       return tipo;

   }
   
   public String retornaIdentificacao(){
       String id = this.tipo + "-" + this.numero;
       return id;
   }


   

   

}


