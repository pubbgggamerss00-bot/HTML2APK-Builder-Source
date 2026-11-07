package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m0 implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final a.f f6016a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6017b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.j f6018c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f6019d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6020e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f6021f;

    public m0(g gVar, a.f fVar, b bVar) {
        this.f6021f = gVar;
        this.f6016a = fVar;
        this.f6017b = bVar;
    }

    @Override // com.google.android.gms.common.internal.b.c
    public final void a(pa.a aVar) {
        this.f6021f.f5981n.post(new l0(this, aVar));
    }

    public final void b(pa.a aVar) {
        j0 j0Var = (j0) this.f6021f.f5977j.get(this.f6017b);
        if (j0Var != null) {
            j0Var.p(aVar);
        }
    }
}
