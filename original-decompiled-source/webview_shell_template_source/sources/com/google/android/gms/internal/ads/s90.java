package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class s90 implements d3.g {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final String f8852t;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f8853u;

    public s90(p80 p80Var) {
        Context context = p80Var.getContext();
        this.s = context;
        this.f8852t = zzv.zzq().zzc(context, p80Var.zzn().afmaVersion);
        this.f8853u = new WeakReference(p80Var);
    }

    public static /* bridge */ /* synthetic */ void h(s90 s90Var, HashMap map) {
        p80 p80Var = (p80) s90Var.f8853u.get();
        if (p80Var != null) {
            p80Var.G("onPrecacheEvent", map);
        }
    }

    public abstract void i();

    public final void j(String str, String str2, String str3, String str4) {
        zzf.zza.post(new r90(this, str, str2, str3, str4));
    }

    public abstract boolean p(String str);

    public boolean q(String str, String[] strArr) {
        return p(str);
    }

    public boolean r(String str, String[] strArr, j90 j90Var) {
        return p(str);
    }

    @Override // d3.g
    public void release() {
    }

    public void k(int i6) {
    }

    public void l(int i6) {
    }

    public void m(int i6) {
    }

    public void n(int i6) {
    }
}
