package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class f1<R extends com.google.android.gms.common.api.l> extends com.google.android.gms.common.api.o<R> implements com.google.android.gms.common.api.m<R> {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f5961e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f5962f;

    /* renamed from: a, reason: collision with root package name */
    public f1 f5957a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.api.i f5958b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5959c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Status f5960d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5963g = false;

    public f1(WeakReference weakReference) {
        com.google.android.gms.common.internal.p.g(weakReference, "GoogleApiClient reference must not be null");
        this.f5961e = weakReference;
        com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) weakReference.get();
        this.f5962f = new d1(this, hVar != null ? hVar.c() : Looper.getMainLooper());
    }

    public static final void d(com.google.android.gms.common.api.l lVar) {
        if (lVar instanceof com.google.android.gms.common.api.j) {
            try {
                ((com.google.android.gms.common.api.j) lVar).a();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(lVar)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.m
    public final void a(com.google.android.gms.common.api.l lVar) {
        synchronized (this.f5959c) {
            if (lVar.getStatus().d()) {
            } else {
                b(lVar.getStatus());
                d(lVar);
            }
        }
    }

    public final void b(Status status) {
        synchronized (this.f5959c) {
            this.f5960d = status;
            synchronized (this.f5959c) {
            }
        }
    }

    public final void c() {
    }
}
