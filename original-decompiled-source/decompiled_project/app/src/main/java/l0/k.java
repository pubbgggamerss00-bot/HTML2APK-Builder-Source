package l0;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class k {
    public static int a(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static StringBuilder b(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }
}
