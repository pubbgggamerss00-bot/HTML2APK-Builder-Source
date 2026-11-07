package di;

import bi.l;
import bi.m;

/* loaded from: classes2.dex */
public final class s0 {
    public static final bi.f a(bi.f fVar, ei.b module) {
        bi.f fVarA;
        zh.b bVarB;
        kotlin.jvm.internal.r.e(fVar, "<this>");
        kotlin.jvm.internal.r.e(module, "module");
        if (!kotlin.jvm.internal.r.a(fVar.getKind(), l.a.f4276a)) {
            return fVar.isInline() ? a(fVar.h(0), module) : fVar;
        }
        kh.c cVarA = bi.b.a(fVar);
        bi.f descriptor = null;
        if (cVarA != null && (bVarB = module.b(cVarA, qg.z.f22752a)) != null) {
            descriptor = bVarB.getDescriptor();
        }
        return (descriptor == null || (fVarA = a(descriptor, module)) == null) ? fVar : fVarA;
    }

    public static final r0 b(bi.f desc, kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.r.e(desc, "desc");
        bi.l kind = desc.getKind();
        if (kind instanceof bi.d) {
            return r0.f8071f;
        }
        if (kotlin.jvm.internal.r.a(kind, m.b.f4279a)) {
            return r0.f8069d;
        }
        if (!kotlin.jvm.internal.r.a(kind, m.c.f4280a)) {
            return r0.f8068c;
        }
        bi.f fVarA = a(desc.h(0), bVar.f16437b);
        bi.l kind2 = fVarA.getKind();
        if ((kind2 instanceof bi.e) || kotlin.jvm.internal.r.a(kind2, l.b.f4277a)) {
            return r0.f8070e;
        }
        throw t.b(fVarA);
    }
}
