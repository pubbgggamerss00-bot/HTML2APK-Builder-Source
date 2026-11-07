package f9;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import java.util.List;
import java.util.Set;
import l9.n;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$onPasteFromClipboard$1", f = "HtmlEditorScreen.kt", l = {359}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f10833c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<j> f10834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, x0.n1<y2.c0> n1Var, x0.n1<j> n1Var2, tg.e<? super w3> eVar) {
        super(2, eVar);
        this.f10832b = context;
        this.f10833c = n1Var;
        this.f10834d = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new w3(this.f10832b, this.f10833c, this.f10834d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((w3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10831a;
        Context context = this.f10832b;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f10831a = 1;
            obj = l9.p.b(context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        l9.n nVar = (l9.n) obj;
        if (nVar instanceof n.c) {
            Set<String> set = l9.w.f16906a;
            String strA = l9.w.a(((n.c) nVar).f16856a);
            List<String> list = d1.f9265a;
            d1.l(this.f10833c, this.f10834d, strA, strA.length());
            Toast.makeText(context, context.getString(R.string.editor_clipboard_pasted_success, new Integer(strA.length())), 0).show();
        } else if (kotlin.jvm.internal.r.a(nVar, n.a.f16854a)) {
            Toast.makeText(context, R.string.editor_clipboard_empty, 0).show();
        } else if (kotlin.jvm.internal.r.a(nVar, n.d.f16857a)) {
            Toast.makeText(context, R.string.editor_clipboard_too_large, 1).show();
        } else {
            if (!kotlin.jvm.internal.r.a(nVar, n.b.f16855a)) {
                throw new pg.l();
            }
            Toast.makeText(context, R.string.editor_clipboard_error, 0).show();
        }
        return pg.f0.f21461a;
    }
}
