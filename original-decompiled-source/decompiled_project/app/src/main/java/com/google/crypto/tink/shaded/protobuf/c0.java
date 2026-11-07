package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile p0 f6636a;

    /* renamed from: b, reason: collision with root package name */
    public volatile h f6637b;

    static {
        o.a();
    }

    public final p0 a(p0 p0Var) {
        if (this.f6636a == null) {
            synchronized (this) {
                if (this.f6636a == null) {
                    try {
                        this.f6636a = p0Var;
                        this.f6637b = h.f6665b;
                    } catch (z unused) {
                        this.f6636a = p0Var;
                        this.f6637b = h.f6665b;
                    }
                }
            }
        }
        return this.f6636a;
    }
}
