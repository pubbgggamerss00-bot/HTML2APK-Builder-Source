package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yg extends lh {

    /* renamed from: i, reason: collision with root package name */
    public static volatile Long f10971i;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f10972j = new Object();
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg(dg dgVar, String str, String str2, kd kdVar, int i6, int i7) {
        super(dgVar, str, str2, kdVar, i6, i7);
        this.h = 1;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void a() {
        switch (this.h) {
            case 0:
                if (f10971i == null) {
                    synchronized (f10972j) {
                        try {
                            if (f10971i == null) {
                                f10971i = (Long) this.f6728e.invoke(null, null);
                            }
                        } finally {
                        }
                    }
                }
                synchronized (this.f6727d) {
                    kd kdVar = this.f6727d;
                    long jLongValue = f10971i.longValue();
                    kdVar.i();
                    yd.H((yd) kdVar.f4126t, jLongValue);
                }
                return;
            case 1:
                kd kdVar2 = this.f6727d;
                try {
                    int i6 = 1;
                    if (true == ((Boolean) this.f6728e.invoke(null, this.f6724a.f3897a)).booleanValue()) {
                        i6 = 2;
                    }
                    kdVar2.i();
                    yd.t0((yd) kdVar2.f4126t, i6);
                    return;
                } catch (InvocationTargetException unused) {
                    kdVar2.i();
                    yd.t0((yd) kdVar2.f4126t, 3);
                    return;
                }
            default:
                kd kdVar3 = this.f6727d;
                kdVar3.i();
                yd.u0((yd) kdVar3.f4126t, 3);
                boolean zBooleanValue = ((Boolean) this.f6728e.invoke(null, this.f6724a.f3897a)).booleanValue();
                synchronized (this.f6727d) {
                    try {
                        if (zBooleanValue) {
                            kd kdVar4 = this.f6727d;
                            kdVar4.i();
                            yd.u0((yd) kdVar4.f4126t, 2);
                        } else {
                            kd kdVar5 = this.f6727d;
                            kdVar5.i();
                            yd.u0((yd) kdVar5.f4126t, 1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(dg dgVar, kd kdVar, int i6, int i7) {
        super(dgVar, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", kdVar, i6, 22);
        this.h = i7;
        switch (i7) {
            case 2:
                super(dgVar, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", kdVar, i6, 48);
                break;
            default:
                break;
        }
    }
}
