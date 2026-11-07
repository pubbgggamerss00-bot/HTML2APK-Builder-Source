package kc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f16259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16260b;

    public a(IBinder iBinder, String str) {
        this.f16259a = iBinder;
        this.f16260b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16259a;
    }

    public final void b(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f16259a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
