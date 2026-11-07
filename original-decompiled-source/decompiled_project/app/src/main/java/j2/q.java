package j2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class q extends y3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f14860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i2.e0 f14861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f14862f;

    public q(AndroidComposeView androidComposeView, i2.e0 e0Var, AndroidComposeView androidComposeView2) {
        this.f14860d = androidComposeView;
        this.f14861e = e0Var;
        this.f14862f = androidComposeView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, z3.j jVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f34725a;
        this.f33785a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.f14860d;
        androidx.compose.ui.platform.c cVar = androidComposeView.f1249t;
        if (cVar.u()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        i2.e0 e0Var = this.f14861e;
        i2.e0 e0VarG = e0Var.G();
        while (true) {
            if (e0VarG == null) {
                e0VarG = null;
                break;
            } else if (e0VarG.I.d(8)) {
                break;
            } else {
                e0VarG = e0VarG.G();
            }
        }
        Integer numValueOf = e0VarG != null ? Integer.valueOf(e0VarG.f13810b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().f21814g) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        jVar.f34726b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f14862f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i10 = e0Var.f13810b;
        int iD = cVar.E.d(i10);
        if (iD != -1) {
            i3.b bVarF = x4.f(androidComposeView.getAndroidViewsHandler$ui_release(), iD);
            if (bVarF != null) {
                accessibilityNodeInfo.setTraversalBefore(bVarF);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            AndroidComposeView.E(androidComposeView, i10, accessibilityNodeInfo, cVar.G);
        }
        int iD2 = cVar.F.d(i10);
        if (iD2 != -1) {
            i3.b bVarF2 = x4.f(androidComposeView.getAndroidViewsHandler$ui_release(), iD2);
            if (bVarF2 != null) {
                accessibilityNodeInfo.setTraversalAfter(bVarF2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            AndroidComposeView.E(androidComposeView, i10, accessibilityNodeInfo, cVar.H);
        }
    }
}
