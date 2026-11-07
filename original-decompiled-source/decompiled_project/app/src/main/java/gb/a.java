package gb;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.identity_credentials.zzb;
import com.google.android.gms.internal.identity_credentials.zzc;
import fb.e0;
import fb.q0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: gb.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0105a extends zzb implements a {
        public AbstractBinderC0105a() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 1:
                    Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                    e0 e0Var = (e0) zzc.zza(parcel, e0.CREATOR);
                    enforceNoDataAvail(parcel);
                    l(status, e0Var);
                    return true;
                case 2:
                    Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status2, "status");
                    throw new UnsupportedOperationException();
                case 3:
                    Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status3, "status");
                    throw new UnsupportedOperationException();
                case 4:
                    Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status4, "status");
                    throw new UnsupportedOperationException();
                case 5:
                    Status status5 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status5, "status");
                    throw new UnsupportedOperationException();
                case 6:
                    Status status6 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status6, "status");
                    throw new UnsupportedOperationException();
                case 7:
                    Status status7 = (Status) zzc.zza(parcel, Status.CREATOR);
                    fb.k kVar = (fb.k) zzc.zza(parcel, fb.k.CREATOR);
                    enforceNoDataAvail(parcel);
                    o(status7, kVar);
                    return true;
                case 8:
                    Status status8 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status8, "status");
                    throw new UnsupportedOperationException();
                case 9:
                    Status status9 = (Status) zzc.zza(parcel, Status.CREATOR);
                    fb.e eVar = (fb.e) zzc.zza(parcel, fb.e.CREATOR);
                    enforceNoDataAvail(parcel);
                    y(status9, eVar);
                    return true;
                case 10:
                    Status status10 = (Status) zzc.zza(parcel, Status.CREATOR);
                    q0 q0Var = (q0) zzc.zza(parcel, q0.CREATOR);
                    enforceNoDataAvail(parcel);
                    z(status10, q0Var);
                    return true;
                case 11:
                    Status status11 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status11, "status");
                    throw new UnsupportedOperationException();
                case 12:
                    Status status12 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status12, "status");
                    throw new UnsupportedOperationException();
                case 13:
                    Status status13 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status13, "status");
                    throw new UnsupportedOperationException();
                case 14:
                    Status status14 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status14, "status");
                    throw new UnsupportedOperationException();
                case 15:
                    Status status15 = (Status) zzc.zza(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    r.e(status15, "status");
                    throw new UnsupportedOperationException();
                default:
                    return false;
            }
        }
    }

    void l(Status status, e0 e0Var) throws RemoteException;

    void o(Status status, fb.k kVar) throws RemoteException;

    void y(Status status, fb.e eVar) throws RemoteException;

    void z(Status status, q0 q0Var) throws RemoteException;
}
