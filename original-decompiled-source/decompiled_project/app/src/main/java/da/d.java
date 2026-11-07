package da;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: classes2.dex */
public final class d extends zza implements f {
    @Override // da.f
    public final void B(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzc(1, parcelZza);
    }

    @Override // da.f
    public final void g(c cVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, cVar);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // da.f
    public final void u(c cVar, Account account) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, cVar);
        zzc.zzc(parcelZza, account);
        zzc(3, parcelZza);
    }
}
