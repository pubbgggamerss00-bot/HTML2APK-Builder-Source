package kotlinx.serialization.json;

@zh.g(with = JsonPrimitiveSerializer.class)
/* loaded from: classes2.dex */
public abstract class x extends h {
    public static final a Companion = new a();

    public static final class a {
        public final zh.b<x> serializer() {
            return JsonPrimitiveSerializer.INSTANCE;
        }
    }

    public abstract String c();

    public abstract boolean e();

    public String toString() {
        return c();
    }
}
