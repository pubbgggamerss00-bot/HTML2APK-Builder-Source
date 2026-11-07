package i5;

import g5.e;
import g5.f;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: t, reason: collision with root package name */
    public final g5.f f13373t;

    /* renamed from: u, reason: collision with root package name */
    public transient g5.d<Object> f13374u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g5.d<Object> dVar) {
        super(dVar);
        g5.f context = dVar != null ? dVar.getContext() : null;
        this.f13373t = context;
    }

    @Override // i5.a
    public final void e() {
        g5.d<?> dVar = this.f13374u;
        if (dVar != null && dVar != this) {
            g5.f fVar = this.f13373t;
            j.b(fVar);
            f.b bVarT = fVar.t(e.a.s);
            j.b(bVarT);
            ((g5.e) bVarT).q(dVar);
        }
        this.f13374u = b.s;
    }

    @Override // g5.d
    public final g5.f getContext() {
        g5.f fVar = this.f13373t;
        j.b(fVar);
        return fVar;
    }
}
