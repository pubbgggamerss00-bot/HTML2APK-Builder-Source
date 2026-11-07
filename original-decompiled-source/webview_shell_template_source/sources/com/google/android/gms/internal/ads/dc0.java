package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class dc0 extends sh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.os.Parcel] */
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        ?? map;
        long jLongValue;
        int i8 = 0;
        int i9 = 1;
        switch (i6) {
            case 1:
                Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                q3.e0 e0Var = (q3.e0) ((vx) this).s.s;
                e0Var.b(new q3.w(e0Var, bundle, new q3.c()));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                q3.e0 e0Var2 = (q3.e0) ((vx) this).s.s;
                q3.c cVar = new q3.c();
                e0Var2.b(new q3.w(e0Var2, bundle2, cVar));
                Bundle bundleN = cVar.n(5000L);
                parcel2.writeNoException();
                th.d(parcel2, bundleN);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                q3.e0 e0Var3 = (q3.e0) ((vx) this).s.s;
                e0Var3.b(new q3.z(e0Var3, string, string2, bundle3));
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                k3.a aVarC = androidx.camera.core.c.c(parcel, parcel);
                vx vxVar = (vx) this;
                Object objI1 = aVarC != null ? k3.b.i1(aVarC) : null;
                q3.e0 e0Var4 = (q3.e0) vxVar.s.s;
                e0Var4.b(new q3.p(e0Var4, string3, string4, objI1, 1));
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ClassLoader classLoader = th.f9281a;
                boolean z6 = parcel.readInt() != 0;
                th.b(parcel);
                q3.e0 e0Var5 = (q3.e0) ((vx) this).s.s;
                q3.c cVar2 = new q3.c();
                e0Var5.b(new q3.v(e0Var5, string5, string6, z6, cVar2));
                Bundle bundleN2 = cVar2.n(5000L);
                if (bundleN2 == null || bundleN2.size() == 0) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = new HashMap(bundleN2.size());
                    for (String str : bundleN2.keySet()) {
                        Object obj = bundleN2.get(str);
                        if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                            map.put(str, obj);
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeMap(map);
                return true;
            case 6:
                String string7 = parcel.readString();
                th.b(parcel);
                q3.e0 e0Var6 = (q3.e0) ((vx) this).s.s;
                q3.c cVar3 = new q3.c();
                e0Var6.b(new q3.y(e0Var6, string7, cVar3));
                Integer num = (Integer) q3.c.i1(Integer.class, cVar3.n(10000L));
                int iIntValue = num == null ? 25 : num.intValue();
                parcel2.writeNoException();
                parcel2.writeInt(iIntValue);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                q3.e0 e0Var7 = (q3.e0) ((vx) this).s.s;
                e0Var7.b(new q3.k(e0Var7, bundle4, i8));
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                q3.e0 e0Var8 = (q3.e0) ((vx) this).s.s;
                e0Var8.b(new q3.l(e0Var8, string8, string9, bundle5));
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                th.b(parcel);
                q3.e0 e0Var9 = (q3.e0) ((vx) this).s.s;
                q3.c cVar4 = new q3.c();
                e0Var9.b(new q3.m(e0Var9, string10, string11, cVar4));
                List list = (List) q3.c.i1(List.class, cVar4.n(5000L));
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 10:
                q3.e0 e0Var10 = (q3.e0) ((vx) this).s.s;
                q3.c cVar5 = new q3.c();
                e0Var10.b(new q3.s(e0Var10, cVar5));
                String str2 = (String) q3.c.i1(String.class, cVar5.n(50L));
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 11:
                q3.e0 e0Var11 = (q3.e0) ((vx) this).s.s;
                q3.c cVar6 = new q3.c();
                e0Var11.b(new q3.r(e0Var11, cVar6));
                String str3 = (String) q3.c.i1(String.class, cVar6.n(500L));
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 12:
                q3.e0 e0Var12 = (q3.e0) ((vx) this).s.s;
                q3.c cVar7 = new q3.c();
                e0Var12.b(new q3.t(e0Var12, cVar7));
                Long l4 = (Long) q3.c.i1(Long.class, cVar7.n(500L));
                if (l4 == null) {
                    long jNanoTime = System.nanoTime();
                    e0Var12.f14130b.getClass();
                    long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
                    int i10 = e0Var12.f14133e + 1;
                    e0Var12.f14133e = i10;
                    jLongValue = jNextLong + i10;
                } else {
                    jLongValue = l4.longValue();
                }
                parcel2.writeNoException();
                parcel2.writeLong(jLongValue);
                return true;
            case 13:
                String string12 = parcel.readString();
                th.b(parcel);
                q3.e0 e0Var13 = (q3.e0) ((vx) this).s.s;
                e0Var13.b(new q3.q(e0Var13, string12));
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                th.b(parcel);
                q3.e0 e0Var14 = (q3.e0) ((vx) this).s.s;
                e0Var14.b(new q3.k(e0Var14, string13, i9));
                parcel2.writeNoException();
                return true;
            case 15:
                k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                th.b(parcel);
                vx vxVar2 = (vx) this;
                Activity activity = aVarR != null ? (Activity) k3.b.i1(aVarR) : null;
                q3.e0 e0Var15 = (q3.e0) vxVar2.s.s;
                e0Var15.b(new q3.n(e0Var15, activity, string14, string15));
                parcel2.writeNoException();
                return true;
            case 16:
                q3.e0 e0Var16 = (q3.e0) ((vx) this).s.s;
                q3.c cVar8 = new q3.c();
                e0Var16.b(new q3.o(e0Var16, cVar8, i9));
                String str4 = (String) q3.c.i1(String.class, cVar8.n(500L));
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 17:
                q3.e0 e0Var17 = (q3.e0) ((vx) this).s.s;
                q3.c cVar9 = new q3.c();
                e0Var17.b(new q3.u(e0Var17, cVar9));
                String str5 = (String) q3.c.i1(String.class, cVar9.n(500L));
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 18:
                String str6 = ((q3.e0) ((vx) this).s.s).f14135g;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) th.a(parcel, Bundle.CREATOR);
                th.b(parcel);
                q3.e0 e0Var18 = (q3.e0) ((vx) this).s.s;
                e0Var18.b(new q3.o(e0Var18, bundle6, i8));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
