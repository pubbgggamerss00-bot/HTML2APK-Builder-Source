package t0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class w6 extends kotlin.jvm.internal.s implements eh.p<f3.p, f3.b, pg.n<? extends u0.c0<ib>, ? extends ib>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f27285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(hb hbVar) {
        super(2);
        this.f27285a = hbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[PHI: r0
      0x004a: PHI (r0v9 t0.ib) = (r0v7 t0.ib), (r0v8 t0.ib) binds: [B:12:0x0048, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // eh.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.n<? extends u0.c0<ib>, ? extends ib> invoke(f3.p pVar, f3.b bVar) {
        long j10 = pVar.f8826a;
        float fH = f3.b.h(bVar.f8811a);
        hb hbVar = this.f27285a;
        v6 v6Var = new v6(fH, j10, hbVar);
        u0.d0<ib> d0Var = new u0.d0<>();
        v6Var.invoke(d0Var);
        LinkedHashMap linkedHashMap = d0Var.f28972a;
        u0.o0 o0Var = new u0.o0(linkedHashMap);
        int iOrdinal = ((ib) hbVar.f26015b.f28948h.getValue()).ordinal();
        ib ibVar = ib.f26108a;
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new pg.l();
            }
            ib ibVar2 = ib.f26110c;
            if (linkedHashMap.containsKey(ibVar2)) {
                ibVar = ibVar2;
            } else {
                ibVar2 = ib.f26109b;
                if (linkedHashMap.containsKey(ibVar2)) {
                }
            }
        }
        return new pg.n<>(o0Var, ibVar);
    }
}
