package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oc1 {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f7704a;

    public oc1() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) zzbe.zzc().a(zn.H6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f7704a = patternCompile;
    }
}
