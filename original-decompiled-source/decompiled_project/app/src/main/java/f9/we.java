package f9;

import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class we implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, pg.f0> f10865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f10869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10871h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f10872j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10873k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f10874l;

    /* JADX WARN: Multi-variable type inference failed */
    public we(String str, eh.l<? super Integer, pg.f0> lVar, String str2, String str3, String str4, String str5, int i10, String str6, String str7, int i11, boolean z10) {
        this.f10864a = str;
        this.f10865b = lVar;
        this.f10866c = str2;
        this.f10867d = str3;
        this.f10868e = str4;
        this.f10869f = str5;
        this.f10870g = i10;
        this.f10871h = str6;
        this.f10872j = str7;
        this.f10873k = i11;
        this.f10874l = z10;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        int i10;
        int i11;
        z.r EditorCard = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            String strC = f3.q.c(R.string.editor_section_summary, jVar2);
            t2.l0 l0Var = ((t0.nf) jVar2.f(t0.of.f26647a)).f26545h;
            t0.ff.b(strC, null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
            b8.D(f3.q.c(R.string.editor_summary_app_name, jVar2), this.f10864a, 0, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_package, jVar2), this.f10866c, 0, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_version, jVar2), this.f10867d, 0, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_content, jVar2), this.f10868e, 1, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_display, jVar2), this.f10869f, 2, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_permissions, jVar2), f3.q.d(R.string.editor_summary_permissions_count, new Object[]{Integer.valueOf(this.f10870g)}, jVar2), 3, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_icon, jVar2), this.f10871h, 4, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_splash, jVar2), this.f10872j, 5, this.f10865b, jVar2, 384);
            b8.D(f3.q.c(R.string.editor_summary_webview, jVar2), f3.q.d(R.string.editor_summary_webview_count, new Object[]{Integer.valueOf(this.f10873k)}, jVar2), 6, this.f10865b, jVar2, 384);
            String strC2 = f3.q.c(R.string.editor_summary_ads, jVar2);
            if (this.f10874l) {
                i10 = 440436759;
                i11 = R.string.common_yes;
            } else {
                i10 = 440438070;
                i11 = R.string.common_no;
            }
            b8.D(strC2, com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, i10, i11, jVar2), 7, this.f10865b, jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
