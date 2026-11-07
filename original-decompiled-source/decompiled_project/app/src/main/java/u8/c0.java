package u8;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$CatGameScreen$6$1", f = "CatGameScreen.kt", l = {BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Long> f29407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(n1<Long> n1Var, tg.e<? super c0> eVar) {
        super(2, eVar);
        this.f29407b = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c0(this.f29407b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29406a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f29406a = 1;
            if (ph.t0.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        this.f29407b.setValue(null);
        return pg.f0.f21461a;
    }
}
