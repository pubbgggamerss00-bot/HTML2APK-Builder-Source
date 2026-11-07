package com.google.android.gms.common.internal;

import android.content.Intent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u extends v {
    public final /* synthetic */ Intent s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2486t;

    public u(Intent intent, e3.e eVar) {
        this.s = intent;
        this.f2486t = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e3.e, java.lang.Object] */
    @Override // com.google.android.gms.common.internal.v
    public final void a() {
        Intent intent = this.s;
        if (intent != null) {
            this.f2486t.a(intent, 2);
        }
    }
}
