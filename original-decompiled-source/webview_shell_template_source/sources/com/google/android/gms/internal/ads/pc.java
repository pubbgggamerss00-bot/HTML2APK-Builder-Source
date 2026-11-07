package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class pc implements qc {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f8022b = Logger.getLogger(pc.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final oc f8023a = new oc(0);

    public abstract sc a(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final sc b(b90 b90Var, o92 o92Var) throws EOFException {
        int iA;
        long jLimit;
        long jB = b90Var.b();
        ByteBuffer byteBuffer = b90Var.s;
        oc ocVar = this.f8023a;
        ((ByteBuffer) ocVar.get()).rewind().limit(8);
        do {
            iA = b90Var.a((ByteBuffer) ocVar.get());
            if (iA == 8) {
                ((ByteBuffer) ocVar.get()).rewind();
                long jO = y5.o((ByteBuffer) ocVar.get());
                if (jO < 8 && jO > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jO);
                    sb.append("). Stop parsing!");
                    f8022b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) ocVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jO == 1) {
                        ((ByteBuffer) ocVar.get()).limit(16);
                        b90Var.a((ByteBuffer) ocVar.get());
                        ((ByteBuffer) ocVar.get()).position(8);
                        jLimit = y5.q((ByteBuffer) ocVar.get()) - 16;
                    } else {
                        jLimit = jO == 0 ? byteBuffer.limit() - b90Var.b() : jO - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) ocVar.get()).limit(((ByteBuffer) ocVar.get()).limit() + 16);
                        b90Var.a((ByteBuffer) ocVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) ocVar.get()).position() - 16; iPosition < ((ByteBuffer) ocVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) ocVar.get()).position() - 16)] = ((ByteBuffer) ocVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j6 = jLimit;
                    if (o92Var instanceof sc) {
                    }
                    sc scVarA = a(str);
                    ((ByteBuffer) ocVar.get()).rewind();
                    scVarA.a(b90Var, (ByteBuffer) ocVar.get(), j6, this);
                    return scVarA;
                } catch (UnsupportedEncodingException e6) {
                    throw new RuntimeException(e6);
                }
            }
        } while (iA >= 0);
        byteBuffer.position((int) jB);
        throw new EOFException();
    }
}
