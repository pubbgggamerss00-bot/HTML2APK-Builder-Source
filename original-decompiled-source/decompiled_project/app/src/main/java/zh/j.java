package zh;

import kotlin.jvm.internal.r;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        kh.c it = (kh.c) obj;
        r.e(it, "it");
        b bVarC = n.c(it);
        if (bVarC != null) {
            return bVarC;
        }
        if (k0.c(it)) {
            return new PolymorphicSerializer(it);
        }
        return null;
    }
}
