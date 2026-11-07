package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.h;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 implements androidx.lifecycle.f, y1.c, androidx.lifecycle.k0 {
    public final k s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.j0 f1135t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.lifecycle.n f1136u = null;

    /* renamed from: v, reason: collision with root package name */
    public y1.b f1137v = null;

    public h0(k kVar, androidx.lifecycle.j0 j0Var) {
        this.s = kVar;
        this.f1135t = j0Var;
    }

    public final void a(h.a aVar) {
        this.f1136u.f(aVar);
    }

    public final void b() {
        if (this.f1136u == null) {
            this.f1136u = new androidx.lifecycle.n(this);
            y1.b bVar = new y1.b(this);
            this.f1137v = bVar;
            bVar.a();
            androidx.lifecycle.z.b(this);
        }
    }

    @Override // androidx.lifecycle.f
    public final k1.a getDefaultViewModelCreationExtras() {
        Application application;
        k kVar = this.s;
        Context applicationContext = kVar.y().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        k1.c cVar = new k1.c(0);
        LinkedHashMap linkedHashMap = cVar.f13533a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f1299a, application);
        }
        linkedHashMap.put(androidx.lifecycle.z.f1345a, this);
        linkedHashMap.put(androidx.lifecycle.z.f1346b, this);
        Bundle bundle = kVar.f1197x;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.z.f1347c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.h getLifecycle() {
        b();
        return this.f1136u;
    }

    @Override // y1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f1137v.f15219b;
    }

    @Override // androidx.lifecycle.k0
    public final androidx.lifecycle.j0 getViewModelStore() {
        b();
        return this.f1135t;
    }
}
