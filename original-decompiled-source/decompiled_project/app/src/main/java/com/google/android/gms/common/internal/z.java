package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes2.dex */
public final class z extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f6215b;

    public z(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f6214a = intent;
        this.f6215b = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.b0
    public final void a() {
        Intent intent = this.f6214a;
        if (intent != null) {
            this.f6215b.startActivityForResult(intent, 2);
        }
    }
}
