package d0;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.s implements eh.p<g1.o, r1, Map<String, ? extends List<? extends Object>>> {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f7275a = new s1(2);

    @Override // eh.p
    public final Map<String, ? extends List<? extends Object>> invoke(g1.o oVar, r1 r1Var) {
        Map<String, List<Object>> mapB = r1Var.b();
        if (mapB.isEmpty()) {
            return null;
        }
        return mapB;
    }
}
