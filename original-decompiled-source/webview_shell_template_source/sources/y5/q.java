package y5;

import g5.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.k implements p5.p<g5.f, f.b, g5.f> {
    public final /* synthetic */ kotlin.jvm.internal.p<g5.f> s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.jvm.internal.p pVar) {
        super(2);
        this.s = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, g5.f] */
    @Override // p5.p
    public final g5.f b(g5.f fVar, f.b bVar) {
        g5.f fVar2 = fVar;
        f.b bVar2 = bVar;
        if (!(bVar2 instanceof o)) {
            return fVar2.e(bVar2);
        }
        kotlin.jvm.internal.p<g5.f> pVar = this.s;
        if (pVar.s.t(bVar2.getKey()) == null) {
            return fVar2.e(((o) bVar2).k());
        }
        pVar.s = pVar.s.b(bVar2.getKey());
        return fVar2.e(((o) bVar2).v());
    }
}
