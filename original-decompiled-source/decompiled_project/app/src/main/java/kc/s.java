package kc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class s extends l implements t {
    public s() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // kc.l
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) m.a(parcel);
            m.b(parcel);
            e(bundle);
            return true;
        }
        if (i10 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) m.a(parcel);
            m.b(parcel);
            c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) m.a(parcel);
            m.b(parcel);
            d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) m.a(parcel);
        m.b(parcel);
        b(bundle4);
        return true;
    }
}
