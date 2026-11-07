package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes2.dex */
final class az implements StandardIntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final bn f6536a;

    /* renamed from: b, reason: collision with root package name */
    private final bt f6537b;

    public az(bn bnVar, bt btVar) {
        this.f6536a = bnVar;
        this.f6537b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) throws Exception {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l10.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f6537b;
        final int i10 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i10) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f6582b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f6583c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f6581a.a(this.f6582b, this.f6583c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f6536a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f6534a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
