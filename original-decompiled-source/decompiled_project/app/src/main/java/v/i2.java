package v;

import com.yalantis.ucrop.view.CropImageView;
import s.q2;

/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f29926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f29927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f29928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i2(k2 k2Var, float f10, eh.l<? super Float, pg.f0> lVar) {
        super(1);
        this.f29926a = k2Var;
        this.f29927b = f10;
        this.f29928c = lVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Long l10) {
        long jLongValue = l10.longValue();
        k2 k2Var = this.f29926a;
        if (k2Var.f29976b == Long.MIN_VALUE) {
            k2Var.f29976b = jLongValue;
        }
        s.o oVar = new s.o(k2Var.f29979e);
        long jB = this.f29927b == CropImageView.DEFAULT_ASPECT_RATIO ? k2Var.f29975a.b(new s.o(k2Var.f29979e), k2.f29974f, k2Var.f29977c) : gh.a.c((jLongValue - k2Var.f29976b) / r3);
        q2<s.o> q2Var = k2Var.f29975a;
        s.o oVar2 = k2.f29974f;
        float f10 = ((s.o) q2Var.d(jB, oVar, oVar2, k2Var.f29977c)).f23852a;
        k2Var.f29977c = (s.o) k2Var.f29975a.c(jB, oVar, oVar2, k2Var.f29977c);
        k2Var.f29976b = jLongValue;
        float f11 = k2Var.f29979e - f10;
        k2Var.f29979e = f10;
        this.f29928c.invoke(Float.valueOf(f11));
        return pg.f0.f21461a;
    }
}
