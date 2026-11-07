package q3;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i6, parcel, parcel2, i7)) {
            return true;
        }
        g gVar = (g) this;
        if (i6 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i8 = b.f14120a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            ((c) gVar).r(bundle);
            parcel2.writeNoException();
            return true;
        }
        StringBuilder sb = new StringBuilder(56);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(iDataAvail);
        throw new BadParcelableException(sb.toString());
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
