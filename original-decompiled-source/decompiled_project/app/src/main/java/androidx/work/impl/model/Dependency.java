package androidx.work.impl.model;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class Dependency {

    /* renamed from: a, reason: collision with root package name */
    public final String f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3161b;

    public Dependency(String str, String prerequisiteId) {
        r.e(prerequisiteId, "prerequisiteId");
        this.f3160a = str;
        this.f3161b = prerequisiteId;
    }
}
