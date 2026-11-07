package b9;

import androidx.lifecycle.l;
import androidx.lifecycle.z0;
import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;
import s5.c;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3951b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f3950a = i10;
        this.f3951b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3950a) {
            case 0:
                ((x0.n1) this.f3951b).setValue(Boolean.TRUE);
                return pg.f0.f21461a;
            case 1:
                ((PdfEditorActivity) this.f3951b).finish();
                return pg.f0.f21461a;
            default:
                s5.c cVar = ((p5.s) this.f3951b).f21275h;
                if (!cVar.f24451i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.f24452j.f2361d != l.b.f2319a) {
                    return ((c.a) z0.b.a(cVar.f24443a, (z0.c) cVar.f24455m.getValue(), 4).a(kotlin.jvm.internal.h0.a(c.a.class))).f24456b;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }
}
