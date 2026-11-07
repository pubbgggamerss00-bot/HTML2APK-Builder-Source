package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class v1 extends c5.h implements k {
    public static final WeakHashMap X = new WeakHashMap();
    public final u1 W = new u1();

    @Override // com.google.android.gms.common.api.internal.k
    public final void a(String str, j jVar) {
        this.W.a(str, jVar);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final j b(Class cls, String str) {
        return (j) cls.cast(this.W.f6063a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final Activity c() {
        c5.t<?> tVar = this.f4890v;
        if (tVar == null) {
            return null;
        }
        return tVar.f4979a;
    }

    @Override // c5.h
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.e(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.W.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // c5.h
    public final void o(int i10, int i11, Intent intent) {
        super.o(i10, i11, intent);
        Iterator it = this.W.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // c5.h
    public final void q(Bundle bundle) {
        super.q(bundle);
        this.W.b(bundle);
    }

    @Override // c5.h
    public final void r() {
        this.F = true;
        u1 u1Var = this.W;
        u1Var.f6064b = 5;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onDestroy();
        }
    }

    @Override // c5.h
    public final void v() {
        this.F = true;
        u1 u1Var = this.W;
        u1Var.f6064b = 3;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onResume();
        }
    }

    @Override // c5.h
    public final void w(Bundle bundle) {
        this.W.c(bundle);
    }

    @Override // c5.h
    public final void x() {
        this.F = true;
        u1 u1Var = this.W;
        u1Var.f6064b = 2;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStart();
        }
    }

    @Override // c5.h
    public final void y() {
        this.F = true;
        u1 u1Var = this.W;
        u1Var.f6064b = 4;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStop();
        }
    }
}
