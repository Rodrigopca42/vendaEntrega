package aplicacao;

import java.util.Date;

import entities.Ordem;
import entities.enums.StatusDeOrdem;

public class Programa {

	public static void main(String[] args) {
		
		Ordem ordem = new Ordem(1080, new Date(), StatusDeOrdem.PAGAMENTOS_PENDENTES);

		System.out.println(ordem);
		
		StatusDeOrdem os1 = StatusDeOrdem.ENTREGUE;
		
		StatusDeOrdem os2 = StatusDeOrdem.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

}
