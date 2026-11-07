package d0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i10, Object obj, Object obj2) {
        super(1);
        this.f7284a = i10;
        this.f7285b = obj;
        this.f7286c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f7284a) {
            case 0:
                r1 r1Var = (r1) this.f7285b;
                p.m0<Object> m0Var = r1Var.f7271c;
                Object obj2 = this.f7286c;
                m0Var.i(obj2);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                e0.b bVar = ((e0.i1) this.f7285b).f8204b;
                bVar.f8161s.f(bVar.i(bVar.j() + gh.a.b(bVar.o() != 0 ? fFloatValue / bVar.o() : CropImageView.DEFAULT_ASPECT_RATIO)));
                break;
            default:
                y2.c0 c0Var = (y2.c0) obj;
                if (!kotlin.jvm.internal.r.a((y2.c0) this.f7285b, c0Var)) {
                    ((eh.l) this.f7286c).invoke(c0Var);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
