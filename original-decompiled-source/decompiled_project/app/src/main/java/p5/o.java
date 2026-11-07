package p5;

import android.os.Parcelable;
import android.text.Spanned;
import java.io.Serializable;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p5.q;
import p5.y0;

/* loaded from: classes.dex */
public final class o {
    public static final boolean a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final n b(eh.l lVar, String str) {
        r rVar = new r();
        lVar.invoke(rVar);
        q.a aVar = rVar.f21265a;
        y0 y0Var = aVar.f21260a;
        if (y0Var == null) {
            Object obj = aVar.f21261b;
            y0 cVar = obj instanceof Integer ? y0.f21315a : obj instanceof int[] ? y0.f21316b : obj instanceof Long ? y0.f21317c : obj instanceof long[] ? y0.f21318d : obj instanceof Float ? y0.f21319e : obj instanceof float[] ? y0.f21320f : obj instanceof Boolean ? y0.f21321g : obj instanceof boolean[] ? y0.f21322h : ((obj instanceof String) || obj == null) ? y0.f21323i : null;
            if (cVar != null) {
                y0Var = cVar;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                y0Var = y0.f21324j;
            } else {
                kotlin.jvm.internal.r.b(obj);
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    kotlin.jvm.internal.r.b(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        kotlin.jvm.internal.r.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        cVar = new y0.b(componentType2);
                    } else if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        kotlin.jvm.internal.r.b(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            kotlin.jvm.internal.r.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            cVar = new y0.d(componentType4);
                        } else {
                            cVar = obj instanceof Parcelable ? new y0.c(obj.getClass()) : obj instanceof Enum ? new y0.a(obj.getClass()) : new y0.e(obj.getClass());
                        }
                    }
                    y0Var = cVar;
                }
            }
        }
        return new n(str, new q(y0Var, aVar.f21261b, aVar.f21262c));
    }

    public static final int c(c0.o oVar, v.t0 t0Var) {
        return (int) (t0Var == v.t0.f30083a ? oVar.l() & BodyPartID.bodyIdMax : oVar.l() >> 32);
    }
}
