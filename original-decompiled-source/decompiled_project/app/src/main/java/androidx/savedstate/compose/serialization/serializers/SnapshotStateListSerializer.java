package androidx.savedstate.compose.serialization.serializers;

import ai.a;
import bi.f;
import bi.k;
import ci.d;
import ci.e;
import h1.u;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.ArrayListSerializer;
import qg.x;
import zh.b;

/* loaded from: classes.dex */
public final class SnapshotStateListSerializer<T> implements b<u<T>> {
    private final b<List<T>> base;
    private final f descriptor;
    private final b<T> elementSerializer;

    public SnapshotStateListSerializer(b<T> elementSerializer) {
        r.e(elementSerializer, "elementSerializer");
        this.elementSerializer = elementSerializer;
        ArrayListSerializer arrayListSerializerB = a.b(elementSerializer);
        this.base = arrayListSerializerB;
        this.descriptor = k.b("androidx.compose.runtime.SnapshotStateList", arrayListSerializerB.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public u<T> deserialize(d decoder) {
        r.e(decoder, "decoder");
        List list = (List) decoder.q(this.base);
        u<T> uVar = new u<>();
        uVar.addAll(x.c0(list));
        return uVar;
    }

    @Override // zh.i
    public void serialize(e encoder, u<T> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        encoder.J(this.base, value);
    }
}
