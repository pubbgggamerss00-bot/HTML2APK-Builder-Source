package f9;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$replaceAll$1", f = "HtmlEditorScreen.kt", l = {434}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f10995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f10998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<j> f10999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f11000h;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$replaceAll$1$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends String, ? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f11001a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11002b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f11003c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f11004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f11002b = str;
            this.f11003c = str2;
            this.f11004d = str3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f11002b, this.f11003c, this.f11004d, eVar);
            aVar.f11001a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends String, ? extends Integer>> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            final tg.h coroutineContext = ((ph.i0) this.f11001a).getCoroutineContext();
            eh.a aVar2 = new eh.a() { // from class: f9.x3
                @Override // eh.a
                public final Object invoke() {
                    ph.v1.e(coroutineContext);
                    return pg.f0.f21461a;
                }
            };
            String text = this.f11002b;
            kotlin.jvm.internal.r.e(text, "text");
            String query = this.f11003c;
            kotlin.jvm.internal.r.e(query, "query");
            String replacement = this.f11004d;
            kotlin.jvm.internal.r.e(replacement, "replacement");
            List listA = f9.a.a(Integer.MAX_VALUE, aVar2, text, query);
            int length = 0;
            if (listA.isEmpty()) {
                return new pg.n(text, 0);
            }
            int length2 = text.length();
            int size = listA.size();
            int length3 = replacement.length() - query.length();
            if (length3 < 0) {
                length3 = 0;
            }
            StringBuilder sb = new StringBuilder((size * length3) + length2);
            Iterator it = listA.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                int iIntValue = ((Number) it.next()).intValue();
                if (i10 % 4096 == 0) {
                    aVar2.invoke();
                }
                sb.append((CharSequence) text, length, iIntValue);
                sb.append(replacement);
                length = query.length() + iIntValue;
                i10 = i11;
            }
            sb.append((CharSequence) text, length, text.length());
            String string = sb.toString();
            kotlin.jvm.internal.r.d(string, "toString(...)");
            return new pg.n(string, Integer.valueOf(listA.size()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(String str, Context context, String str2, String str3, x0.n1<y2.c0> n1Var, x0.n1<j> n1Var2, x0.n1<Boolean> n1Var3, tg.e<? super y3> eVar) {
        super(2, eVar);
        this.f10994b = str;
        this.f10995c = context;
        this.f10996d = str2;
        this.f10997e = str3;
        this.f10998f = n1Var;
        this.f10999g = n1Var2;
        this.f11000h = n1Var3;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y3(this.f10994b, this.f10995c, this.f10996d, this.f10997e, this.f10998f, this.f10999g, this.f11000h, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        x0.n1<y2.c0> n1Var = this.f10998f;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10993a;
        x0.n1<Boolean> n1Var2 = this.f11000h;
        String str = this.f10994b;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                wh.c cVar = ph.z0.f21632a;
                a aVar2 = new a(str, this.f10996d, this.f10997e, null);
                this.f10993a = 1;
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
            pg.n nVar = (pg.n) obj;
            String str2 = (String) nVar.f21469a;
            int iIntValue = ((Number) nVar.f21470b).intValue();
            if (iIntValue > 0) {
                List<String> list = d1.f9265a;
                if (n1Var.getValue().f33682a.f27761b == str) {
                    x0.n1<j> n1Var3 = this.f10999g;
                    int iE = t2.j0.e(n1Var.getValue().f33683b);
                    int length = str2.length();
                    if (iE > length) {
                        iE = length;
                    }
                    y2.c0 c0Var = new y2.c0(str2, t2.k0.a(iE, iE), 4);
                    n1Var.setValue(c0Var);
                    n1Var3.getValue().a(c0Var, true);
                }
            }
            Context context = this.f10995c;
            Toast.makeText(context, context.getResources().getQuantityString(R.plurals.editor_html_replaced_count, iIntValue, new Integer(iIntValue)), 0).show();
            List<String> list2 = d1.f9265a;
            n1Var2.setValue(Boolean.FALSE);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            List<String> list3 = d1.f9265a;
            n1Var2.setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
