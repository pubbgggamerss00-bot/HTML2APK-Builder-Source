package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f6520a;

    /* renamed from: b, reason: collision with root package name */
    private final y f6521b;

    public aq(String str, y yVar) {
        this.f6520a = str;
        this.f6521b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f6521b.a(activity, i10);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f6520a;
    }
}
