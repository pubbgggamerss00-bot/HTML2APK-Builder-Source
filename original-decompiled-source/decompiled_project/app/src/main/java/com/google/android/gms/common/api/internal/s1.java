package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class s1 extends Fragment implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f6044b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final u1 f6045a = new u1();

    @Override // com.google.android.gms.common.api.internal.k
    public final void a(String str, j jVar) {
        this.f6045a.a(str, jVar);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final j b(Class cls, String str) {
        return (j) cls.cast(this.f6045a.f6063a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f6045a.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f6045a.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6045a.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        u1 u1Var = this.f6045a;
        u1Var.f6064b = 5;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        u1 u1Var = this.f6045a;
        u1Var.f6064b = 3;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f6045a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        u1 u1Var = this.f6045a;
        u1Var.f6064b = 2;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        u1 u1Var = this.f6045a;
        u1Var.f6064b = 4;
        Iterator it = u1Var.f6063a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStop();
        }
    }
}
