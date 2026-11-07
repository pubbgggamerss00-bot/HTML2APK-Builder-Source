package q3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements f, IInterface {
    public final IBinder s;

    public d(IBinder iBinder) {
        this.s = iBinder;
    }

    @Override // q3.f
    public final void A(k3.b bVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        parcelN.writeLong(j6);
        r(26, parcelN);
    }

    @Override // q3.f
    public final void A0(long j6, String str, String str2, k3.b bVar) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        parcelN.writeString(str);
        parcelN.writeString(str2);
        parcelN.writeLong(j6);
        r(15, parcelN);
    }

    @Override // q3.f
    public final void C1(Bundle bundle, long j6) {
        Parcel parcelN = n();
        b.a(parcelN, bundle);
        parcelN.writeLong(j6);
        r(44, parcelN);
    }

    @Override // q3.f
    public final void E1(h hVar) {
        Parcel parcelN = n();
        b.b(parcelN, hVar);
        r(17, parcelN);
    }

    @Override // q3.f
    public final void F0(h hVar) {
        Parcel parcelN = n();
        b.b(parcelN, hVar);
        r(21, parcelN);
    }

    @Override // q3.f
    public final void F1(String str, String str2, boolean z6, h hVar) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeString(str2);
        int i6 = b.f14120a;
        parcelN.writeInt(z6 ? 1 : 0);
        b.b(parcelN, hVar);
        r(5, parcelN);
    }

    @Override // q3.f
    public final void I(k3.b bVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        parcelN.writeLong(j6);
        r(28, parcelN);
    }

    @Override // q3.f
    public final void I0(h hVar) {
        Parcel parcelN = n();
        b.b(parcelN, hVar);
        r(19, parcelN);
    }

    @Override // q3.f
    public final void M1(String str, long j6) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeLong(j6);
        r(24, parcelN);
    }

    @Override // q3.f
    public final void P0(String str, long j6) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeLong(j6);
        r(23, parcelN);
    }

    @Override // q3.f
    public final void S0(String str, h hVar) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        b.b(parcelN, hVar);
        r(6, parcelN);
    }

    @Override // q3.f
    public final void T1(k3.b bVar, Bundle bundle, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        b.a(parcelN, bundle);
        parcelN.writeLong(j6);
        r(27, parcelN);
    }

    @Override // q3.f
    public final void U0(String str, String str2, Bundle bundle, long j6) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeString(str2);
        b.a(parcelN, bundle);
        parcelN.writeInt(1);
        parcelN.writeInt(1);
        parcelN.writeLong(j6);
        r(2, parcelN);
    }

    @Override // q3.f
    public final void V(Bundle bundle, h hVar, long j6) {
        Parcel parcelN = n();
        b.a(parcelN, bundle);
        b.b(parcelN, hVar);
        parcelN.writeLong(j6);
        r(32, parcelN);
    }

    @Override // q3.f
    public final void V1(k3.b bVar, k3.b bVar2, k3.b bVar3) {
        Parcel parcelN = n();
        parcelN.writeInt(5);
        parcelN.writeString("Error with data collection. Data lost.");
        b.b(parcelN, bVar);
        b.b(parcelN, bVar2);
        b.b(parcelN, bVar3);
        r(33, parcelN);
    }

    @Override // q3.f
    public final void Z1(String str, String str2, h hVar) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeString(str2);
        b.b(parcelN, hVar);
        r(10, parcelN);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }

    @Override // q3.f
    public final void g1(h hVar) {
        Parcel parcelN = n();
        b.b(parcelN, hVar);
        r(16, parcelN);
    }

    @Override // q3.f
    public final void i0(k3.b bVar, i iVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        b.a(parcelN, iVar);
        parcelN.writeLong(j6);
        r(1, parcelN);
    }

    @Override // q3.f
    public final void k0(k3.b bVar, h hVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        b.b(parcelN, hVar);
        parcelN.writeLong(j6);
        r(31, parcelN);
    }

    @Override // q3.f
    public final void l0(String str, Bundle bundle, String str2) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeString(str2);
        b.a(parcelN, bundle);
        r(9, parcelN);
    }

    public final Parcel n() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return parcelObtain;
    }

    @Override // q3.f
    public final void n0(k3.b bVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        parcelN.writeLong(j6);
        r(29, parcelN);
    }

    @Override // q3.f
    public final void n1(long j6, String str, String str2, k3.b bVar) {
        Parcel parcelN = n();
        parcelN.writeString(str);
        parcelN.writeString(str2);
        b.b(parcelN, bVar);
        parcelN.writeInt(1);
        parcelN.writeLong(j6);
        r(4, parcelN);
    }

    @Override // q3.f
    public final void q1(h hVar) {
        Parcel parcelN = n();
        b.b(parcelN, hVar);
        r(22, parcelN);
    }

    public final void r(int i6, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.s.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q3.f
    public final void v0(k3.b bVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        parcelN.writeLong(j6);
        r(25, parcelN);
    }

    @Override // q3.f
    public final void x(k3.b bVar, long j6) {
        Parcel parcelN = n();
        b.b(parcelN, bVar);
        parcelN.writeLong(j6);
        r(30, parcelN);
    }

    @Override // q3.f
    public final void y(Bundle bundle, long j6) {
        Parcel parcelN = n();
        b.a(parcelN, bundle);
        parcelN.writeLong(j6);
        r(8, parcelN);
    }
}
