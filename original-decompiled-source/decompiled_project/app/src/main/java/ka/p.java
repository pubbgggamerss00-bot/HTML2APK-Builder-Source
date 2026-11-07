package ka;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes2.dex */
public abstract class p extends zbb implements q {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 101:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                v(status);
                break;
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                q(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
