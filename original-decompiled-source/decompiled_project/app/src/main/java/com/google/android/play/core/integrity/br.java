package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes2.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a, reason: collision with root package name */
    private final String f6579a;

    /* renamed from: b, reason: collision with root package name */
    private final y f6580b;

    public br(String str, y yVar) {
        this.f6579a = str;
        this.f6580b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f6580b.a(activity, i10);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f6579a;
    }
}
