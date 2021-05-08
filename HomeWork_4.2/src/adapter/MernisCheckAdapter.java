package adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import abstracts.UserCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) throws RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(Locale.ROOT), user.getLastName().toUpperCase(Locale.ROOT), user.getDateOfBirth().getYear());
	}
}
