package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes2.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f6586a;

    /* renamed from: b, reason: collision with root package name */
    private byte f6587b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f6587b = (byte) (this.f6587b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f6587b == 3) {
            return new e(this.f6586a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f6587b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f6587b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f6586a = j10;
        this.f6587b = (byte) (this.f6587b | 1);
        return this;
    }
}
