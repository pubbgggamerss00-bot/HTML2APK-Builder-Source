package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z7 implements e8 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f11963a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f11964b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11965c;

    public z7(p1 p1Var, v7 v7Var) {
        p6 p6Var = q6.f11870a;
        this.f11964b = p1Var;
        this.f11965c = v7Var instanceof x6;
        this.f11963a = v7Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final void a(Object obj) {
        this.f11964b.getClass();
        n8 n8Var = ((z6) obj).zzc;
        if (n8Var.f11851d) {
            n8Var.f11851d = false;
        }
        p6 p6Var = q6.f11870a;
        ((x6) obj).zzb.c();
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final int b(z6 z6Var) {
        z6Var.zzc.getClass();
        if (this.f11965c) {
            return ((x6) z6Var).zzb.f11884a.hashCode() + 26870523;
        }
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final boolean c(z6 z6Var, z6 z6Var2) {
        if (!z6Var.zzc.equals(z6Var2.zzc)) {
            return false;
        }
        if (this.f11965c) {
            return ((x6) z6Var).zzb.equals(((x6) z6Var2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final void d(Object obj, Object obj2) {
        f8.p(obj, obj2);
        if (this.f11965c) {
            p6 p6Var = q6.f11870a;
            if (((x6) obj2).zzb.f11884a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final int e(z6 z6Var) {
        n8 n8Var = z6Var.zzc;
        int i6 = n8Var.f11850c;
        if (i6 == -1) {
            n8Var.f11850c = 0;
            i6 = 0;
        }
        if (this.f11965c) {
            g8 g8Var = ((x6) z6Var).zzb.f11884a;
            if (g8Var.f11802t > 0) {
                s6.g(g8Var.d(0));
                throw null;
            }
            Iterator it = g8Var.b().iterator();
            if (it.hasNext()) {
                s6.g((Map.Entry) it.next());
                throw null;
            }
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final boolean f(Object obj) {
        ((x6) obj).zzb.e();
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final void g(Object obj, l6 l6Var) {
        Iterator itB = ((x6) obj).zzb.b();
        if (itB.hasNext()) {
            ((r6) ((Map.Entry) itB.next()).getKey()).zzc();
            throw null;
        }
        ((z6) obj).zzc.getClass();
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final z6 zzc() {
        v7 v7Var = this.f11963a;
        return v7Var instanceof z6 ? (z6) ((z6) v7Var).f(4) : v7Var.zzu().c();
    }
}
