package g5;

import g5.f;
import g5.f.b;
import kotlin.jvm.internal.j;
import p5.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {
    public final l<f.b, E> s;

    /* renamed from: t, reason: collision with root package name */
    public final f.c<?> f13266t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [g5.f$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, p5.l<? super g5.f$b, ? extends E extends B>, p5.l<g5.f$b, E extends B>] */
    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        j.e("baseKey", cVar);
        j.e("safeCast", lVar);
        this.s = lVar;
        this.f13266t = cVar instanceof b ? (f.c<B>) ((b) cVar).f13266t : cVar;
    }
}
