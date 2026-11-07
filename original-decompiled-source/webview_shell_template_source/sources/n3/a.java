package n3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import v3.p;

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
        d dVar = (d) this;
        if (i6 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i8 = b.f13921a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        z2.e eVarCreateFromParcel = parcel.readInt() == 0 ? null : z2.e.CREATOR.createFromParcel(parcel);
        j jVar = (j) dVar;
        z2.b bVar = eVarCreateFromParcel != null ? new z2.b(eVarCreateFromParcel.s, eVarCreateFromParcel.f15431t) : null;
        p pVar = jVar.s.f14800a;
        if (statusCreateFromParcel.s <= 0) {
            pVar.j(bVar);
            return true;
        }
        pVar.i(new d3.b(statusCreateFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
