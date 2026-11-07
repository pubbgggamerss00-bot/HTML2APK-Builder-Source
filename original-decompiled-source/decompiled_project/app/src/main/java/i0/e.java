package i0;

import com.yalantis.ucrop.view.CropImageView;
import s1.a;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.n1 f13263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1.p0 f13264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f10, q1.n1 n1Var, q1.p0 p0Var) {
        super(1);
        this.f13262a = f10;
        this.f13263b = n1Var;
        this.f13264c = p0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        float f10 = this.f13262a;
        q1.n1 n1Var = this.f13263b;
        q1.p0 p0Var = this.f13264c;
        a.b bVarQ0 = cVar2.Q0();
        long jD = bVarQ0.d();
        bVarQ0.a().d();
        try {
            s1.b bVar = bVarQ0.f24180a;
            bVar.f(f10, CropImageView.DEFAULT_ASPECT_RATIO);
            bVar.d(45.0f, 0L);
            cVar2.D1(n1Var, s1.h.f24186a, p0Var);
            t.r.a(bVarQ0, jD);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            t.r.a(bVarQ0, jD);
            throw th2;
        }
    }
}
