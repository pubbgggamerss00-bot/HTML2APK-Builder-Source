package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ah1 {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static final ah1 f2759d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f2760a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2761b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2762c;

    static {
        ah1 ah1Var = new ah1();
        ah1Var.f2761b = false;
        ah1Var.f2762c = false;
        f2759d = ah1Var;
    }

    public final void a(boolean z6, boolean z7) {
        if ((z7 || z6) == (this.f2762c || this.f2761b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(rg1.f8631c.f8632a).iterator();
        while (it.hasNext()) {
            ch1 ch1Var = ((fg1) it.next()).f4654d;
            boolean z8 = z7 || z6;
            if (ch1Var.f3577b.get() != 0) {
                xg1.a(ch1Var.a(), "setDeviceLockState", true != z8 ? "unlocked" : "locked");
            }
        }
    }
}
