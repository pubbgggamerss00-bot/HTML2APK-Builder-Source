package kc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class z extends l implements a0 {
    public z() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // kc.l
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) m.a(parcel);
        m.b(parcel);
        b(bundle);
        return true;
    }
}
