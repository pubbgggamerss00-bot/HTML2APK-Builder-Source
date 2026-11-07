package dc;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class d extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        i iVar = (i) this;
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i12 = e.f7830a;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(j2.y.a(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            iVar.t(bundle);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i13 = e.f7830a;
        Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(j2.y.a(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        iVar.x(bundle2);
        return true;
    }
}
