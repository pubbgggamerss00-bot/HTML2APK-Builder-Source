package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class di1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3944a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f3945b;

    public di1(Context context, Looper looper) {
        this.f3944a = context;
        this.f3945b = looper;
    }

    public final void a(String str) {
        ki1 ki1VarB = li1.B();
        String packageName = this.f3944a.getPackageName();
        ki1VarB.i();
        li1.C((li1) ki1VarB.f4126t, packageName);
        ki1VarB.i();
        li1.E((li1) ki1VarB.f4126t);
        ii1 ii1VarB = ji1.B();
        ii1VarB.i();
        ji1.C((ji1) ii1VarB.f4126t, str);
        ii1VarB.i();
        ji1.D((ji1) ii1VarB.f4126t);
        ki1VarB.i();
        li1.D((li1) ki1VarB.f4126t, (ji1) ii1VarB.g());
        ei1 ei1Var = new ei1(this.f3944a, this.f3945b, (li1) ki1VarB.g());
        synchronized (ei1Var.f4301c) {
            try {
                if (!ei1Var.f4302d) {
                    ei1Var.f4302d = true;
                    ei1Var.f4299a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
