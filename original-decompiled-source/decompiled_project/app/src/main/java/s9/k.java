package s9;

import android.content.Context;

/* loaded from: classes.dex */
public final class k implements t9.b<j> {

    /* renamed from: a, reason: collision with root package name */
    public final t9.c f24790a;

    /* renamed from: b, reason: collision with root package name */
    public final i f24791b;

    public k(t9.c cVar, i iVar) {
        this.f24790a = cVar;
        this.f24791b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // og.a
    public final Object get() {
        return new j((Context) this.f24790a.f28617a, (h) this.f24791b.get());
    }
}
