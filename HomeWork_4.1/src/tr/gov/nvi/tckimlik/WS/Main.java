package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("32956771864"),
				"C�HAN",
				"��ELL�LER",
				2001);
		System.out.println("Do�rulama: "+(result?"ba�ar�l�":"ba�ar�s�z"));

	}

}
