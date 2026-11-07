package kotlinx.serialization.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final rg.c f16413a;

    static {
        rg.c cVar = new rg.c();
        cVar.put(kotlin.jvm.internal.h0.a(String.class), ai.a.serializer(kotlin.jvm.internal.l0.f16339a));
        cVar.put(kotlin.jvm.internal.h0.a(Character.TYPE), ai.a.serializer(kotlin.jvm.internal.f.f16325a));
        cVar.put(kotlin.jvm.internal.h0.a(char[].class), CharArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(Double.TYPE), ai.a.serializer(kotlin.jvm.internal.k.f16336a));
        cVar.put(kotlin.jvm.internal.h0.a(double[].class), DoubleArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(Float.TYPE), ai.a.serializer(kotlin.jvm.internal.l.f16338a));
        cVar.put(kotlin.jvm.internal.h0.a(float[].class), FloatArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(Long.TYPE), ai.a.serializer(kotlin.jvm.internal.t.f16341a));
        cVar.put(kotlin.jvm.internal.h0.a(long[].class), LongArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(pg.z.class), ai.a.serializer(pg.z.f21492b));
        cVar.put(kotlin.jvm.internal.h0.a(Integer.TYPE), ai.a.serializer(kotlin.jvm.internal.q.f16340a));
        cVar.put(kotlin.jvm.internal.h0.a(int[].class), IntArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(pg.x.class), ai.a.serializer(pg.x.f21487b));
        cVar.put(kotlin.jvm.internal.h0.a(Short.TYPE), ai.a.serializer(kotlin.jvm.internal.j0.f16335a));
        cVar.put(kotlin.jvm.internal.h0.a(short[].class), ShortArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(pg.c0.class), ai.a.serializer(pg.c0.f21454b));
        cVar.put(kotlin.jvm.internal.h0.a(Byte.TYPE), ai.a.serializer(kotlin.jvm.internal.d.f16321a));
        cVar.put(kotlin.jvm.internal.h0.a(byte[].class), ByteArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(pg.v.class), ai.a.serializer(pg.v.f21482b));
        cVar.put(kotlin.jvm.internal.h0.a(Boolean.TYPE), ai.a.serializer(kotlin.jvm.internal.c.f16319a));
        cVar.put(kotlin.jvm.internal.h0.a(boolean[].class), BooleanArraySerializer.INSTANCE);
        cVar.put(kotlin.jvm.internal.h0.a(pg.f0.class), ai.a.serializer(pg.f0.f21461a));
        cVar.put(kotlin.jvm.internal.h0.a(Void.class), NothingSerializer.INSTANCE);
        try {
            cVar.put(kotlin.jvm.internal.h0.a(nh.b.class), ai.a.serializer(nh.b.f18809b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            cVar.put(kotlin.jvm.internal.h0.a(pg.a0.class), ULongArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            cVar.put(kotlin.jvm.internal.h0.a(pg.y.class), UIntArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            cVar.put(kotlin.jvm.internal.h0.a(pg.d0.class), UShortArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            cVar.put(kotlin.jvm.internal.h0.a(pg.w.class), UByteArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            cVar.put(kotlin.jvm.internal.h0.a(oh.a.class), ai.a.serializer(oh.a.f19146c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        f16413a = cVar.e();
    }

    public static final void a(String str) {
        Iterator it = ((rg.f) f16413a.values()).iterator();
        while (it.hasNext()) {
            zh.b bVar = (zh.b) it.next();
            if (str.equals(bVar.getDescriptor().a())) {
                StringBuilder sbA = e.e.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbA.append(kotlin.jvm.internal.h0.a(bVar.getClass()).e());
                sbA.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(mh.p.c(sbA.toString()));
            }
        }
    }
}
