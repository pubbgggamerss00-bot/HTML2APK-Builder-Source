package dc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class f implements h, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f7831a;

    public f(IBinder iBinder) {
        this.f7831a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7831a;
    }

    @Override // dc.h
    public final void h(String str, Bundle bundle, cc.o oVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = e.f7830a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(oVar);
        try {
            this.f7831a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // dc.h
    public final void n(String str, Bundle bundle, cc.p pVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = e.f7830a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(pVar);
        try {
            this.f7831a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
