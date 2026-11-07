package ii;

import eh.p;
import g8.w;
import hb.q0;
import hi.b0;
import hi.f0;
import hi.n0;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import mh.t;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;
import pg.n;
import qg.k0;
import qg.x;

/* loaded from: classes2.dex */
public final class m {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = b0.f13033b;
        b0 b0VarA = b0.a.a("/");
        LinkedHashMap linkedHashMapE = k0.e(new n(b0VarA, new h(b0VarA, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (h hVar : x.U(new q0(1), arrayList)) {
            if (((h) linkedHashMapE.put(hVar.f14551a, hVar)) == null) {
                while (true) {
                    b0 b0Var = hVar.f14551a;
                    b0 b0VarC = b0Var.c();
                    if (b0VarC != null) {
                        h hVar2 = (h) linkedHashMapE.get(b0VarC);
                        if (hVar2 != null) {
                            hVar2.f14567q.add(b0Var);
                            break;
                        }
                        h hVar3 = new h(b0VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapE.put(b0VarC, hVar3);
                        hVar3.f14567q.add(b0Var);
                        hVar = hVar3;
                    }
                }
            }
        }
        return linkedHashMapE;
    }

    public static final String b(int i10) {
        w.h(16);
        String string = Integer.toString(i10, 16);
        r.d(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c6, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d0, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r13 != (r10.E() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r0 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r10.skip(4);
        r15 = org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax & r10.p();
        r17 = r10.E() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r12 = new ii.d(r13, r15, r17);
        r10.M(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r10.close();
        r4 = r4 - 20;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r4 <= r18) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r4 = hi.x.b(r3.z(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r4.p() != 117853008) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r4.p();
        r9 = r4.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r4.p() != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r5 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r5 = hi.x.b(r3.z(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r7 = r5.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r7 != 101075792) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r5.skip(12);
        r7 = r5.p();
        r9 = r5.p();
        r21 = r5.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r21 != r5.z()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r7 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r9 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r5.skip(8);
        r20 = new ii.d(r21, r5.z(), r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        r6 = r0;
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ff, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0128, code lost:
    
        throw new java.io.IOException("bad zip: expected " + b(101075792) + " but was " + b(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        r5.close();
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
    
        c9.u1.b(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0139, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
    
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
    
        r4.close();
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        c9.u1.b(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0157, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
    
        r4 = new java.util.ArrayList();
        r5 = hi.x.b(r3.z(r12.f14543b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016e, code lost:
    
        r6 = r12.f14542a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
    
        r0 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
    
        if (r0.f14558h < r12.f14543b) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018c, code lost:
    
        if (r28.invoke(r0).booleanValue() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018e, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0192, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a1, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a9, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ab, code lost:
    
        r5.close();
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b2, code lost:
    
        c9.u1.b(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b5, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b8, code lost:
    
        r4 = new hi.n0(r26, r27, a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c1, code lost:
    
        r3.close();
        r0 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r0 = r10.E() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r9 = r10.E() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
        r13 = r10.E() & org.bouncycastle.crypto.hpke.HPKE.aead_EXPORT_ONLY;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139 A[Catch: all -> 0x013a, TryCatch #12 {all -> 0x013a, blocks: (B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:53:0x0139, B:49:0x0132, B:56:0x013d, B:57:0x0142, B:58:0x0143, B:46:0x012b), top: B:145:0x0092, outer: #13, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a A[Catch: all -> 0x015b, TryCatch #13 {all -> 0x015b, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:70:0x015a, B:66:0x0153, B:73:0x015f, B:98:0x01b8, B:101:0x01c7, B:95:0x01b2, B:108:0x01d5, B:111:0x01e3, B:112:0x01ea, B:113:0x01eb, B:114:0x01ee, B:115:0x01ef, B:116:0x0204, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:105:0x01cb, B:106:0x01d0, B:92:0x01ab, B:74:0x016e, B:77:0x0174, B:79:0x0180, B:81:0x018e, B:84:0x0195, B:85:0x019a, B:86:0x01a1, B:87:0x01a2, B:63:0x014c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:53:0x0139, B:49:0x0132, B:56:0x013d, B:57:0x0142, B:58:0x0143, B:46:0x012b), top: B:146:0x000f, inners: #2, #6, #9, #10, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final n0 c(b0 b0Var, hi.n fileSystem, eh.l<? super h, Boolean> lVar) throws IOException {
        Throwable th2;
        d dVar;
        r.e(fileSystem, "fileSystem");
        hi.l lVarE0 = fileSystem.e0(b0Var);
        try {
            long size = lVarE0.size() - 22;
            long j10 = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + lVarE0.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            while (true) {
                f0 f0VarB = hi.x.b(lVarE0.z(size));
                try {
                    if (f0VarB.p() == 101010256) {
                        break;
                    }
                    long j11 = j10;
                    f0VarB.close();
                    size--;
                    if (size < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j10 = j11;
                } finally {
                    f0VarB.close();
                }
            }
            d dVar2 = dVar;
            if (th2 != null) {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h d(final f0 f0Var) throws IOException {
        int iP = f0Var.p();
        if (iP != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iP));
        }
        f0Var.skip(4L);
        short sE = f0Var.E();
        int i10 = sE & HPKE.aead_EXPORT_ONLY;
        if ((sE & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        int iE = f0Var.E() & HPKE.aead_EXPORT_ONLY;
        int iE2 = f0Var.E() & HPKE.aead_EXPORT_ONLY;
        int iE3 = f0Var.E() & HPKE.aead_EXPORT_ONLY;
        long jP = f0Var.p() & BodyPartID.bodyIdMax;
        final kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f16326a = f0Var.p() & BodyPartID.bodyIdMax;
        final kotlin.jvm.internal.f0 f0Var3 = new kotlin.jvm.internal.f0();
        f0Var3.f16326a = f0Var.p() & BodyPartID.bodyIdMax;
        int iE4 = f0Var.E() & HPKE.aead_EXPORT_ONLY;
        int iE5 = f0Var.E() & HPKE.aead_EXPORT_ONLY;
        int iE6 = 65535 & f0Var.E();
        f0Var.skip(8L);
        final kotlin.jvm.internal.f0 f0Var4 = new kotlin.jvm.internal.f0();
        f0Var4.f16326a = f0Var.p() & BodyPartID.bodyIdMax;
        String strM = f0Var.M(iE4);
        if (mh.x.s(strM, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j10 = f0Var3.f16326a == BodyPartID.bodyIdMax ? 8 : 0L;
        if (f0Var2.f16326a == BodyPartID.bodyIdMax) {
            j10 += 8;
        }
        if (f0Var4.f16326a == BodyPartID.bodyIdMax) {
            j10 += 8;
        }
        final g0 g0Var = new g0();
        final g0 g0Var2 = new g0();
        final g0 g0Var3 = new g0();
        final kotlin.jvm.internal.b0 b0Var = new kotlin.jvm.internal.b0();
        e(f0Var, iE5, new p() { // from class: ii.k
            @Override // eh.p
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                final f0 f0Var5 = f0Var;
                if (iIntValue == 1) {
                    kotlin.jvm.internal.b0 b0Var2 = b0Var;
                    if (b0Var2.f16318a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    b0Var2.f16318a = true;
                    if (jLongValue < j10) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    kotlin.jvm.internal.f0 f0Var6 = f0Var3;
                    long jZ = f0Var6.f16326a;
                    if (jZ == BodyPartID.bodyIdMax) {
                        jZ = f0Var5.z();
                    }
                    f0Var6.f16326a = jZ;
                    kotlin.jvm.internal.f0 f0Var7 = f0Var2;
                    f0Var7.f16326a = f0Var7.f16326a == BodyPartID.bodyIdMax ? f0Var5.z() : 0L;
                    kotlin.jvm.internal.f0 f0Var8 = f0Var4;
                    f0Var8.f16326a = f0Var8.f16326a == BodyPartID.bodyIdMax ? f0Var5.z() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    f0Var5.skip(4L);
                    final g0 g0Var4 = g0Var;
                    final g0 g0Var5 = g0Var2;
                    final g0 g0Var6 = g0Var3;
                    m.e(f0Var5, (int) (jLongValue - 4), new p() { // from class: ii.l
                        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Long] */
                        @Override // eh.p
                        public final Object invoke(Object obj3, Object obj4) throws IOException {
                            int iIntValue2 = ((Integer) obj3).intValue();
                            long jLongValue2 = ((Long) obj4).longValue();
                            if (iIntValue2 == 1) {
                                g0 g0Var7 = g0Var4;
                                if (g0Var7.f16327a != 0) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                }
                                if (jLongValue2 != 24) {
                                    throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                }
                                f0 f0Var9 = f0Var5;
                                g0Var7.f16327a = Long.valueOf(f0Var9.z());
                                g0Var5.f16327a = Long.valueOf(f0Var9.z());
                                g0Var6.f16327a = Long.valueOf(f0Var9.z());
                            }
                            return pg.f0.f21461a;
                        }
                    });
                }
                return pg.f0.f21461a;
            }
        });
        if (j10 > 0 && !b0Var.f16318a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strM2 = f0Var.M(iE6);
        String str = b0.f13033b;
        return new h(b0.a.a("/").e(strM), t.i(strM, "/", false), strM2, jP, f0Var2.f16326a, f0Var3.f16326a, iE, f0Var4.f16326a, iE3, iE2, (Long) g0Var.f16327a, (Long) g0Var2.f16327a, (Long) g0Var3.f16327a, 57344);
    }

    public static final void e(f0 f0Var, int i10, p pVar) throws IOException {
        hi.g gVar = f0Var.f13058b;
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iE = f0Var.E() & HPKE.aead_EXPORT_ONLY;
            long jE = f0Var.E() & 65535;
            long j11 = j10 - 4;
            if (j11 < jE) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            f0Var.u0(jE);
            long j12 = gVar.f13061b;
            pVar.invoke(Integer.valueOf(iE), Long.valueOf(jE));
            long j13 = (gVar.f13061b + jE) - j12;
            if (j13 < 0) {
                throw new IOException(y.a(iE, "unsupported zip: too many bytes processed for "));
            }
            if (j13 > 0) {
                gVar.skip(j13);
            }
            j10 = j11 - jE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h f(final f0 f0Var, h hVar) {
        int iP = f0Var.p();
        if (iP != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iP));
        }
        f0Var.skip(2L);
        short sE = f0Var.E();
        int i10 = sE & HPKE.aead_EXPORT_ONLY;
        if ((sE & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        f0Var.skip(18L);
        int iE = f0Var.E() & HPKE.aead_EXPORT_ONLY;
        f0Var.skip(f0Var.E() & 65535);
        if (hVar == null) {
            f0Var.skip(iE);
            return null;
        }
        final g0 g0Var = new g0();
        final g0 g0Var2 = new g0();
        final g0 g0Var3 = new g0();
        e(f0Var, iE, new p() { // from class: ii.j
            /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r12v14, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r12v16, types: [T, java.lang.Integer] */
            @Override // eh.p
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    f0 f0Var2 = f0Var;
                    byte b10 = f0Var2.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    long j10 = z10 ? 5L : 1L;
                    if (z11) {
                        j10 += 4;
                    }
                    if (z12) {
                        j10 += 4;
                    }
                    if (jLongValue < j10) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        g0Var.f16327a = Integer.valueOf(f0Var2.p());
                    }
                    if (z11) {
                        g0Var2.f16327a = Integer.valueOf(f0Var2.p());
                    }
                    if (z12) {
                        g0Var3.f16327a = Integer.valueOf(f0Var2.p());
                    }
                }
                return pg.f0.f21461a;
            }
        });
        return new h(hVar.f14551a, hVar.f14552b, hVar.f14553c, hVar.f14554d, hVar.f14555e, hVar.f14556f, hVar.f14557g, hVar.f14558h, hVar.f14559i, hVar.f14560j, hVar.f14561k, hVar.f14562l, hVar.f14563m, (Integer) g0Var.f16327a, (Integer) g0Var2.f16327a, (Integer) g0Var3.f16327a);
    }
}
