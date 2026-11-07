package di;

import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonObjectSerializer;

/* loaded from: classes2.dex */
public final class f0 extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public String f8011h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8012j;

    @Override // di.b0, di.f
    public final kotlinx.serialization.json.h c0() {
        return new kotlinx.serialization.json.v(this.f7989g);
    }

    @Override // di.b0, di.f
    public final void d0(String key, kotlinx.serialization.json.h element) {
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(element, "element");
        if (!this.f8012j) {
            String str = this.f8011h;
            if (str == null) {
                kotlin.jvm.internal.r.h("tag");
                throw null;
            }
            this.f7989g.put(str, element);
            this.f8012j = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.x) {
            this.f8011h = ((kotlinx.serialization.json.x) element).c();
            this.f8012j = false;
        } else {
            if (element instanceof kotlinx.serialization.json.v) {
                throw t.b(JsonObjectSerializer.INSTANCE.getDescriptor());
            }
            if (!(element instanceof kotlinx.serialization.json.c)) {
                throw new pg.l();
            }
            throw t.b(JsonArraySerializer.INSTANCE.getDescriptor());
        }
    }
}
