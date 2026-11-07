package j2;

import android.view.ActionMode;
import androidx.compose.ui.platform.AndroidComposeView;
import m0.z2;

/* loaded from: classes.dex */
public final class f1 implements a5 {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f14719a;

    /* renamed from: b, reason: collision with root package name */
    public ActionMode f14720b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.c f14721c = new l2.c(new e1(this, 0));

    /* renamed from: d, reason: collision with root package name */
    public b5 f14722d = b5.f14667b;

    public f1(AndroidComposeView androidComposeView) {
        this.f14719a = androidComposeView;
    }

    @Override // j2.a5
    public final void a(p1.e eVar, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3, eh.a<pg.f0> aVar4) {
        c(eVar, aVar, aVar2, aVar3, aVar4, null);
    }

    @Override // j2.a5
    public final void b() {
        this.f14722d = b5.f14667b;
        ActionMode actionMode = this.f14720b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f14720b = null;
    }

    @Override // j2.a5
    public final void c(p1.e eVar, eh.a aVar, eh.a aVar2, eh.a aVar3, eh.a aVar4, z2.a aVar5) {
        l2.c cVar = this.f14721c;
        cVar.f16693b = eVar;
        cVar.f16694c = aVar;
        cVar.f16696e = aVar3;
        cVar.f16695d = aVar2;
        cVar.f16697f = aVar4;
        cVar.f16698g = aVar5;
        ActionMode actionMode = this.f14720b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f14722d = b5.f14666a;
        this.f14720b = this.f14719a.startActionMode(new l2.a(cVar), 1);
    }

    @Override // j2.a5
    public final b5 getStatus() {
        return this.f14722d;
    }
}
