package da;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface f extends IInterface {
    void B(boolean z10) throws RemoteException;

    void g(c cVar, String str) throws RemoteException;

    void u(c cVar, Account account) throws RemoteException;
}
