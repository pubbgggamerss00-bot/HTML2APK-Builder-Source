package e9;

import kotlinx.serialization.PolymorphicSerializer;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8591a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f8591a) {
            case 0:
                ((p5.w0) obj).a(new a9.j0(1), e2.e.f24635c.f24627a);
                return pg.f0.f21461a;
            default:
                kh.c it = (kh.c) obj;
                kotlin.jvm.internal.r.e(it, "it");
                zh.b bVarC = zh.n.c(it);
                if (bVarC == null) {
                    bVarC = kotlinx.serialization.internal.k0.c(it) ? new PolymorphicSerializer(it) : null;
                }
                if (bVarC != null) {
                    return ai.a.d(bVarC);
                }
                return null;
        }
    }
}
