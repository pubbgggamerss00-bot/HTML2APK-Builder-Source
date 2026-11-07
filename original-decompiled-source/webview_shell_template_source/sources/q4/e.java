package q4;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends p {
    public final /* synthetic */ Context s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextPaint f14213t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f14214u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f14215v;

    public e(d dVar, Context context, TextPaint textPaint, p pVar) {
        this.f14215v = dVar;
        this.s = context;
        this.f14213t = textPaint;
        this.f14214u = pVar;
    }

    @Override // androidx.fragment.app.p
    public final void e(int i6) {
        this.f14214u.e(i6);
    }

    @Override // androidx.fragment.app.p
    public final void f(Typeface typeface, boolean z6) {
        this.f14215v.f(this.s, this.f14213t, typeface);
        this.f14214u.f(typeface, z6);
    }
}
