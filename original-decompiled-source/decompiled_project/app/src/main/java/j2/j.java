package j2;

import android.content.ClipData;
import android.content.ClipboardManager;

/* loaded from: classes.dex */
public final class j implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final k f14769a;

    public j(k kVar) {
        this.f14769a = kVar;
    }

    @Override // j2.f2
    public final pg.f0 a(e2 e2Var) {
        ClipboardManager clipboardManager = this.f14769a.f14822a;
        if (e2Var == null) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(e2Var.f14713a);
        }
        return pg.f0.f21461a;
    }

    @Override // j2.f2
    public final e2 b() {
        ClipData primaryClip = this.f14769a.f14822a.getPrimaryClip();
        if (primaryClip != null) {
            return new e2(primaryClip);
        }
        return null;
    }
}
