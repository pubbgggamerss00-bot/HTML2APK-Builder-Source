package i8;

import a9.z1;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.R;
import eh.p;
import java.util.List;
import kotlin.jvm.internal.r;
import l9.d0;
import pg.f0;
import pg.q;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$restorePurchases$2", f = "BillingManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f14254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z1 z1Var, j jVar, tg.e eVar) {
        super(2, eVar);
        this.f14254a = z1Var;
        this.f14255b = jVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new m(this.f14254a, this.f14255b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((m) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        Boolean bool = Boolean.FALSE;
        List<String> list = j.f14217r;
        j jVar = this.f14255b;
        jVar.getClass();
        d0 d0Var = d0.f16789a;
        Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = jVar.f14221a;
        d0Var.getClass();
        String string = d0.g(hilt_HtmlToApkApplication).getString(R.string.billing_connecting);
        r.d(string, "getString(...)");
        this.f14254a.invoke(bool, string);
        return f0.f21461a;
    }
}
