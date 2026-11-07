package okhttp3.internal.concurrent;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    public final String f19408a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19409b;

    /* renamed from: c, reason: collision with root package name */
    public TaskQueue f19410c;

    /* renamed from: d, reason: collision with root package name */
    public long f19411d;

    public Task(String name, boolean z10) {
        r.e(name, "name");
        this.f19408a = name;
        this.f19409b = z10;
        this.f19411d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f19408a;
    }
}
