package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ov implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o70 f7867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qv f7868b;

    public ov(qv qvVar, o70 o70Var) {
        this.f7867a = o70Var;
        this.f7868b = qvVar;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) {
        this.f7867a.b(new RuntimeException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "onConnectionSuspended: ")));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        try {
            this.f7867a.a((lv) this.f7868b.f8458a.getService());
        } catch (DeadObjectException e6) {
            this.f7867a.b(e6);
        }
    }
}
