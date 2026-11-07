package com.google.android.gms.common.api;

/* loaded from: classes2.dex */
public final class p extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final pa.c f6076a;

    public p(pa.c cVar) {
        this.f6076a = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f6076a));
    }
}
