package com.google.android.gms.common.internal;

/* loaded from: classes2.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f6197a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f6199c;

    public t0(b bVar) {
        Boolean bool = Boolean.TRUE;
        this.f6199c = bVar;
        this.f6197a = bool;
        this.f6198b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        synchronized (this) {
            this.f6197a = null;
        }
        synchronized (this.f6199c.zzt) {
            this.f6199c.zzt.remove(this);
        }
    }
}
