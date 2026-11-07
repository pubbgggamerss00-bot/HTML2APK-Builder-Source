package ab;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import za.a;

/* loaded from: classes2.dex */
public final class f extends zza {
    public final za.a A(za.b bVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i10);
        Parcel parcelZzB = zzB(4, parcelZza);
        za.a aVarB = a.AbstractBinderC0357a.b(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarB;
    }

    public final za.a H(za.b bVar, boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j10);
        Parcel parcelZzB = zzB(7, parcelZza);
        za.a aVarB = a.AbstractBinderC0357a.b(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarB;
    }

    public final za.a b(za.b bVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i10);
        Parcel parcelZzB = zzB(2, parcelZza);
        za.a aVarB = a.AbstractBinderC0357a.b(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarB;
    }

    public final za.a c(za.b bVar, int i10, za.b bVar2) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
        parcelZza.writeInt(i10);
        zzc.zze(parcelZza, bVar2);
        Parcel parcelZzB = zzB(8, parcelZza);
        za.a aVarB = a.AbstractBinderC0357a.b(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return aVarB;
    }
}
