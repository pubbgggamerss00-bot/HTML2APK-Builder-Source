package p5;

import p5.u0;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21313a = 0;

    public static final u0 a(eh.l optionsBuilder) {
        kotlin.jvm.internal.r.e(optionsBuilder, "optionsBuilder");
        w0 w0Var = new w0();
        optionsBuilder.invoke(w0Var);
        boolean z10 = w0Var.f21297b;
        boolean z11 = w0Var.f21298c;
        String str = w0Var.f21300e;
        u0.a aVar = w0Var.f21296a;
        if (str != null) {
            boolean z12 = w0Var.f21301f;
            boolean z13 = w0Var.f21302g;
            aVar.f21288b = str;
            aVar.f21287a = -1;
            aVar.f21289c = z12;
            aVar.f21290d = z13;
        } else {
            int i10 = w0Var.f21299d;
            boolean z14 = w0Var.f21301f;
            boolean z15 = w0Var.f21302g;
            aVar.f21287a = i10;
            aVar.f21288b = null;
            aVar.f21289c = z14;
            aVar.f21290d = z15;
        }
        String str2 = aVar.f21288b;
        if (str2 == null) {
            return new u0(z10, z11, aVar.f21287a, aVar.f21289c, aVar.f21290d, aVar.f21291e, aVar.f21292f);
        }
        boolean z16 = aVar.f21289c;
        boolean z17 = aVar.f21290d;
        int i11 = aVar.f21291e;
        int i12 = aVar.f21292f;
        int i13 = k0.f21233e;
        u0 u0Var = new u0(z10, z11, "android-app://androidx.navigation/".concat(str2).hashCode(), z16, z17, i11, i12);
        u0Var.f21286j = str2;
        return u0Var;
    }
}
