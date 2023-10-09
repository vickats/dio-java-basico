package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
//		Impressora impressora = new Deskjet();
//		Impressora impressora = new Laserjet();
//		Impressora impressora = new EquipamentoMultifuncional();
		
		// equipamento que implementa todas interfaces
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		// interfaces
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
