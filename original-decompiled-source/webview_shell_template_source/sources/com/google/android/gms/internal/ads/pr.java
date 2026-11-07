package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class pr extends sh implements qr {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        List list;
        yq yqVar;
        k3.a aVar;
        switch (i6) {
            case 2:
                k3.b bVar = new k3.b(((ur0) this).f9619t);
                parcel2.writeNoException();
                th.e(parcel2, bVar);
                return true;
            case 3:
                String strB = ((ur0) this).f9620u.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 4:
                jp0 jp0Var = ((ur0) this).f9620u;
                synchronized (jp0Var) {
                    list = jp0Var.f6127e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strQ = ((ur0) this).f9620u.q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 6:
                jp0 jp0Var2 = ((ur0) this).f9620u;
                synchronized (jp0Var2) {
                    yqVar = jp0Var2.f6140t;
                }
                parcel2.writeNoException();
                th.e(parcel2, yqVar);
                return true;
            case 7:
                String strR = ((ur0) this).f9620u.r();
                parcel2.writeNoException();
                parcel2.writeString(strR);
                return true;
            case 8:
                String strP = ((ur0) this).f9620u.p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 9:
                Bundle bundleH = ((ur0) this).f9620u.h();
                parcel2.writeNoException();
                th.d(parcel2, bundleH);
                return true;
            case 10:
                ((ur0) this).f9619t.p();
                parcel2.writeNoException();
                return true;
            case 11:
                zzeb zzebVarI = ((ur0) this).f9620u.i();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarI);
                return true;
            case 12:
                Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                fp0 fp0Var = ((ur0) this).f9619t;
                synchronized (fp0Var) {
                    fp0Var.f4750l.g(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                boolean zI = ((ur0) this).f9619t.i(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                fp0 fp0Var2 = ((ur0) this).f9619t;
                synchronized (fp0Var2) {
                    fp0Var2.f4750l.i(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                sq sqVarJ = ((ur0) this).f9620u.j();
                parcel2.writeNoException();
                th.e(parcel2, sqVarJ);
                return true;
            case 16:
                jp0 jp0Var3 = ((ur0) this).f9620u;
                synchronized (jp0Var3) {
                    aVar = jp0Var3.f6138q;
                }
                parcel2.writeNoException();
                th.e(parcel2, aVar);
                return true;
            case 17:
                String str = ((ur0) this).s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
