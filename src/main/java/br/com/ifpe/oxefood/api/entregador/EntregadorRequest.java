package br.com.ifpe.oxefood.api.entregador;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {
     private String Nome;
  
   private String Cpf;
   
   private String Rg;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate DataNascimento;
  
   private String FoneCelular;
  
   private String FoneFixo;
    
   private String QtdEntregasRealizadas;

   
   private String ValordeFrete;

   private String Rua;

  
   private int Numero;
   
   private String Bairro;

    
   private String Cidade;

   
   private int Cep;

        
   private int UF;
    
    
   private String Complemento;



   public Entregador build() {

       return Entregador.builder()
               .nome(Nome)
               .cpf(Cpf)
               .rg(Rg)
               .dataNascimento(DataNascimento)
               .foneCelular(FoneCelular)
               .foneFixo(FoneFixo)
               .qtdEntregasRealizada(QtdEntregasRealizadas)
               .valordeFrete(ValordeFrete)
               .rua(Rua)
               .numero( Numero)
               .bairro(Bairro)
               .cidade(Cidade)
               .cep(Cep)
               .uf( UF)
               .complemento(Complemento)
               .build();
   }
}


 

