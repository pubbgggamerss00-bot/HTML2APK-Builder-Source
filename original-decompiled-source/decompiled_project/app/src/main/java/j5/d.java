package j5;

import j5.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d extends a {
    public d(a initialExtras) {
        r.e(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f15158a;
        r.e(initialExtras2, "initialExtras");
        this.f15158a.putAll(initialExtras2);
    }

    @Override // j5.a
    public final <T> T a(a.b<T> bVar) {
        return (T) this.f15158a.get(bVar);
    }

    public /* synthetic */ d(Object obj) {
        this((a) a.C0143a.f15159b);
    }
}
