package c2;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class u {
    public static String a(String str, String str2, long j10) {
        return str + j10 + str2;
    }

    public static StringBuilder b(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }
}
