package com.google.android.gms.common.internal;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class a0 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.k f6081b;

    public a0(Intent intent, com.google.android.gms.common.api.internal.k kVar) {
        this.f6080a = intent;
        this.f6081b = kVar;
    }

    @Override // com.google.android.gms.common.internal.b0
    public final void a() {
        Intent intent = this.f6080a;
        if (intent != null) {
            this.f6081b.startActivityForResult(intent, 2);
        }
    }
}
