package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends v {
    public final /* synthetic */ Intent s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f2485t;

    public t(Intent intent, GoogleApiActivity googleApiActivity) {
        this.s = intent;
        this.f2485t = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.v
    public final void a() {
        Intent intent = this.s;
        if (intent != null) {
            this.f2485t.startActivityForResult(intent, 2);
        }
    }
}
