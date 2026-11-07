package ic;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class c implements e, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f14442a;

    public c(IBinder iBinder) {
        this.f14442a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14442a;
    }

    @Override // ic.e
    public final void j(String str, Bundle bundle, hc.h hVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i10 = b.f14441a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        try {
            this.f14442a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
