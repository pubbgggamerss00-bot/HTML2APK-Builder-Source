package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8238a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8239b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8240c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f8241d;

    static {
        Locale locale = Locale.US;
        f8239b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f8240c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f8241d = Pattern.compile("\\\\an(\\d+)");
    }
}
