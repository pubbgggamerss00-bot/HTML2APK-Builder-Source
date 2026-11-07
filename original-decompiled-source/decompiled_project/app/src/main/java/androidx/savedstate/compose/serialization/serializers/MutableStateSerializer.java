package androidx.savedstate.compose.serialization.serializers;

import bi.e;
import bi.f;
import bi.k;
import bi.l;
import ci.d;
import kotlin.jvm.internal.r;
import x0.n1;
import zh.b;

/* loaded from: classes.dex */
public final class MutableStateSerializer<T> implements b<n1<T>> {
    private final f descriptor;
    private final b<T> valueSerializer;

    public MutableStateSerializer(b<T> valueSerializer) {
        r.e(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        l kind = valueSerializer.getDescriptor().getKind();
        this.descriptor = kind instanceof e ? k.a("androidx.compose.runtime.MutableState", (e) kind) : k.b("androidx.compose.runtime.MutableState", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public n1<T> deserialize(d decoder) {
        r.e(decoder, "decoder");
        return bg.b.h(decoder.q(this.valueSerializer));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, n1<T> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        encoder.J(this.valueSerializer, value.getValue());
    }
}
