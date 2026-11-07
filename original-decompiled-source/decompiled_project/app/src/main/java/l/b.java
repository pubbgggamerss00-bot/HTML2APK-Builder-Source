package l;

import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import t2.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements f0 {
    public static Object b(ArrayList arrayList, int i10) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static StringBuilder c(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    @Override // t2.f0
    public boolean a(p1.e eVar, p1.e eVar2) {
        return eVar2.a(eVar.c());
    }
}
