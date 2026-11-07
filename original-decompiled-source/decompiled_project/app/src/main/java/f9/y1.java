package f9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$1$1", f = "HtmlEditorScreen.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f10965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f10968f;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$1$1$prefs$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super k>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f10969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f10969a = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f10969a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super k> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            Context context = this.f10969a;
            kotlin.jvm.internal.r.e(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("html_editor_prefs", 0);
            return new k(jh.j.l(sharedPreferences.getFloat("font_size", 13.0f), 10.0f, 22.0f), sharedPreferences.getBoolean("word_wrap", false), sharedPreferences.getBoolean("smart_typing", true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(x0.n1<Boolean> n1Var, Context context, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3, x0.k1 k1Var, tg.e<? super y1> eVar) {
        super(2, eVar);
        this.f10964b = n1Var;
        this.f10965c = context;
        this.f10966d = n1Var2;
        this.f10967e = n1Var3;
        this.f10968f = k1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y1(this.f10964b, this.f10965c, this.f10966d, this.f10967e, this.f10968f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10963a;
        x0.n1<Boolean> n1Var = this.f10964b;
        if (i10 == 0) {
            pg.q.b(obj);
            List<String> list = d1.f9265a;
            if (!n1Var.getValue().booleanValue()) {
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(this.f10965c, null);
                this.f10963a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        k kVar = (k) obj;
        boolean z10 = kVar.f9900a;
        List<String> list2 = d1.f9265a;
        this.f10966d.setValue(Boolean.valueOf(z10));
        this.f10967e.setValue(Boolean.valueOf(kVar.f9901b));
        this.f10968f.e(kVar.f9902c);
        n1Var.setValue(Boolean.TRUE);
        return pg.f0.f21461a;
    }
}
