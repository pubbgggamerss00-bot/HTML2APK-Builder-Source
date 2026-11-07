package y9;

import android.content.Context;

/* loaded from: classes.dex */
public final class e implements t9.b<String> {

    /* renamed from: a, reason: collision with root package name */
    public final og.a<Context> f34325a;

    public e(og.a<Context> aVar) {
        this.f34325a = aVar;
    }

    @Override // og.a
    public final Object get() {
        String packageName = this.f34325a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
