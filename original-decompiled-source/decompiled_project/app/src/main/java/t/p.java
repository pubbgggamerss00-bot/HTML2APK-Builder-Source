package t;

import com.yalantis.ucrop.view.CropImageView;
import q1.s1;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1.a f25311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.u0 f25312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s1.a aVar, q1.u0 u0Var) {
        super(1);
        this.f25311a = aVar;
        this.f25312b = u0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        s1.e.W(cVar2, this.f25311a.f21733a, this.f25312b, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
        return pg.f0.f21461a;
    }
}
