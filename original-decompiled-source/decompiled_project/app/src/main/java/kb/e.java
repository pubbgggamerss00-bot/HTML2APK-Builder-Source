package kb;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.a1;
import com.google.android.gms.common.api.internal.z0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes2.dex */
public abstract class e extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                k kVar = (k) zac.zaa(parcel, k.CREATOR);
                zac.zab(parcel);
                a1 a1Var = (a1) this;
                a1Var.f5932b.post(new z0(a1Var, kVar));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
