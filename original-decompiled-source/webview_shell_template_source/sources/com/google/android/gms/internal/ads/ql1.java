package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ql1 extends me implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    public final Pattern f8404t;

    public ql1(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.f8404t = pattern;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String toString() {
        return this.f8404t.toString();
    }
}
