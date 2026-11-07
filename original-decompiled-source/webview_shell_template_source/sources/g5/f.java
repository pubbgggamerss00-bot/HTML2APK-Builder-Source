package g5;

import g5.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import p5.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface f {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: g5.f$a$a, reason: collision with other inner class name */
        public static final class C0064a extends k implements p<f, b, f> {
            public static final C0064a s = new C0064a(2);

            @Override // p5.p
            public final f b(f fVar, b bVar) {
                f fVar2 = fVar;
                b bVar2 = bVar;
                j.e("acc", fVar2);
                j.e("element", bVar2);
                f fVarB = fVar2.b(bVar2.getKey());
                g gVar = g.s;
                if (fVarB == gVar) {
                    return bVar2;
                }
                e.a aVar = e.a.s;
                e eVar = (e) fVarB.t(aVar);
                if (eVar == null) {
                    return new g5.c(bVar2, fVarB);
                }
                f fVarB2 = fVarB.b(aVar);
                return fVarB2 == gVar ? new g5.c(eVar, bVar2) : new g5.c(eVar, new g5.c(bVar2, fVarB2));
            }
        }

        public static f a(f fVar, f fVar2) {
            j.e("context", fVar2);
            return fVar2 == g.s ? fVar : (f) fVar2.s(fVar, C0064a.s);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b extends f {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class a {
            public static <R> R a(b bVar, R r5, p<? super R, ? super b, ? extends R> pVar) {
                j.e("operation", pVar);
                return pVar.b(r5, bVar);
            }

            public static f b(b bVar, c<?> cVar) {
                j.e("key", cVar);
                return j.a(bVar.getKey(), cVar) ? g.s : bVar;
            }

            public static f c(b bVar, f fVar) {
                j.e("context", fVar);
                return a.a(bVar, fVar);
            }
        }

        c<?> getKey();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c<E extends b> {
    }

    f b(c<?> cVar);

    f e(f fVar);

    <R> R s(R r5, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E t(c<E> cVar);
}
