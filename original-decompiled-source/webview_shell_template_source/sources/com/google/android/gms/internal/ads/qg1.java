package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qg1 extends tg1 {

    /* renamed from: v, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static final qg1 f8382v = new qg1();

    @Override // com.google.android.gms.internal.ads.tg1
    public final void a(boolean z6) {
        Iterator it = Collections.unmodifiableCollection(rg1.f8631c.f8632a).iterator();
        while (it.hasNext()) {
            ch1 ch1Var = ((fg1) it.next()).f4654d;
            if (ch1Var.f3577b.get() != 0) {
                xg1.a(ch1Var.a(), "setState", true != z6 ? "backgrounded" : "foregrounded", ch1Var.f3576a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.tg1
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(rg1.f8631c.f8633b).iterator();
        while (it.hasNext()) {
            View view = (View) ((fg1) it.next()).f4653c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
