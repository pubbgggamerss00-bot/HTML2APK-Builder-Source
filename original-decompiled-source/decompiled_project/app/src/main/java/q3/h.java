package q3;

import android.graphics.Typeface;
import q3.g;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.c f21898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f21899b;

    public /* synthetic */ h(g.c cVar, Typeface typeface) {
        this.f21898a = cVar;
        this.f21899b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21898a.c(this.f21899b);
    }
}
