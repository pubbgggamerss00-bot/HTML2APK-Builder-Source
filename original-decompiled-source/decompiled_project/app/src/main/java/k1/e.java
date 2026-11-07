package k1;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import i2.e0;
import k1.m;
import o1.j0;
import p.z;
import q2.v;
import q2.w;

/* loaded from: classes.dex */
public final class e extends j implements q2.o, o1.m {

    /* renamed from: a, reason: collision with root package name */
    public final p f15922a;

    /* renamed from: b, reason: collision with root package name */
    public final v f15923b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f15924c;

    /* renamed from: d, reason: collision with root package name */
    public final r2.c f15925d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15926e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f15927f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final AutofillId f15928g;

    /* renamed from: h, reason: collision with root package name */
    public final z f15929h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15930i;

    public e(p pVar, v vVar, AndroidComposeView androidComposeView, r2.c cVar, String str) {
        this.f15922a = pVar;
        this.f15923b = vVar;
        this.f15924c = androidComposeView;
        this.f15925d = cVar;
        this.f15926e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw a.a("Required value was null.");
        }
        this.f15928g = autofillId;
        this.f15929h = new z((Object) null);
    }

    @Override // o1.m
    public final void a(j0 j0Var, FocusTargetNode focusTargetNode) {
        e0 e0VarF;
        q2.l lVarE;
        e0 e0VarF2;
        q2.l lVarE2;
        if (j0Var != null && (e0VarF2 = i2.k.f(j0Var)) != null && (lVarE2 = e0VarF2.e()) != null && lVarE2.f21799a.a(q2.k.f21779g)) {
            this.f15922a.f15938a.notifyViewExited(this.f15924c, e0VarF2.f13810b);
        }
        if (focusTargetNode == null || (e0VarF = i2.k.f(focusTargetNode)) == null || (lVarE = e0VarF.e()) == null || !lVarE.f21799a.a(q2.k.f21779g)) {
            return;
        }
        int i10 = e0VarF.f13810b;
        this.f15925d.f23146a.b(i10, new c(this, i10));
    }

    @Override // q2.o
    public final void b(e0 e0Var, q2.l lVar) {
        t2.b bVar;
        t2.b bVar2;
        q2.l lVarE = e0Var.e();
        int i10 = e0Var.f13810b;
        String str = null;
        String str2 = (lVar == null || (bVar2 = (t2.b) q2.m.a(lVar, w.C)) == null) ? null : bVar2.f27761b;
        if (lVarE != null && (bVar = (t2.b) q2.m.a(lVarE, w.C)) != null) {
            str = bVar.f27761b;
        }
        boolean z10 = false;
        if (str2 != str) {
            AndroidComposeView androidComposeView = this.f15924c;
            p pVar = this.f15922a;
            if (str2 == null) {
                pVar.a(androidComposeView, i10, true);
            } else if (str == null) {
                pVar.a(androidComposeView, i10, false);
            } else if (kotlin.jvm.internal.r.a((m) q2.m.a(lVarE, w.f21836q), m.a.f15934a)) {
                pVar.f15938a.notifyValueChanged(androidComposeView, i10, AutofillValue.forText(str.toString()));
            }
        }
        boolean z11 = lVar != null && lVar.f21799a.a(w.f21835p);
        if (lVarE != null && lVarE.f21799a.a(w.f21835p)) {
            z10 = true;
        }
        if (z11 != z10) {
            z zVar = this.f15929h;
            if (z10) {
                zVar.a(i10);
            } else {
                zVar.e(i10);
            }
        }
    }
}
