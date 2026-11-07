package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
public final class a0 extends p1 {

    /* renamed from: e, reason: collision with root package name */
    public final p.b f5928e;

    /* renamed from: f, reason: collision with root package name */
    public final g f5929f;

    public a0(k kVar, g gVar, pa.d dVar) {
        super(kVar, dVar);
        this.f5928e = new p.b(0);
        this.f5929f = gVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onResume() {
        super.onResume();
        if (this.f5928e.isEmpty()) {
            return;
        }
        this.f5929f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.p1, com.google.android.gms.common.api.internal.j
    public final void onStart() {
        super.onStart();
        if (this.f5928e.isEmpty()) {
            return;
        }
        this.f5929f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.p1, com.google.android.gms.common.api.internal.j
    public final void onStop() {
        super.onStop();
        g gVar = this.f5929f;
        gVar.getClass();
        synchronized (g.f5966r) {
            try {
                if (gVar.f5978k == this) {
                    gVar.f5978k = null;
                    gVar.f5979l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
