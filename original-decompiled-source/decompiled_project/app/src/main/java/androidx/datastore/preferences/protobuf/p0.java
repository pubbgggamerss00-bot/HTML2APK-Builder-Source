package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b2;

/* loaded from: classes.dex */
public final class p0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f2123a;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final b2.a f2124a;

        /* renamed from: b, reason: collision with root package name */
        public final b2.a f2125b;

        /* renamed from: c, reason: collision with root package name */
        public final V f2126c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(b2.a aVar, b2.a aVar2, Object obj) {
            this.f2124a = aVar;
            this.f2125b = aVar2;
            this.f2126c = obj;
        }
    }

    public p0(b2.a aVar, b2.a aVar2, GeneratedMessageLite generatedMessageLite) {
        this.f2123a = new a<>(aVar, aVar2, generatedMessageLite);
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return x.c(aVar.f2125b, 2, v10) + x.c(aVar.f2124a, 1, k10);
    }
}
