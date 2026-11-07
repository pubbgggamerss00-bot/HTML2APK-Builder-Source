package j2;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class k implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f14822a;

    public k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f14822a = (ClipboardManager) systemService;
    }
}
