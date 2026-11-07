package u0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0<Object> f29185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0<Object> a0Var, Object obj) {
        super(0);
        this.f29185a = a0Var;
        this.f29186b = obj;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        a0<Object> a0Var = this.f29185a;
        u uVar = a0Var.f28954n;
        c0<Object> c0VarE = a0Var.e();
        Object obj = this.f29186b;
        float fD = c0VarE.d(obj);
        if (!Float.isNaN(fD)) {
            uVar.a(fD, CropImageView.DEFAULT_ASPECT_RATIO);
            a0Var.i(null);
        }
        a0Var.h(obj);
        return pg.f0.f21461a;
    }
}
