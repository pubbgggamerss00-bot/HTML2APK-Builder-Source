package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes2.dex */
public class StandardIntegrityException extends com.google.android.gms.common.api.b {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f6484a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i10, Throwable th2) {
        super(new Status(i10, "Standard Integrity API error (" + i10 + "): " + com.google.android.play.core.integrity.model.b.a(i10) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f6484a = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f6484a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
