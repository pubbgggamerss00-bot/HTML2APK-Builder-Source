package h9;

import android.app.Activity;
import android.content.Context;
import com.basitce.htmltoapk.HtmlToApkApplication;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsScreenKt$SettingsScreen$2$1", f = "SettingsScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f12717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f12718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f12720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(x0.n1 n1Var, b4 b4Var, Context context, Activity activity, tg.e eVar) {
        super(2, eVar);
        this.f12717a = n1Var;
        this.f12718b = b4Var;
        this.f12719c = context;
        this.f12720d = activity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new l2(this.f12717a, this.f12718b, this.f12719c, this.f12720d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((l2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        String str = (String) this.f12717a.getValue();
        if (str != null) {
            this.f12718b.f12545i.setValue(null);
            l9.d0.f16789a.getClass();
            Context context = this.f12719c;
            String strH = l9.d0.h(context, str);
            HtmlToApkApplication.Companion.getClass();
            HtmlToApkApplication.currentLanguage = strH;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.r.d(applicationContext, "getApplicationContext(...)");
            Context contextI = l9.d0.i(applicationContext, strH);
            HtmlToApkApplication.localizedContext = contextI;
            BuildLogger.INSTANCE.attach(contextI);
            Activity activity = this.f12720d;
            if (activity != null) {
                activity.recreate();
            }
        }
        return pg.f0.f21461a;
    }
}
