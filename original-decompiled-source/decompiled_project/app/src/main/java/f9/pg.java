package f9;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$onRawHtmlChange$1", f = "ProjectEditorViewModel.kt", l = {753, 755}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class pg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f10254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(fg fgVar, String str, tg.e<? super pg> eVar) {
        super(2, eVar);
        this.f10254b = fgVar;
        this.f10255c = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new pg(this.f10254b, this.f10255c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((pg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (f9.fg.f(r4, r7.f10255c, r7) == r0) goto L17;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10253a;
        fg fgVar = this.f10254b;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.z0 z0Var = fgVar.f9582p;
            Boolean bool = Boolean.TRUE;
            z0Var.getClass();
            z0Var.j(null, bool);
            this.f10253a = 1;
            if (ph.t0.b(600L, this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        if (kotlin.jvm.internal.r.a(fgVar.f9600y.getValue(), "paste")) {
            this.f10253a = 2;
        }
        return pg.f0.f21461a;
    }
}
