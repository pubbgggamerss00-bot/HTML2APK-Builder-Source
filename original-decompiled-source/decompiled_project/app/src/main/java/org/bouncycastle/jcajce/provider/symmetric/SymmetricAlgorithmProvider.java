package org.bouncycastle.jcajce.provider.symmetric;

import i8.n;
import l0.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder sbB = k.b(str, "-CMAC", n.d("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.", configurableProvider);
        sbB.append(str);
        sbB.append("-CMAC");
        configurableProvider.addAlgorithm(sbB.toString(), str3);
        configurableProvider.addAlgorithm(n.d("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder sbB = k.b(str, "-GMAC", n.d("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.", configurableProvider);
        sbB.append(str);
        sbB.append("-GMAC");
        configurableProvider.addAlgorithm(sbB.toString(), str3);
        configurableProvider.addAlgorithm(n.d("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }

    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }
}
