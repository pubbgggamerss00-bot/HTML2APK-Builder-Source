package v3;

import android.graphics.Typeface;
import q3.g;
import r3.u;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.a f30557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f30558b;

    public a(u.a aVar, Typeface typeface) {
        this.f30557a = aVar;
        this.f30558b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.c cVar = this.f30557a.f23172c;
        if (cVar != null) {
            cVar.c(this.f30558b);
        }
    }
}
