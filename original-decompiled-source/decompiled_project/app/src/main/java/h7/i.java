package h7;

import h7.e;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12318a = new a();

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // h7.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(g7.p pVar, w7.f fVar, vg.c cVar) {
            h hVar;
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i10 = hVar.f12317d;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    hVar.f12317d = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    hVar = new h(this, cVar);
                }
            }
            Object objA = hVar.f12315b;
            Object obj = ug.a.f29706a;
            int i11 = hVar.f12317d;
            if (i11 == 0) {
                pg.q.b(objA);
                hVar.f12314a = fVar;
                hVar.f12317d = 1;
                objA = pVar.a(fVar, hVar);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = hVar.f12314a;
                pg.q.b(objA);
            }
            w7.i iVar = (w7.i) objA;
            if (iVar instanceof w7.o) {
                w7.o oVar = (w7.o) iVar;
                return new e.b.d(f1.m.a(oVar.f31411a, fVar.f31328a, 1), oVar);
            }
            if (!(iVar instanceof w7.e)) {
                throw new pg.l();
            }
            w7.e eVar = (w7.e) iVar;
            g7.l lVar = eVar.f31325a;
            return new e.b.C0113b(lVar != null ? f1.m.a(lVar, fVar.f31328a, 1) : null, eVar);
        }
    }

    Object a(g7.p pVar, w7.f fVar, vg.c cVar);
}
