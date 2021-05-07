package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("32956771864"),
				"CÝHAN",
				"ÝÇELLÝLER",
				2001);
		System.out.println("Doðrulama: "+(result?"baþarýlý":"baþarýsýz"));

	}

}
