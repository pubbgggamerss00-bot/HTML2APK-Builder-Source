package cc;

import android.content.Context;

/* loaded from: classes2.dex */
public final class i implements h6.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5370a;

    public i(Context context) {
        this.f5370a = context;
    }

    @Override // h6.c
    public h6.b a(String fileName) {
        kotlin.jvm.internal.r.e(fileName, "fileName");
        return new y5.a(((i6.c) this.f5370a).P());
    }

    public i(i6.c openHelper) {
        kotlin.jvm.internal.r.e(openHelper, "openHelper");
        this.f5370a = openHelper;
    }
}
