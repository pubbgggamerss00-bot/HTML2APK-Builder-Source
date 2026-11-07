package f9;

import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$goToLine$1", f = "HtmlEditorScreen.kt", l = {453}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f10768d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$goToLine$1$offset$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10769a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f10769a = i10;
            this.f10770b = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f10769a, this.f10770b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super Integer> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            int i10 = 0;
            for (int i11 = this.f10769a - 1; i11 > 0; i11--) {
                int iX = mh.x.x(this.f10770b, '\n', i10, 4);
                if (iX < 0) {
                    break;
                }
                i10 = iX + 1;
            }
            return new Integer(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(String str, int i10, x0.n1<y2.c0> n1Var, tg.e<? super v3> eVar) {
        super(2, eVar);
        this.f10766b = str;
        this.f10767c = i10;
        this.f10768d = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new v3(this.f10766b, this.f10767c, this.f10768d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10765a;
        String str = this.f10766b;
        if (i10 == 0) {
            pg.q.b(obj);
            wh.c cVar = ph.z0.f21632a;
            a aVar2 = new a(this.f10767c, str, null);
            this.f10765a = 1;
            obj = ph.h.e(cVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        List<String> list = d1.f9265a;
        x0.n1<y2.c0> n1Var = this.f10768d;
        if (n1Var.getValue().f33682a.f27761b == str) {
            n1Var.setValue(y2.c0.b(n1Var.getValue(), null, t2.k0.a(iIntValue, iIntValue), 5));
        }
        return pg.f0.f21461a;
    }
}
