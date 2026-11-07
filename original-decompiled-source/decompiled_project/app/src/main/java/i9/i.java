package i9;

import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import ph.i0;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportDeveloperScreenKt$SupportDeveloperScreen$1$1", f = "SupportDeveloperScreen.kt", l = {HeaderItem.METHOD_START_OFFSET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f14349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f14350c;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f14351a;

        public a(n1<Boolean> n1Var) {
            this.f14351a = n1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            this.f14351a.setValue(Boolean.TRUE);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, n1<Boolean> n1Var, tg.e<? super i> eVar) {
        super(2, eVar);
        this.f14349b = rVar;
        this.f14350c = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i(this.f14349b, this.f14350c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14348a;
        if (i10 == 0) {
            pg.q.b(obj);
            th.l lVar = this.f14349b.f14389e;
            a aVar2 = new a(this.f14350c);
            this.f14348a = 1;
            if (lVar.b(aVar2, this) == aVar) {
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
