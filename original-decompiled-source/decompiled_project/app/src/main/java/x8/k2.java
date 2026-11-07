package x8;

import android.content.Context;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import kotlin.jvm.internal.r;
import s8.e2;
import x8.j6;

/* loaded from: classes.dex */
public final /* synthetic */ class k2 extends kotlin.jvm.internal.p implements eh.l<String, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f32845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f32846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v8.q f32847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f32848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f32849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f32850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.l<j6.a, pg.f0> f32851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32852h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f32853j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k2(j6 j6Var, p5.x xVar, v8.q qVar, c.k<String[], Uri> kVar, c.k<String[], Uri> kVar2, Context context, eh.l<? super j6.a, pg.f0> lVar, x0.n1<Long> n1Var, x0.n1<String> n1Var2) {
        super(1, r.a.class, "onCreateHubAction", "HomeScreen_6a0pyJM$onCreateHubAction(Lcom/basitce/htmltoapk/ui/screens/home/HomeViewModel;Landroidx/navigation/NavController;Lcom/basitce/htmltoapk/ui/screens/create/CreateHubState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
        this.f32845a = j6Var;
        this.f32846b = xVar;
        this.f32847c = qVar;
        this.f32848d = kVar;
        this.f32849e = kVar2;
        this.f32850f = context;
        this.f32851g = lVar;
        this.f32852h = n1Var;
        this.f32853j = n1Var2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(String str) {
        String str2;
        String p02 = str;
        kotlin.jvm.internal.r.e(p02, "p0");
        j6 j6Var = this.f32845a;
        p5.x xVar = this.f32846b;
        v8.q qVar = this.f32847c;
        c.k<String[], Uri> kVar = this.f32848d;
        c.k<String[], Uri> kVar2 = this.f32849e;
        Context context = this.f32850f;
        eh.l<j6.a, pg.f0> onResult = this.f32851g;
        x0.n1<Long> n1Var = this.f32852h;
        x0.n1<String> n1Var2 = this.f32853j;
        boolean z10 = g5.f32665a;
        j6Var.f32779f.f18471c = n1Var.getValue();
        int iHashCode = p02.hashCode();
        if (iHashCode != -1852655216) {
            if (iHashCode != -1601351744) {
                if (iHashCode == 110834 && p02.equals(ProjectKind.PDF)) {
                    str2 = ProjectKind.PDF;
                }
            } else if (p02.equals("html_blank")) {
                str2 = ProjectKind.HTML;
            }
            str2 = ProjectKind.APK;
        } else if (!p02.equals("html_file")) {
            str2 = ProjectKind.APK;
        }
        if (j6Var.l(str2)) {
            switch (p02.hashCode()) {
                case -1852655216:
                    if (p02.equals("html_file")) {
                        kVar2.a(new String[]{"text/html", "application/xhtml+xml"});
                        break;
                    }
                    break;
                case -1601351744:
                    if (p02.equals("html_blank")) {
                        if (qVar != null) {
                            qVar.f30742f.setValue(context.getString(R.string.opening_html));
                        }
                        kotlin.jvm.internal.r.e(onResult, "onResult");
                        j6Var.n(ProjectKind.HTML, onResult, null, new p6(j6Var, null, null));
                        break;
                    }
                    break;
                case -718837726:
                    if (p02.equals("advanced")) {
                        p5.x.c(e2.v.a(e2.v.f24652c, 0L, false, null, 6), xVar);
                        if (qVar != null) {
                            qVar.f30740d.setValue(Boolean.TRUE);
                            qVar.f30739c.setValue(Boolean.FALSE);
                            break;
                        }
                    }
                    break;
                case 3112:
                    if (p02.equals("ai")) {
                        p5.x.c(e2.a.f24629c.f24627a, xVar);
                        if (qVar != null) {
                            qVar.f30740d.setValue(Boolean.TRUE);
                            qVar.f30739c.setValue(Boolean.FALSE);
                            break;
                        }
                    }
                    break;
                case 110834:
                    if (p02.equals(ProjectKind.PDF)) {
                        kVar.a(new String[]{"application/pdf"});
                        break;
                    }
                    break;
                case 107947501:
                    if (p02.equals("quick")) {
                        p5.x.c(e2.w.f24653c.f24627a, xVar);
                        if (qVar != null) {
                            qVar.f30740d.setValue(Boolean.TRUE);
                            qVar.f30739c.setValue(Boolean.FALSE);
                            break;
                        }
                    }
                    break;
            }
        } else {
            n1Var2.setValue(str2);
        }
        return pg.f0.f21461a;
    }
}
