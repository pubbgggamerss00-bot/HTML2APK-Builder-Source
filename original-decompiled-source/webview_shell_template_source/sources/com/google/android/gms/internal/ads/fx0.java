package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fx0 implements yl0 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final b60 f4815t;

    public fx0(Context context, b60 b60Var) {
        this.s = context;
        this.f4815t = b60Var;
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(((vb1) ac1Var.f2648b.f1103u).f9777e)) {
            return;
        }
        b60 b60Var = this.f4815t;
        Context context = this.s;
        b60Var.getClass();
        if (((Boolean) zzbe.zzc().a(zn.A0)).booleanValue() && b60Var.e(context) && b60.g(context)) {
            synchronized (b60Var.f2942i) {
            }
        }
        this.f4815t.k(this.s, "_aq", ((vb1) ac1Var.f2648b.f1103u).f9777e, null);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
    }
}
