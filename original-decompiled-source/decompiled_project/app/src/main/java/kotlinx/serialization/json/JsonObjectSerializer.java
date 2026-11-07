package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class JsonObjectSerializer implements zh.b<v> {
    public static final JsonObjectSerializer INSTANCE = new JsonObjectSerializer();
    private static final bi.f descriptor = a.f16429b;

    public static final class a implements bi.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f16429b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f16430c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bi.f f16431a = ai.a.c(ai.a.serializer(l0.f16339a), JsonElementSerializer.INSTANCE).getDescriptor();

        @Override // bi.f
        public final String a() {
            return f16430c;
        }

        @Override // bi.f
        public final boolean c() {
            return this.f16431a.c();
        }

        @Override // bi.f
        public final int d(String name) {
            kotlin.jvm.internal.r.e(name, "name");
            return this.f16431a.d(name);
        }

        @Override // bi.f
        public final int e() {
            return this.f16431a.e();
        }

        @Override // bi.f
        public final String f(int i10) {
            return this.f16431a.f(i10);
        }

        @Override // bi.f
        public final List<Annotation> g(int i10) {
            return this.f16431a.g(i10);
        }

        @Override // bi.f
        public final List<Annotation> getAnnotations() {
            return this.f16431a.getAnnotations();
        }

        @Override // bi.f
        public final bi.l getKind() {
            return this.f16431a.getKind();
        }

        @Override // bi.f
        public final bi.f h(int i10) {
            return this.f16431a.h(i10);
        }

        @Override // bi.f
        public final boolean i(int i10) {
            return this.f16431a.i(i10);
        }

        @Override // bi.f
        public final boolean isInline() {
            return this.f16431a.isInline();
        }
    }

    private JsonObjectSerializer() {
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public v deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        f9.h.a(decoder);
        return new v(ai.a.c(ai.a.serializer(l0.f16339a), JsonElementSerializer.INSTANCE).deserialize(decoder));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, v value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        f9.h.b(encoder);
        ai.a.c(ai.a.serializer(l0.f16339a), JsonElementSerializer.INSTANCE).serialize(encoder, value);
    }
}
