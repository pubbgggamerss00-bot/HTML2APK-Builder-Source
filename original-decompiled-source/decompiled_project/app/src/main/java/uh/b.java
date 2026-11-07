package uh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uh.b;

/* loaded from: classes2.dex */
public abstract class b<N extends b<N>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29717a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29718b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void a() {
        f29718b.set(this, null);
    }

    public final N b() {
        Object obj = f29717a.get(this);
        if (obj == a.f29716a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean c();

    public final void e() {
        b bVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29718b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b bVarB2 = b();
            kotlin.jvm.internal.r.b(bVarB2);
            while (bVarB2.c() && (bVarB = bVarB2.b()) != null) {
                bVarB2 = bVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(bVarB2);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(bVarB2, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(bVarB2) != obj) {
                        break;
                    }
                }
            }
            if (bVar != null) {
                f29717a.set(bVar, bVarB2);
            }
            if (!bVarB2.c() || bVarB2.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
