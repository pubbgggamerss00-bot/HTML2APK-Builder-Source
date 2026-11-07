package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.r;

/* loaded from: classes.dex */
public interface h extends IInterface {

    /* renamed from: g, reason: collision with root package name */
    public static final String f2968g = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static abstract class a extends Binder implements h {

        /* renamed from: androidx.room.h$a$a, reason: collision with other inner class name */
        public static class C0041a implements h {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f2969a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2969a;
            }

            @Override // androidx.room.h
            public final void f(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(h.f2968g);
                    parcelObtain.writeStringArray(strArr);
                    this.f2969a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = h.f2968g;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            ((r.a) this).f(parcel.createStringArray());
            return true;
        }
    }

    void f(String[] strArr) throws RemoteException;
}
