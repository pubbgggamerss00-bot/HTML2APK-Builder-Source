package i0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i2 i2Var, long j10) {
        super(1);
        this.f13277a = i2Var;
        this.f13278b = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(s1.e eVar) {
        s1.e eVar2 = eVar;
        i2 i2Var = this.f13277a;
        if (((Boolean) i2Var.f13355s.getValue()).booleanValue() || ((Boolean) i2Var.f13356t.getValue()).booleanValue()) {
            s1.e.X0(eVar2, this.f13278b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
        }
        return pg.f0.f21461a;
    }
}
