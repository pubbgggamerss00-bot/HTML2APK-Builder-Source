package n8;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$setPremium$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g0 extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f18449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z10, m1 m1Var, tg.e<? super g0> eVar) {
        super(2, eVar);
        this.f18448b = z10;
        this.f18449c = m1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        g0 g0Var = new g0(this.f18448b, this.f18449c, eVar);
        g0Var.f18447a = obj;
        return g0Var;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((g0) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18447a;
        e.a<Boolean> aVar2 = m1.f18523y;
        boolean z10 = this.f18448b;
        bVar.e(aVar2, Boolean.valueOf(z10));
        if (z10) {
            e.a<String> aVar3 = m1.f18524z;
            Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = this.f18449c.f18525a;
            String packageName = hilt_HtmlToApkApplication.getPackageName();
            kotlin.jvm.internal.r.d(packageName, "getPackageName(...)");
            try {
                strValueOf = String.valueOf(hilt_HtmlToApkApplication.getPackageManager().getPackageInfo(hilt_HtmlToApkApplication.getPackageName(), 0).firstInstallTime);
            } catch (Exception unused) {
                strValueOf = "default_salt";
            }
            bVar.e(aVar3, l9.r0.a(l9.r0.b(packageName, strValueOf)));
        } else {
            bVar.d(m1.f18524z);
        }
        return pg.f0.f21461a;
    }
}
