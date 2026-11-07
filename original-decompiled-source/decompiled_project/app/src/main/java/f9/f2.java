package f9;

import java.util.List;
import java.util.Set;
import l9.w;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$13$1", f = "HtmlEditorScreen.kt", l = {685}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public x0.n1 f9519a;

    /* renamed from: b, reason: collision with root package name */
    public int f9520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<w.a> f9521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f9522d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$13$1$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super w.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<y2.c0> f9523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.n1<y2.c0> n1Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f9523a = n1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f9523a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super w.a> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            Set<String> set = l9.w.f16906a;
            List<String> list = d1.f9265a;
            return l9.w.c(this.f9523a.getValue().f33682a.f27761b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(x0.n1<w.a> n1Var, x0.n1<y2.c0> n1Var2, tg.e<? super f2> eVar) {
        super(2, eVar);
        this.f9521c = n1Var;
        this.f9522d = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new f2(this.f9521c, this.f9522d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((f2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        x0.n1<w.a> n1Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f9520b;
        if (i10 == 0) {
            pg.q.b(obj);
            List<String> list = d1.f9265a;
            x0.n1<w.a> n1Var2 = this.f9521c;
            if (n1Var2.getValue() == null) {
                wh.c cVar = ph.z0.f21632a;
                a aVar2 = new a(this.f9522d, null);
                this.f9519a = n1Var2;
                this.f9520b = 1;
                Object objE = ph.h.e(cVar, aVar2, this);
                if (objE == aVar) {
                    return aVar;
                }
                n1Var = n1Var2;
                obj = objE;
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n1Var = this.f9519a;
        pg.q.b(obj);
        List<String> list2 = d1.f9265a;
        n1Var.setValue((w.a) obj);
        return pg.f0.f21461a;
    }
}
