package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eq1 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f4370a;

    public eq1(Pattern pattern) {
        pattern.getClass();
        this.f4370a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f4370a.matcher(str).matches();
    }
}
