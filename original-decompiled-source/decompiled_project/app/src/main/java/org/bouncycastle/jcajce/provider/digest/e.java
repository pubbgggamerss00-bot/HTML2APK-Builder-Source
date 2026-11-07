package org.bouncycastle.jcajce.provider.digest;

import i2.g;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import x0.k;

/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static void a(int i10, k kVar, int i11, g.a.C0128a c0128a) {
        kVar.C(Integer.valueOf(i10));
        kVar.J(Integer.valueOf(i11), c0128a);
    }

    public static void b(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }
}
