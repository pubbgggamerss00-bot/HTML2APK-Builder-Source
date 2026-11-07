package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class nr extends sh implements or {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        List list;
        yq yqVar;
        double d7;
        String strC;
        String strC2;
        k3.a aVar;
        switch (i6) {
            case 2:
                k3.b bVar = new k3.b(((tr0) this).f9370t);
                parcel2.writeNoException();
                th.e(parcel2, bVar);
                return true;
            case 3:
                String strB = ((tr0) this).f9371u.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                jp0 jp0Var = ((tr0) this).f9371u;
                synchronized (jp0Var) {
                    list = jp0Var.f6127e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strQ = ((tr0) this).f9371u.q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 6:
                jp0 jp0Var2 = ((tr0) this).f9371u;
                synchronized (jp0Var2) {
                    yqVar = jp0Var2.s;
                }
                parcel2.writeNoException();
                th.e(parcel2, yqVar);
                return true;
            case 7:
                String strR = ((tr0) this).f9371u.r();
                parcel2.writeNoException();
                parcel2.writeString(strR);
                return true;
            case 8:
                jp0 jp0Var3 = ((tr0) this).f9371u;
                synchronized (jp0Var3) {
                    d7 = jp0Var3.f6139r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d7);
                return true;
            case 9:
                jp0 jp0Var4 = ((tr0) this).f9371u;
                synchronized (jp0Var4) {
                    strC = jp0Var4.c("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 10:
                jp0 jp0Var5 = ((tr0) this).f9371u;
                synchronized (jp0Var5) {
                    strC2 = jp0Var5.c("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strC2);
                return true;
            case 11:
                Bundle bundleH = ((tr0) this).f9371u.h();
                parcel2.writeNoException();
                th.d(parcel2, bundleH);
                return true;
            case 12:
                ((tr0) this).f9370t.p();
                parcel2.writeNoException();
                return true;
            case 13:
                zzeb zzebVarI = ((tr0) this).f9371u.i();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarI);
                return true;
            case 14:
                Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                fp0 fp0Var = ((tr0) this).f9370t;
                synchronized (fp0Var) {
                    fp0Var.f4750l.g(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                boolean zI = ((tr0) this).f9370t.i(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                fp0 fp0Var2 = ((tr0) this).f9370t;
                synchronized (fp0Var2) {
                    fp0Var2.f4750l.i(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                sq sqVarJ = ((tr0) this).f9371u.j();
                parcel2.writeNoException();
                th.e(parcel2, sqVarJ);
                return true;
            case 18:
                jp0 jp0Var6 = ((tr0) this).f9371u;
                synchronized (jp0Var6) {
                    aVar = jp0Var6.f6138q;
                }
                parcel2.writeNoException();
                th.e(parcel2, aVar);
                return true;
            case 19:
                String str = ((tr0) this).s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
