package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z50 implements bi {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f11178t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11179u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11180v;

    public z50(Context context, String str) {
        this.s = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f11179u = str;
        this.f11180v = false;
        this.f11178t = new Object();
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        a(aiVar.f2772j);
    }

    public final void a(boolean z6) {
        if (zzv.zzo().e(this.s)) {
            synchronized (this.f11178t) {
                try {
                    if (this.f11180v == z6) {
                        return;
                    }
                    this.f11180v = z6;
                    if (TextUtils.isEmpty(this.f11179u)) {
                        return;
                    }
                    if (this.f11180v) {
                        b60 b60VarZzo = zzv.zzo();
                        Context context = this.s;
                        String str = this.f11179u;
                        if (b60VarZzo.e(context)) {
                            b60VarZzo.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        b60 b60VarZzo2 = zzv.zzo();
                        Context context2 = this.s;
                        String str2 = this.f11179u;
                        if (b60VarZzo2.e(context2)) {
                            b60VarZzo2.j(context2, str2, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
