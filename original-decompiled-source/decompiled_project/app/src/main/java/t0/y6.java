package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class y6 extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(String str) {
        super(1);
        this.f27469a = str;
    }

    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        q2.d0 d0Var2 = d0Var;
        kh.i<Object>[] iVarArr = q2.a0.f21754a;
        q2.c0<String> c0Var = q2.w.f21823d;
        kh.i<Object>[] iVarArr2 = q2.a0.f21754a;
        kh.i<Object> iVar = iVarArr2[2];
        c0Var.getClass();
        d0Var2.c(c0Var, this.f27469a);
        q2.c0<Float> c0Var2 = q2.w.f21837r;
        kh.i<Object> iVar2 = iVarArr2[9];
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        c0Var2.getClass();
        d0Var2.c(c0Var2, fValueOf);
        return pg.f0.f21461a;
    }
}
