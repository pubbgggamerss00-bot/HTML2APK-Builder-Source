package x8;

import android.content.Context;
import com.basitce.htmltoapk.R;
import t0.uc;
import x8.j6;

/* loaded from: classes.dex */
public final class p2 implements eh.l<j6.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f33072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f33073c;

    public p2(Context context, p5.x xVar, x0.n1<String> n1Var) {
        this.f33071a = context;
        this.f33072b = xVar;
        this.f33073c = n1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(j6.a aVar) {
        j6.a result = aVar;
        kotlin.jvm.internal.r.e(result, "result");
        boolean z10 = result instanceof j6.a.C0332a;
        Context context = this.f33071a;
        if (z10) {
            g5.y(context, ((j6.a.C0332a) result).f32800a, this.f33072b);
        } else if (result instanceof j6.a.c) {
            String str = ((j6.a.c) result).f32802a;
            boolean z11 = g5.f32665a;
            this.f33073c.setValue(str);
        } else {
            if (!(result instanceof j6.a.b)) {
                throw new pg.l();
            }
            uc ucVar = q8.p2.f22362a;
            String string = context.getString(R.string.document_create_failed, ((j6.a.b) result).f32801a);
            kotlin.jvm.internal.r.d(string, "getString(...)");
            q8.p2.a(string, null, null);
        }
        return pg.f0.f21461a;
    }
}
