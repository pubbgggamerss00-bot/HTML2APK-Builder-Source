package hb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;

/* loaded from: classes2.dex */
public class p extends zzb implements q {
    public static q zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new o(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }
}
