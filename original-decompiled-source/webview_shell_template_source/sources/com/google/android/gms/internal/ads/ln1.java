package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ln1 extends bn1 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public int f6796t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ nn1 f6797u;

    public ln1(nn1 nn1Var, int i6) {
        this.f6797u = nn1Var;
        Object obj = nn1.B;
        this.s = nn1Var.b()[i6];
        this.f6796t = i6;
    }

    public final void a() {
        int i6 = this.f6796t;
        Object obj = this.s;
        nn1 nn1Var = this.f6797u;
        if (i6 != -1 && i6 < nn1Var.size()) {
            if (aa1.k(obj, nn1Var.b()[this.f6796t])) {
                return;
            }
        }
        Object obj2 = nn1.B;
        this.f6796t = nn1Var.h(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        nn1 nn1Var = this.f6797u;
        Map mapD = nn1Var.d();
        if (mapD != null) {
            return mapD.get(this.s);
        }
        a();
        int i6 = this.f6796t;
        if (i6 == -1) {
            return null;
        }
        return nn1Var.c()[i6];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        nn1 nn1Var = this.f6797u;
        Map mapD = nn1Var.d();
        Object obj2 = this.s;
        if (mapD != null) {
            return mapD.put(obj2, obj);
        }
        a();
        int i6 = this.f6796t;
        if (i6 == -1) {
            nn1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = nn1Var.c()[i6];
        nn1Var.c()[this.f6796t] = obj;
        return obj3;
    }
}
