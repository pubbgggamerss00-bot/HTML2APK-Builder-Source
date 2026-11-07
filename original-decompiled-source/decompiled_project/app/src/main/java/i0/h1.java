package i0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

@vg.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f13309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0.a f13310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2 f13312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4 f13313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.v f13314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f0.a aVar, y2.c0 c0Var, i2 i2Var, l4 l4Var, y2.v vVar, tg.e<? super h1> eVar) {
        super(2, eVar);
        this.f13310b = aVar;
        this.f13311c = c0Var;
        this.f13312d = i2Var;
        this.f13313e = l4Var;
        this.f13314f = vVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h1(this.f13310b, this.f13311c, this.f13312d, this.f13313e, this.f13314f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f13309a;
        if (i10 == 0) {
            pg.q.b(obj);
            z2 z2Var = this.f13312d.f13337a;
            t2.h0 h0Var = this.f13313e.f13418a;
            this.f13309a = 1;
            int iB = this.f13314f.b(t2.j0.d(this.f13311c.f33683b));
            Object objA = this.f13310b.a(iB < h0Var.f27819a.f27809a.f27761b.length() ? h0Var.b(iB) : iB != 0 ? h0Var.b(iB - 1) : new p1.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, (int) (j3.a(z2Var.f13726b, z2Var.f13731g, z2Var.f13732h, j3.f13380a, 1) & BodyPartID.bodyIdMax)), this);
            if (objA != aVar) {
                objA = pg.f0.f21461a;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
