package n9;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.internal.r;
import p1.h;
import x0.x1;

/* loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18639a;

    public a(b bVar) {
        this.f18639a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d10) {
        r.e(d10, "d");
        b bVar = this.f18639a;
        x1 x1Var = bVar.f18641g;
        x1Var.setValue(Integer.valueOf(((Number) x1Var.getValue()).intValue() + 1));
        Drawable drawable = bVar.f18640f;
        Object obj = c.f18645a;
        bVar.f18642h.setValue(new h((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : d0.h.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pg.j] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d10, Runnable what, long j10) {
        r.e(d10, "d");
        r.e(what, "what");
        ((Handler) c.f18645a.getValue()).postAtTime(what, j10);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pg.j] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d10, Runnable what) {
        r.e(d10, "d");
        r.e(what, "what");
        ((Handler) c.f18645a.getValue()).removeCallbacks(what);
    }
}
