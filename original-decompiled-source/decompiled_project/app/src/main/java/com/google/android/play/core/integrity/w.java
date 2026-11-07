package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f6605a = this;

    /* renamed from: b, reason: collision with root package name */
    private final kc.k f6606b;

    /* renamed from: c, reason: collision with root package name */
    private final kc.k f6607c;

    /* renamed from: d, reason: collision with root package name */
    private final kc.k f6608d;

    /* renamed from: e, reason: collision with root package name */
    private final kc.k f6609e;

    /* renamed from: f, reason: collision with root package name */
    private final kc.k f6610f;

    /* renamed from: g, reason: collision with root package name */
    private final kc.k f6611g;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        kc.j jVar = new kc.j(context);
        this.f6606b = jVar;
        kc.h hVarB = kc.h.b(bb.f6542a);
        this.f6607c = hVarB;
        au auVar = new au(jVar, n.f6596a);
        this.f6608d = auVar;
        kc.h hVarB2 = kc.h.b(new bp(jVar, hVarB, auVar, n.f6596a));
        this.f6609e = hVarB2;
        kc.h hVarB3 = kc.h.b(new bu(hVarB2));
        this.f6610f = hVarB3;
        this.f6611g = kc.h.b(new ba(hVarB2, hVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f6611g.a();
    }
}
