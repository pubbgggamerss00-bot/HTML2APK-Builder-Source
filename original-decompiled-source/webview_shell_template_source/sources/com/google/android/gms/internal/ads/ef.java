package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ef {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f4263c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile hj1 f4264d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f4265e = null;

    /* renamed from: a, reason: collision with root package name */
    public final dg f4266a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f4267b;

    public ef(dg dgVar) {
        this.f4266a = dgVar;
        dgVar.f3898b.execute(new x(1, this));
    }

    public final void a(int i6, int i7, long j6, String str, Exception exc) {
        try {
            f4263c.block();
            if (!this.f4267b.booleanValue() || f4264d == null) {
                return;
            }
            ad adVarB = ed.B();
            String packageName = this.f4266a.f3897a.getPackageName();
            adVarB.i();
            ed.C((ed) adVarB.f4126t, packageName);
            adVarB.i();
            ed.G((ed) adVarB.f4126t, j6);
            if (str != null) {
                adVarB.i();
                ed.D((ed) adVarB.f4126t, str);
            }
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
            hj1 hj1Var = f4264d;
            byte[] bArrI = ((ed) adVarB.g()).i();
            hj1Var.getClass();
            gj1 gj1Var = new gj1(hj1Var, bArrI);
            gj1Var.f5076c = i6;
            if (i7 != -1) {
                gj1Var.f5075b = i7;
            }
            gj1Var.a();
        } catch (Exception unused) {
        }
    }
}
