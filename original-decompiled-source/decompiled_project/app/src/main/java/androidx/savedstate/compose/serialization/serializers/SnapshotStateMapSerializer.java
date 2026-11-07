package androidx.savedstate.compose.serialization.serializers;

import ai.a;
import bi.f;
import bi.k;
import ci.d;
import ci.e;
import h1.w;
import java.util.Map;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import zh.b;

/* loaded from: classes.dex */
public final class SnapshotStateMapSerializer<K, V> implements b<w<K, V>> {
    private final b<Map<K, V>> base;
    private final f descriptor;

    public SnapshotStateMapSerializer(b<K> keySerializer, b<V> valueSerializer) {
        r.e(keySerializer, "keySerializer");
        r.e(valueSerializer, "valueSerializer");
        LinkedHashMapSerializer linkedHashMapSerializerC = a.c(keySerializer, valueSerializer);
        this.base = linkedHashMapSerializerC;
        this.descriptor = k.b("androidx.compose.runtime.SnapshotStateMap", linkedHashMapSerializerC.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public w<K, V> deserialize(d decoder) {
        r.e(decoder, "decoder");
        Map<? extends K, ? extends V> map = (Map) decoder.q(this.base);
        w<K, V> wVar = new w<>();
        wVar.putAll(map);
        return wVar;
    }

    @Override // zh.i
    public void serialize(e encoder, w<K, V> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        encoder.J(this.base, value);
    }
}
