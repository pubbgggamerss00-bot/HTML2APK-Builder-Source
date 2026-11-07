package hb;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
public interface u extends IInterface {
    void zzd(LocationResult locationResult) throws RemoteException;

    void zze(LocationAvailability locationAvailability) throws RemoteException;
}
