pacote  atividade_3 ;

import  javax.swing.JOptionPane ;

/ **
 * 
* @ autor Cleverson Mendes Faria
 *
 * /

/ *   QUADRO DE REFERÊNCIA - RESULTADOS IMC
-----------------------------------------------
[Resultado] [Situação]	
-----------------------------------------------			
 Abaixo de 17 Muito abaixo do peso
 Entre 17 e 18,49 Abaixo do peso
 Entre 18,50 e 24,99 Peso normal
 Entre 25 e 29,99 Acima do peso
 Entre 30 e 34,99 Obesidade I
 Entre 35 e 39,99 Obesidade II (severa)
 Acima de 40 Obesidade III (mórbida) 
---------------------------------------------- * /

 classe  pública Calculadora_IMC {
	
	// METODO PRINCIPAL ()
	public  static  void  main ( String [] args ) {
		
		peso duplo =  0 , altura =  0 ;
		
		tente {
			// LEITURA DO PESO
			String entrada1 =  JOptionPane . showInputDialog ( " Informe o seu peso em (Kg): \ n Exemplo: 74.50 (utilize ponto) " );
			if (entrada1 ! =  null )
				peso =  duplo . parseDouble (entrada1);
				// LEITURA DA ALTURA
				String entrada2 =  JOptionPane . showInputDialog ( " Informe sua altura em (cm): \ n Exemplo: 175 " );
				if (entrada2 ! =  null )
					altura =  Duplo . parseDouble (entrada2);
					// CHAMA O MÉTODO P / CALCULAR O IMC
					cálculo_imc (peso, altura / 100 );
		// Erro
		} captura ( exceção e) {
			JOptionPane . showMessageDialog ( null , " Ocorreu um erro no programa! \ n Erro: "  + e, " Erro " , 0 );
		}
	}
	
	// METODO CALCULA_IMC ()
	público  estático  vazio  calcula_imc ( double  peso , dupla  altura ) {
		imc duplo = peso / (altura * altura);
		// CHAMADA EXTERNA
		processa_mensagem (imc);
	}

	// METODO PROCESSA_MENSAGEM ()
	public  static  void  processa_mensagem ( valor duplo  ) {
		
		imc duplo = bravura;
		
		if (imc <  17,00 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Muito abaixo do peso! " , " Resultado " , 1 );
		 caso contrário, se (imc > =  17,00  && imc <=  18,49 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Abaixo do peso! " , " Resultado " , 1 );
		 caso contrário, se (imc > =  18,50  && imc <=  24,99 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Peso normal! " , " Resultado " , 1 );
		 caso contrário, se (imc > =  25,00  && imc <=  29,99 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Acima do peso! " , " Resultado " , 1 );
		 caso contrário, if (imc > =  30.00  && imc <=  34.99 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Obesidade I! " , " Resultado " , 1 );
		 caso contrário, se (imc > =  35,00  && imc <=  39,99 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Obesidade II (severa)! " , " Resultado " , 1 );
		 caso contrário, se (imc > =  40,00 )
			JOptionPane . showMessageDialog ( nulo , " IMC: [ "  +  formato String . ( " % .2f " , imc) +  " ] "
					+  " \ n Situação: Obesidade III (mórbida)! " , " Resultado " , 1 );
		outro
			JOptionPane . showMessageDialog ( null , " Valores informados inválidos! " , " Erro " , 0 );
	}

}