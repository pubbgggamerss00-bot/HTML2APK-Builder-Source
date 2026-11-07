package na;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public abstract class b extends zzb {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        ma.e response = (ma.e) zzc.zza(parcel, ma.e.CREATOR);
        enforceNoDataAvail(parcel);
        r.e(status, "status");
        r.e(response, "response");
        v.a(status, response, ((j) this).f18653a);
        return true;
    }
}
