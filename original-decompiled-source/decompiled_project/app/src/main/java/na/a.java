package na;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public abstract class a extends zzb {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean zZzd = zzc.zzd(parcel);
        enforceNoDataAvail(parcel);
        r.e(status, "status");
        v.a(status, Boolean.valueOf(zZzd), ((i) this).f18652a);
        return true;
    }
}
