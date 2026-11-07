package kotlinx.serialization.json;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16458a = new LinkedHashMap();

    public final v a() {
        return new v(this.f16458a);
    }

    public final h b(String str, h element) {
        kotlin.jvm.internal.r.e(element, "element");
        return (h) this.f16458a.put(str, element);
    }
}
