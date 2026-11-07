package m7;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import eh.p;
import pg.f0;
import pg.q;
import ph.i0;
import vg.i;

@vg.e(c = "coil3.gif.AnimatedImageDecoder$wrapDrawable$2", f = "AnimatedImageDecoder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Drawable f17690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f17691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f17692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Drawable drawable, eh.a<f0> aVar, eh.a<f0> aVar2, tg.e<? super d> eVar) {
        super(2, eVar);
        this.f17690a = drawable;
        this.f17691b = aVar;
        this.f17692c = aVar2;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new d(this.f17690a, this.f17691b, this.f17692c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        ((AnimatedImageDrawable) this.f17690a).registerAnimationCallback(new n7.d(this.f17691b, this.f17692c));
        return f0.f21461a;
    }
}
