package f9;

import com.basitce.htmltoapk.domain.model.WebViewSettings;

/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l f11083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11084c;

    public /* synthetic */ z6(eh.l lVar, Object obj, int i10) {
        this.f11082a = i10;
        this.f11083b = lVar;
        this.f11084c = obj;
    }

    /* JADX WARN: Failed to inline method: com.basitce.htmltoapk.domain.model.WebViewSettings.copy$default(com.basitce.htmltoapk.domain.model.WebViewSettings, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, boolean, java.lang.String, boolean, java.lang.String, int, int, int, int, int, int, int, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int, java.lang.Object):com.basitce.htmltoapk.domain.model.WebViewSettings */
    /* JADX WARN: Failed to replace arg (r79v0 'i' int) for method inline: com.basitce.htmltoapk.domain.model.WebViewSettings.copy$default(com.basitce.htmltoapk.domain.model.WebViewSettings, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, boolean, java.lang.String, boolean, java.lang.String, int, int, int, int, int, int, int, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int, java.lang.Object):com.basitce.htmltoapk.domain.model.WebViewSettings */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f11082a) {
            case 0:
                x0.n1 n1Var = (x0.n1) this.f11084c;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                this.f11083b.invoke(it);
                n1Var.setValue(Boolean.FALSE);
                break;
            default:
                this.f11083b.invoke(WebViewSettings.copy$default((WebViewSettings) this.f11084c, false, false, false, false, false, false, false, false, false, ((Boolean) obj).booleanValue(), 0, 0, null, 0, false, false, false, false, false, false, false, null, false, null, false, null, 0, 0, 0, 0, 0, 0, 0, null, false, false, null, null, null, 0, null, null, 0, null, null, null, false, false, false, false, false, false, false, 0, -513, 4194303, null));
                break;
        }
        return pg.f0.f21461a;
    }
}
