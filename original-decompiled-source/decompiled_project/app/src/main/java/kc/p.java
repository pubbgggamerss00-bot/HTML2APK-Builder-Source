package kc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class p extends a implements r {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kc.r
    public final void C(Bundle bundle, t tVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16260b);
        int i10 = m.f16294a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(tVar);
        b(2, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kc.r
    public final void G(Bundle bundle, t tVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16260b);
        int i10 = m.f16294a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(tVar);
        b(3, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kc.r
    public final void a(Bundle bundle, a0 a0Var) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16260b);
        int i10 = m.f16294a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(a0Var);
        b(6, parcelObtain);
    }
}
