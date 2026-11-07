package di;

import java.util.Set;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<bi.f> f8054a = qg.o.C(new bi.f[]{ai.a.serializer(pg.x.f21487b).getDescriptor(), ai.a.serializer(pg.z.f21492b).getDescriptor(), ai.a.serializer(pg.v.f21482b).getDescriptor(), ai.a.serializer(pg.c0.f21454b).getDescriptor()});

    public static final boolean a(bi.f fVar) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        return fVar.isInline() && f8054a.contains(fVar);
    }
}
