package j5;

import eh.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15161a = new LinkedHashMap();

    public final void a(h hVar, l initializer) {
        r.e(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f15161a;
        if (!linkedHashMap.containsKey(hVar)) {
            linkedHashMap.put(hVar, new e(hVar, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + hVar.a() + '.').toString());
    }

    public final b b() {
        Collection initializers = this.f15161a.values();
        r.e(initializers, "initializers");
        e[] eVarArr = (e[]) initializers.toArray(new e[0]);
        return new b((e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }
}
