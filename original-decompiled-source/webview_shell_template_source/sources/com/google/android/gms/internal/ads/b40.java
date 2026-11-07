package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcc;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b40 extends sh implements c40 {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        Bundle bundle;
        xa0 xa0Var;
        rs0 rs0Var;
        if (i6 == 1) {
            g40 g40Var = (g40) th.a(parcel, g40.CREATOR);
            th.b(parcel);
            ((rb1) this).e2(g40Var);
            parcel2.writeNoException();
            return true;
        }
        if (i6 == 2) {
            ((rb1) this).zzq();
            parcel2.writeNoException();
            return true;
        }
        IInterface e40Var = null;
        if (i6 == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                e40Var = iInterfaceQueryLocalInterface instanceof f40 ? (f40) iInterfaceQueryLocalInterface : new e40(strongBinder);
            }
            th.b(parcel);
            com.google.android.gms.common.internal.l.d("setRewardedVideoAdListener can only be called from the UI thread.");
            ((rb1) this).f8603t.f5319w.set(e40Var);
            parcel2.writeNoException();
            return true;
        }
        if (i6 == 34) {
            boolean zF = th.f(parcel);
            th.b(parcel);
            rb1 rb1Var = (rb1) this;
            synchronized (rb1Var) {
                com.google.android.gms.common.internal.l.d("setImmersiveMode must be called on the main UI thread.");
                rb1Var.f8606w = zF;
            }
            parcel2.writeNoException();
            return true;
        }
        int i8 = 0;
        switch (i6) {
            case 5:
                com.google.android.gms.common.internal.l.d("isLoaded must be called on the main UI thread.");
                boolean zG2 = ((rb1) this).g2();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zG2 ? 1 : 0);
                return true;
            case 6:
                ((rb1) this).X(null);
                parcel2.writeNoException();
                return true;
            case 7:
                ((rb1) this).zzk(null);
                parcel2.writeNoException();
                return true;
            case 8:
                ((rb1) this).B1(null);
                parcel2.writeNoException();
                return true;
            case 9:
                ((rb1) this).X(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 10:
                ((rb1) this).zzk(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                ((rb1) this).B1(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 12:
                String strI1 = ((rb1) this).i1();
                parcel2.writeNoException();
                parcel2.writeString(strI1);
                return true;
            case 13:
                String string = parcel.readString();
                th.b(parcel);
                rb1 rb1Var2 = (rb1) this;
                synchronized (rb1Var2) {
                    com.google.android.gms.common.internal.l.d("setUserId must be called on the main UI thread.");
                    rb1Var2.f8604u.f3032a = string;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                zzcc zzccVarZzb = zzcb.zzb(parcel.readStrongBinder());
                th.b(parcel);
                rb1 rb1Var3 = (rb1) this;
                hb1 hb1Var = rb1Var3.f8603t;
                com.google.android.gms.common.internal.l.d("setAdMetadataListener can only be called from the UI thread.");
                if (zzccVarZzb == null) {
                    hb1Var.f5316t.set(null);
                } else {
                    hb1Var.f5316t.set(new qb1(rb1Var3, zzccVarZzb));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.common.internal.l.d("getAdMetadata can only be called from the UI thread.");
                rs0 rs0Var2 = ((rb1) this).f8605v;
                if (rs0Var2 != null) {
                    ml0 ml0Var = rs0Var2.f8696o;
                    synchronized (ml0Var) {
                        bundle = new Bundle(ml0Var.f7187t);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                th.d(parcel2, bundle);
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    e40Var = iInterfaceQueryLocalInterface2 instanceof a40 ? (a40) iInterfaceQueryLocalInterface2 : new a40(strongBinder2, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                }
                th.b(parcel);
                com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                ((rb1) this).f8603t.f5321y.set(e40Var);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                th.b(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                ((rb1) this).f2(androidx.camera.core.c.c(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                th.b(parcel);
                rb1 rb1Var4 = (rb1) this;
                synchronized (rb1Var4) {
                    com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.: setCustomData");
                    rb1Var4.f8604u.f3033b = string2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                rs0 rs0Var3 = ((rb1) this).f8605v;
                if (rs0Var3 != null && (xa0Var = (xa0) rs0Var3.f8692k.get()) != null && !xa0Var.f0()) {
                    i8 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeInt(i8);
                return true;
            case dn.zzm /* 21 */:
                rb1 rb1Var5 = (rb1) this;
                synchronized (rb1Var5) {
                    if (((Boolean) zzbe.zzc().a(zn.C6)).booleanValue() && (rs0Var = rb1Var5.f8605v) != null) {
                        e40Var = rs0Var.f9293f;
                    }
                }
                parcel2.writeNoException();
                th.e(parcel2, e40Var);
                return true;
            default:
                return false;
        }
    }
}
