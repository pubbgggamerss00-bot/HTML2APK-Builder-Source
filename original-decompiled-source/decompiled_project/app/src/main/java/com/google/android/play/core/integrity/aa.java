package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class aa implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final aj f6487a;

    public aa(aj ajVar) {
        this.f6487a = ajVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f6487a.c(integrityTokenRequest);
    }
}
