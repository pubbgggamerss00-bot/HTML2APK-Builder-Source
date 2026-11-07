package u8;

/* loaded from: classes.dex */
public final class r0 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f29516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.k f29517b;

    public r0(d1 d1Var, k8.k kVar) {
        this.f29516a = d1Var;
        this.f29517b = kVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Object value;
        k8.i iVar;
        long j10;
        long j11;
        long j12;
        long j13;
        k8.h hVar = this.f29516a.f29418b;
        hVar.getClass();
        k8.k kVar = this.f29517b;
        if (hVar.g(kVar)) {
            sh.z0 z0Var = hVar.f16096c;
            do {
                value = z0Var.getValue();
                iVar = (k8.i) value;
                j10 = iVar.f16120a;
                j11 = kVar.f16145g;
                j12 = iVar.f16121b;
                j13 = kVar.f16146h;
            } while (!z0Var.a(value, k8.i.a(iVar, j10 + j11, j12 + j13, iVar.f16122c + kVar.f16147i, iVar.f16123d + j11, 0, iVar.f16125f + j13, 0, 0, 0L, null, null, null, null, qg.n0.d(iVar.f16134o, kVar.f16139a), 49104)));
            hVar.b(kVar.f16148j);
            hVar.j();
        }
        return pg.f0.f21461a;
    }
}
