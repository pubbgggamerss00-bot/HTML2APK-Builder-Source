package androidx.work.impl.model;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class WorkTag {

    /* renamed from: a, reason: collision with root package name */
    public final String f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3192b;

    public WorkTag(String tag, String str) {
        r.e(tag, "tag");
        this.f3191a = tag;
        this.f3192b = str;
    }
}
