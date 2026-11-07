package androidx.savedstate.serialization.serializers;

import bi.e;
import bi.f;
import bi.k;
import bi.l;
import ci.d;
import kotlin.jvm.internal.r;
import sh.a1;
import sh.j0;
import zh.b;

/* loaded from: classes.dex */
public final class MutableStateFlowSerializer<T> implements b<j0<T>> {
    private final f descriptor;
    private final b<T> valueSerializer;

    public MutableStateFlowSerializer(b<T> valueSerializer) {
        r.e(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        l kind = valueSerializer.getDescriptor().getKind();
        this.descriptor = kind instanceof e ? k.a("kotlinx.coroutines.flow.MutableStateFlow", (e) kind) : k.b("kotlinx.coroutines.flow.MutableStateFlow", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public j0<T> deserialize(d decoder) {
        r.e(decoder, "decoder");
        return a1.a(decoder.q(this.valueSerializer));
    }

    @Override // zh.i
    public void serialize(ci.e encoder, j0<T> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        encoder.J(this.valueSerializer, value.getValue());
    }
}
