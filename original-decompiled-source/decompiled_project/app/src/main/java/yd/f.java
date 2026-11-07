package yd;

import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes2.dex */
public final class f implements vd.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f34387f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final vd.c f34388g;

    /* renamed from: h, reason: collision with root package name */
    public static final vd.c f34389h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f34390i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f34391a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f34392b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f34393c;

    /* renamed from: d, reason: collision with root package name */
    public final vd.d<Object> f34394d;

    /* renamed from: e, reason: collision with root package name */
    public final i f34395e = new i(this);

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(d.class, aVar);
        f34388g = new vd.c("key", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(d.class, aVar2);
        f34389h = new vd.c("value", Collections.unmodifiableMap(new HashMap(map2)));
        f34390i = new e();
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, vd.d dVar) {
        this.f34391a = byteArrayOutputStream;
        this.f34392b = map;
        this.f34393c = map2;
        this.f34394d = dVar;
    }

    public static int f(vd.c cVar) {
        d dVar = (d) ((Annotation) cVar.f30750b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f34383a;
        }
        throw new vd.b("Field has no @Protobuf config");
    }

    @Override // vd.e
    public final vd.e a(vd.c cVar, Object obj) throws IOException {
        d(cVar, obj, true);
        return this;
    }

    @Override // vd.e
    public final vd.e b(vd.c cVar, long j10) throws IOException {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f30750b.get(d.class));
        if (dVar == null) {
            throw new vd.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f34383a << 3);
        h(j10);
        return this;
    }

    public final void c(vd.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f30750b.get(d.class));
        if (dVar == null) {
            throw new vd.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f34383a << 3);
        g(i10);
    }

    public final void d(vd.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f34387f);
            g(bytes.length);
            this.f34391a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f34390i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z10 && dDoubleValue == 0.0d) {
                return;
            }
            g((f(cVar) << 3) | 1);
            this.f34391a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            g((f(cVar) << 3) | 5);
            this.f34391a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z10 && jLongValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f30750b.get(d.class));
            if (dVar == null) {
                throw new vd.b("Field has no @Protobuf config");
            }
            g(((a) dVar).f34383a << 3);
            h(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            g(bArr.length);
            this.f34391a.write(bArr);
            return;
        }
        vd.d dVar2 = (vd.d) this.f34392b.get(obj.getClass());
        if (dVar2 != null) {
            e(dVar2, cVar, obj, z10);
            return;
        }
        vd.f fVar = (vd.f) this.f34393c.get(obj.getClass());
        if (fVar != null) {
            i iVar = this.f34395e;
            iVar.f34400a = false;
            iVar.f34402c = cVar;
            iVar.f34401b = z10;
            fVar.a(obj, iVar);
            return;
        }
        if (obj instanceof c) {
            c(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f34394d, cVar, obj, z10);
        }
    }

    public final void e(vd.d dVar, vd.c cVar, Object obj, boolean z10) throws IOException {
        b bVar = new b();
        bVar.f34384a = 0L;
        try {
            OutputStream outputStream = this.f34391a;
            this.f34391a = bVar;
            try {
                dVar.a(obj, this);
                this.f34391a = outputStream;
                long j10 = bVar.f34384a;
                bVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                g((f(cVar) << 3) | 2);
                h(j10);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f34391a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void g(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f34391a.write((i10 & CertificateBody.profileType) | 128);
            i10 >>>= 7;
        }
        this.f34391a.write(i10 & CertificateBody.profileType);
    }

    public final void h(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f34391a.write((((int) j10) & CertificateBody.profileType) | 128);
            j10 >>>= 7;
        }
        this.f34391a.write(((int) j10) & CertificateBody.profileType);
    }
}
