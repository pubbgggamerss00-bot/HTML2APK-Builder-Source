package f9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$stateFlow$1", f = "ProjectEditorViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class lh extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh.z0 f10009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.l0 f10010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg f10012e;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.l0 f10013a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10014b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fg f10015c;

        public a(androidx.lifecycle.l0 l0Var, String str, fg fgVar) {
            this.f10013a = l0Var;
            this.f10014b = str;
            this.f10015c = fgVar;
        }

        @Override // sh.g
        public final Object c(T t3, tg.e<? super pg.f0> eVar) {
            this.f10013a.c(t3, this.f10014b);
            fg.h(this.f10015c);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(sh.z0 z0Var, androidx.lifecycle.l0 l0Var, String str, fg fgVar, tg.e eVar) {
        super(2, eVar);
        this.f10009b = z0Var;
        this.f10010c = l0Var;
        this.f10011d = str;
        this.f10012e = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new lh(this.f10009b, this.f10010c, this.f10011d, this.f10012e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        ((lh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10008a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        a aVar2 = new a(this.f10010c, this.f10011d, this.f10012e);
        this.f10008a = 1;
        this.f10009b.b(aVar2, this);
        return aVar;
    }
}
