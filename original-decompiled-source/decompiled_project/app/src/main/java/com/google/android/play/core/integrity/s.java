package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f6598a = this;

    /* renamed from: b, reason: collision with root package name */
    private final kc.k f6599b;

    /* renamed from: c, reason: collision with root package name */
    private final kc.k f6600c;

    /* renamed from: d, reason: collision with root package name */
    private final kc.k f6601d;

    /* renamed from: e, reason: collision with root package name */
    private final kc.k f6602e;

    /* renamed from: f, reason: collision with root package name */
    private final kc.k f6603f;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        kc.j jVar = new kc.j(context);
        this.f6599b = jVar;
        kc.h hVarB = kc.h.b(ac.f6489a);
        this.f6600c = hVarB;
        au auVar = new au(jVar, l.f6591a);
        this.f6601d = auVar;
        kc.h hVarB2 = kc.h.b(new al(jVar, hVarB, auVar, l.f6591a));
        this.f6602e = hVarB2;
        this.f6603f = kc.h.b(new ab(hVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f6603f.a();
    }
}
