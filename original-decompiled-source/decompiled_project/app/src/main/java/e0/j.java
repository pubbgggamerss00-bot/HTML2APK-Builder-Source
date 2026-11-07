package e0;

import androidx.compose.ui.platform.AndroidComposeView;
import d0.b2;
import j2.n1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        super(0);
        this.f8205a = i10;
        this.f8206b = obj;
        this.f8207c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f8205a) {
            case 0:
                d0 d0Var = (d0) ((x0.g0) this.f8206b).getValue();
                b bVar = (b) this.f8207c;
                return new f0(bVar, d0Var, new b2((jh.g) bVar.f8146d.f8282f.getValue(), d0Var));
            default:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f8206b;
                n1 androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
                i3.l lVar = (i3.l) this.f8207c;
                androidViewsHandler$ui_release.removeViewInLayout(lVar);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(lVar));
                lVar.setImportantForAccessibility(0);
                return pg.f0.f21461a;
        }
    }
}
