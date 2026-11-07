package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class us extends sh implements vs {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        List list;
        yq yqVar;
        double d7;
        String strC;
        String strC2;
        k3.a aVar;
        ss qsVar;
        switch (i6) {
            case 2:
                String strB = ((wr0) this).f10256u.b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 3:
                jp0 jp0Var = ((wr0) this).f10256u;
                synchronized (jp0Var) {
                    list = jp0Var.f6127e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strQ = ((wr0) this).f10256u.q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 5:
                jp0 jp0Var2 = ((wr0) this).f10256u;
                synchronized (jp0Var2) {
                    yqVar = jp0Var2.s;
                }
                parcel2.writeNoException();
                th.e(parcel2, yqVar);
                return true;
            case 6:
                String strR = ((wr0) this).f10256u.r();
                parcel2.writeNoException();
                parcel2.writeString(strR);
                return true;
            case 7:
                String strP = ((wr0) this).f10256u.p();
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 8:
                jp0 jp0Var3 = ((wr0) this).f10256u;
                synchronized (jp0Var3) {
                    d7 = jp0Var3.f6139r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d7);
                return true;
            case 9:
                jp0 jp0Var4 = ((wr0) this).f10256u;
                synchronized (jp0Var4) {
                    strC = jp0Var4.c("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 10:
                jp0 jp0Var5 = ((wr0) this).f10256u;
                synchronized (jp0Var5) {
                    strC2 = jp0Var5.c("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strC2);
                return true;
            case 11:
                zzeb zzebVarI = ((wr0) this).f10256u.i();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarI);
                return true;
            case 12:
                String str = ((wr0) this).s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                ((wr0) this).zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                sq sqVarJ = ((wr0) this).f10256u.j();
                parcel2.writeNoException();
                th.e(parcel2, sqVarJ);
                return true;
            case 15:
                Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                ((wr0) this).c2(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                boolean zI = ((wr0) this).f10255t.i(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                ((wr0) this).g0(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                k3.a aVarZzm = ((wr0) this).zzm();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzm);
                return true;
            case 19:
                jp0 jp0Var6 = ((wr0) this).f10256u;
                synchronized (jp0Var6) {
                    aVar = jp0Var6.f6138q;
                }
                parcel2.writeNoException();
                th.e(parcel2, aVar);
                return true;
            case 20:
                Bundle bundleH = ((wr0) this).f10256u.h();
                parcel2.writeNoException();
                th.d(parcel2, bundleH);
                return true;
            case dn.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    qsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    qsVar = iInterfaceQueryLocalInterface instanceof ss ? (ss) iInterfaceQueryLocalInterface : new qs(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                }
                th.b(parcel);
                ((wr0) this).t0(qsVar);
                parcel2.writeNoException();
                return true;
            case 22:
                ((wr0) this).c();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = ((wr0) this).zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zB = ((wr0) this).b();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case 25:
                zzdh zzdhVarZzb = zzdg.zzb(parcel.readStrongBinder());
                th.b(parcel);
                ((wr0) this).B(zzdhVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdd zzddVarZzb = zzdc.zzb(parcel.readStrongBinder());
                th.b(parcel);
                ((wr0) this).Y0(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                ((wr0) this).d();
                parcel2.writeNoException();
                return true;
            case 28:
                ((wr0) this).zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                wq wqVarZzj = ((wr0) this).zzj();
                parcel2.writeNoException();
                th.e(parcel2, wqVarZzj);
                return true;
            case 30:
                boolean zZzH = ((wr0) this).zzH();
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 31:
                zzdy zzdyVarZzg = ((wr0) this).zzg();
                parcel2.writeNoException();
                th.e(parcel2, zzdyVarZzg);
                return true;
            case 32:
                zzdr zzdrVarZzb = zzdq.zzb(parcel.readStrongBinder());
                th.b(parcel);
                ((wr0) this).N1(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                Bundle bundle4 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                ((wr0) this).s0(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
