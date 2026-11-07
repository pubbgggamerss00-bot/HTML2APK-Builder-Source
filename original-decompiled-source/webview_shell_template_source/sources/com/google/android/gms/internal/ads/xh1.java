package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xh1 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f10597e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10598a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10599b;

    /* renamed from: c, reason: collision with root package name */
    public final v3.p f10600c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10601d;

    public xh1(Context context, Executor executor, v3.p pVar, boolean z6) {
        this.f10598a = context;
        this.f10599b = executor;
        this.f10600c = pVar;
        this.f10601d = z6;
    }

    public static xh1 a(Context context, Executor executor, boolean z6) {
        v3.f fVar = new v3.f();
        if (z6) {
            executor.execute(new wx(11, context, fVar));
        } else {
            executor.execute(new cf(10, fVar));
        }
        return new xh1(context, executor, fVar.f14800a, z6);
    }

    public final void b(int i6, long j6, Exception exc) {
        d(i6, j6, exc, null, null);
    }

    public final void c(int i6, long j6) {
        d(i6, j6, null, null, null);
    }

    public final v3.p d(int i6, long j6, Exception exc, String str, String str2) {
        if (!this.f10601d) {
            return this.f10600c.c(this.f10599b, new d0(29));
        }
        Context context = this.f10598a;
        ad adVarB = ed.B();
        String packageName = context.getPackageName();
        adVarB.i();
        ed.C((ed) adVarB.f4126t, packageName);
        adVarB.i();
        ed.G((ed) adVarB.f4126t, j6);
        int i7 = f10597e;
        adVarB.i();
        ed.I((ed) adVarB.f4126t, i7);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            adVarB.i();
            ed.H((ed) adVarB.f4126t, string);
            String name = exc.getClass().getName();
            adVarB.i();
            ed.F((ed) adVarB.f4126t, name);
        }
        if (str2 != null) {
            adVarB.i();
            ed.D((ed) adVarB.f4126t, str2);
        }
        if (str != null) {
            adVarB.i();
            ed.E((ed) adVarB.f4126t, str);
        }
        return this.f10600c.c(this.f10599b, new ti(i6, adVarB));
    }
}
