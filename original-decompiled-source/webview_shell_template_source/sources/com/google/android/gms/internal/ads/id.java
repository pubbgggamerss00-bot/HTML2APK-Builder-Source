package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class id {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f5678a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f5679b = "media3.common";

    public static synchronized void a(String str) {
        if (f5678a.add(str)) {
            f5679b = f5679b + ", " + str;
        }
    }
}
