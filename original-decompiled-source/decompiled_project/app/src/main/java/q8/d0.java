package q8;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f22160a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22161b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22162c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22163d;

    public d0(w0 w0Var, String str, float f10, boolean z10) {
        this.f22160a = w0Var;
        this.f22161b = str;
        this.f22162c = f10;
        this.f22163d = z10;
    }

    public final void a(e0 origin, long j10, eh.a<pg.f0> aVar) {
        String str;
        kotlin.jvm.internal.r.e(origin, "origin");
        g2.v vVar = origin.f22177a;
        p1.e eVarN = null;
        if (vVar != null) {
            if (!vVar.m()) {
                vVar = null;
            }
            if (vVar != null) {
                eVarN = g2.w.c(vVar).N(vVar, true);
            }
        }
        p1.e eVar = eVarN;
        w0 w0Var = this.f22160a;
        if (w0Var == null || (str = this.f22161b) == null || eVar == null || this.f22163d) {
            aVar.invoke();
        } else {
            if (SystemClock.uptimeMillis() - w0Var.f22436i < 500) {
                return;
            }
            w0Var.f22435h = new f0(str, eVar, j10, this.f22162c);
            w0Var.f22436i = SystemClock.uptimeMillis();
            aVar.invoke();
        }
    }
}
