package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public final class JsonArraySerializer implements zh.b<c> {
    public static final JsonArraySerializer INSTANCE = new JsonArraySerializer();
    private static final bi.f descriptor = a.f16426b;

    public static final class a implements bi.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16426b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f16427c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bi.f f16428a = ai.a.b(JsonElementSerializer.INSTANCE).getDescriptor();

        @Override // bi.f
        public final String a() {
            return f16427c;
        }

        @Override // bi.f
        public final boolean c() {
            return this.f16428a.c();
        }

        @Override // bi.f
        public final int d(String name) {
            kotlin.jvm.internal.r.e(name, "name");
            return this.f16428a.d(name);
        }

        @Override // bi.f
        public final int e() {
            return this.f16428a.e();
        }

        @Override // bi.f
        public final String f(int i10) {
            return this.f16428a.f(i10);
        }

        @Override // bi.f
        public final List<Annotation> g(int i10) {
            return this.f16428a.g(i10);
        }

        @Override // bi.f
        public final List<Annotation> getAnnotations() {
            return this.f16428a.getAnnotations();
        }

        @Override // bi.f
        public final bi.l getKind() {
            return this.f16428a.getKind();
        }

        @Override // bi.f
        public final bi.f h(int i10) {
            return this.f16428a.h(i10);
        }

        @Override // bi.f
        public final boolean i(int i10) {
            return this.f16428a.i(i10);
        }

        @Override // bi.f
        public final boolean isInline() {
            return this.f16428a.isInline();
        }
    }

    private JsonArraySerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public c deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        f9.h.a(decoder);
        return new c((List) ai.a.b(JsonElementSerializer.INSTANCE).deserialize(decoder));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, c value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        f9.h.b(encoder);
        ai.a.b(JsonElementSerializer.INSTANCE).serialize(encoder, value);
    }
}
