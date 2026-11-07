package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.h;

/* loaded from: classes.dex */
public interface i extends IInterface {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2983h = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f2984a = 0;

        /* renamed from: androidx.room.i$a$a, reason: collision with other inner class name */
        public static class C0042a implements i {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f2985a;

            @Override // androidx.room.i
            public final void D(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.f2983h);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f2985a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.i
            public final void E(h hVar, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.f2983h);
                    parcelObtain.writeStrongInterface(hVar);
                    parcelObtain.writeInt(i10);
                    this.f2985a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2985a;
            }

            @Override // androidx.room.i
            public final int k(h hVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(i.f2983h);
                    parcelObtain.writeStrongInterface(hVar);
                    parcelObtain.writeString(str);
                    this.f2985a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
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
            String str = i.f2983h;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            h hVar = null;
            h hVar2 = null;
            if (i10 == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(h.f2968g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) {
                        h.a.C0041a c0041a = new h.a.C0041a();
                        c0041a.f2969a = strongBinder;
                        hVar = c0041a;
                    } else {
                        hVar = (h) iInterfaceQueryLocalInterface;
                    }
                }
                int iK = ((MultiInstanceInvalidationService.a) this).k(hVar, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iK);
                return true;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                ((MultiInstanceInvalidationService.a) this).D(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(h.f2968g);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof h)) {
                    h.a.C0041a c0041a2 = new h.a.C0041a();
                    c0041a2.f2969a = strongBinder2;
                    hVar2 = c0041a2;
                } else {
                    hVar2 = (h) iInterfaceQueryLocalInterface2;
                }
            }
            ((MultiInstanceInvalidationService.a) this).E(hVar2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void D(int i10, String[] strArr) throws RemoteException;

    void E(h hVar, int i10) throws RemoteException;

    int k(h hVar, String str) throws RemoteException;
}
