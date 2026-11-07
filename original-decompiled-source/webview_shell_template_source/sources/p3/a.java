package p3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a implements IInterface {
    public final IBinder s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14082t;

    public a(IBinder iBinder, String str) {
        this.s = iBinder;
        this.f14082t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }

    public final Parcel n(int i6, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.s.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel r() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14082t);
        return parcelObtain;
    }
}
