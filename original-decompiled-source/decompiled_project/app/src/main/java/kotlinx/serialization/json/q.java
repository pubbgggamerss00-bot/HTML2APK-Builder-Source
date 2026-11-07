package kotlinx.serialization.json;

import di.y;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class q {
    public static p a(eh.l lVar) {
        b.a from = b.f16435d;
        kotlin.jvm.internal.r.e(from, "from");
        d dVar = new d();
        f fVar = from.f16436a;
        boolean z10 = fVar.f16444c;
        dVar.f16440a = fVar.f16442a;
        dVar.f16441b = fVar.f16443b;
        String str = fVar.f16445d;
        String str2 = fVar.f16446e;
        a aVar = fVar.f16448g;
        boolean z11 = fVar.f16447f;
        ei.b module = from.f16437b;
        lVar.invoke(dVar);
        if (!kotlin.jvm.internal.r.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        f fVar2 = new f(dVar.f16440a, dVar.f16441b, z10, str, str2, z11, aVar);
        kotlin.jvm.internal.r.e(module, "module");
        p pVar = new p(fVar2, module);
        if (module.equals(ei.c.f8743a)) {
            return pVar;
        }
        y yVar = new y();
        a aVar2 = a.f16432a;
        module.a(yVar);
        return pVar;
    }
}
