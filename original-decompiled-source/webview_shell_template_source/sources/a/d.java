package a;

import a.a;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3d = "android$support$customtabs$IPostMessageService".replace('$', '.');

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a extends Binder implements d {
        @Override // android.os.Binder
        public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
            String str = d.f3d;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i6 == 2) {
                a.AbstractBinderC0000a.n(parcel.readStrongBinder()).W1((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            }
            if (i6 != 3) {
                return super.onTransact(i6, parcel, parcel2, i7);
            }
            a.AbstractBinderC0000a.n(parcel.readStrongBinder()).P1(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
