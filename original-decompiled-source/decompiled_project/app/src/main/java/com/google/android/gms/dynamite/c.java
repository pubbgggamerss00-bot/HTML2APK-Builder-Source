package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
public final class c implements DynamiteModule.b.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6231a;

    public c(int i10) {
        this.f6231a = i10;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context) {
        return this.f6231a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, boolean z10) {
        return 0;
    }
}
