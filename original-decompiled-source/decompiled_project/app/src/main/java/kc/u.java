package kc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class u extends a implements w {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kc.w
    public final void a(Bundle bundle, a0 a0Var) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16260b);
        int i10 = m.f16294a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(a0Var);
        b(3, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kc.w
    public final void m(Bundle bundle, y yVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16260b);
        int i10 = m.f16294a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(yVar);
        b(2, parcelObtain);
    }
}
