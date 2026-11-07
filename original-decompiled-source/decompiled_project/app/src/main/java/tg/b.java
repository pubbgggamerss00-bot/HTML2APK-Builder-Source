package tg;

import eh.l;
import kotlin.jvm.internal.r;
import tg.h;
import tg.h.a;

/* loaded from: classes2.dex */
public abstract class b<B extends h.a, E extends B> implements h.b<E> {

    /* renamed from: a, reason: collision with root package name */
    public final l<h.a, E> f28763a;

    /* renamed from: b, reason: collision with root package name */
    public final h.b<?> f28764b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [tg.h$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [eh.l<? super tg.h$a, ? extends E extends B>, eh.l<tg.h$a, E extends B>] */
    public b(h.b<B> baseKey, l<? super h.a, ? extends E> lVar) {
        r.e(baseKey, "baseKey");
        this.f28763a = lVar;
        this.f28764b = baseKey instanceof b ? (h.b<B>) ((b) baseKey).f28764b : baseKey;
    }
}
