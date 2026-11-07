package sh;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b1 extends th.d<z0<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f24947a = new AtomicReference<>(null);

    @Override // th.d
    public final boolean a(th.b bVar) {
        AtomicReference<Object> atomicReference = this.f24947a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(a1.f24929a);
        return true;
    }

    @Override // th.d
    public final tg.e[] b(th.b bVar) {
        this.f24947a.set(null);
        return th.c.f28782a;
    }
}
